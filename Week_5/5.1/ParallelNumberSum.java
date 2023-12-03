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

        for (int i = 0; i < this.getCoreCount(); i++) {
            threadList.get(i).start();
        }

        for (int i = 0; i < this.getCoreCount(); i++) {
            try {
                threadList.get(i).join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.sum += threadList.get(i).getSum();
        }

        this.setEndTime();
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
}

public class ParallelNumberSum {
    public static void main(String[] args) {
        int range = 10000;
        int[][] arr = new int[range][range];
        Random random = new Random();

        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                arr[i][j] = random.nextInt(1, 100);
            }
        }

        SingleThreadProcess stp = new SingleThreadProcess(arr);

        stp.start();
        
        try {
            stp.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Calculated sum: " + stp.getSum() + " - Elapsed time: " + stp.getTime() + " ms.");


        MultipleThreadProcess mtp = new MultipleThreadProcess(arr);

        System.out.println(mtp.getCoreCount());

        mtp.start();

        try {
            mtp.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Calculated sum: " + mtp.getSum() + " - Elapsed time: " + mtp.getTime() + " ms.");
    }
}