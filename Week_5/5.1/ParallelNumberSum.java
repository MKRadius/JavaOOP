import java.util.Random;;

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

public class ParallelNumberSum {
    public static void main(String[] args) {
        int range = 1000;
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
    }
}