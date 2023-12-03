import java.util.Random;
import java.util.ArrayList;

class SingleThreadProcess extends Thread {
    private int[][] arr;
    private long startTime;
    private long endTime;
    private int sum;

    public SingleThreadProcess(int[][] arr) {
        this.arr = arr;
    }

    public void setStartTime() {
        this.startTime = System.nanoTime();
    }

    public void setEndTime() {
        this.endTime = System.nanoTime();
    }

    public double getTime() {
        return (this.endTime - this.startTime) * 10e-6;
    }

    public int getSum() {
        return this.sum;
    }

    public void run() {
        this.setStartTime();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        Thread.yield();

        this.setEndTime();
    }

    public void execute() {
        this.start();
        
        try {
            this.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum: " + this.getSum() + " - Elapsed time: " + String.format("%.3f", this.getTime()) + " ms.");
    }
}

class MultipleThreadProcess extends Thread {
    private int[][] arr;
    private long startTime;
    private long endTime;
    private int sum;
    
    private int coreCount;
    private ArrayList<SingleThreadProcess> threadList = new ArrayList<SingleThreadProcess>();


    public MultipleThreadProcess(int[][] arr) {
        this.arr = arr;
        this.coreCount = Runtime.getRuntime().availableProcessors();
    }

    public void setStartTime() {
        this.startTime = System.nanoTime();
    }

    public void setEndTime() {
        this.endTime = System.nanoTime();
    }

    public double getTime() {
        return (this.endTime - this.startTime) * 10e-6;
    }

    public int getSum() {
        return this.sum;
    }

    public int getCoreCount() {
        return this.coreCount;
    }

    public void coreWorkSplit() {
        int xRange = arr.length / this.getCoreCount();
        int yRange = arr[0].length;

        for (int i = 0; i < this.getCoreCount(); i++) {
            int[][] tempArr = new int[xRange][yRange];

            for (int j = 0; j < xRange; j++) {
                for (int k = 0; k < yRange; k++) {
                    tempArr[j][k] = arr[j + (i * xRange)][k];
                }
            }

            SingleThreadProcess stp = new SingleThreadProcess(tempArr);
            threadList.add(stp);
        }
    }

    public void run() {
        this.coreWorkSplit();

        this.setStartTime();

        for (SingleThreadProcess stp : threadList) {
            stp.start();
        }

        for (SingleThreadProcess stp : threadList) {
            try {
                stp.join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.sum += stp.getSum();
        }

        this.setEndTime();
    }

    public void execute() {
        this.start();

        try {
            this.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum: " + this.getSum() + " - Elapsed time: " + String.format("%.3f", this.getTime()) + " ms.");
    }
}

public class ParallelNumberSum {
    public static void main(String[] args) {
        int range = 5000;
        int[][] arr = new int[range][range];
        Random random = new Random();

        // Fill array with random numbers between 1 and 10
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                arr[i][j] = random.nextInt(1, 10);
            }
        }

        // Calculate with single thread
        SingleThreadProcess stp = new SingleThreadProcess(arr);
        System.out.print("1 Thread(s): ");
        stp.execute();


        // Re-calculate with new array to examine time difference
        SingleThreadProcess stpNew = new SingleThreadProcess(arr);
        System.out.print("1 Thread(s): ");
        stpNew.execute();


        // Now calculate with multiple threads
        MultipleThreadProcess mtp = new MultipleThreadProcess(arr);
        System.out.print(mtp.getCoreCount() + " Thread(s): ");
        mtp.execute();
    }
}