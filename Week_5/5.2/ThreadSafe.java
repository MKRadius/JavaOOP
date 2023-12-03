import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeArrayList<T> {
    private final List<T> list;

    public ThreadSafeArrayList() {
        this.list = Collections.synchronizedList(new ArrayList<>());
    }

    public synchronized void addElement(T element) {
        list.add(element);
    }

    public synchronized int getSize() {
        return list.size();
    }

    public synchronized void removeElement(T element) {
        list.remove(element);
    }

    public synchronized void printElements() {
        for (T element : list) {
            System.out.println(element);
        }
    }
}

public class ThreadSafe {
    public static void main(String[] args) {
        ThreadSafeArrayList<String> threadSafeList = new ThreadSafeArrayList<>();

        Runnable addTask = () -> {
            for (int i = 0; i < 5; i++) {
                threadSafeList.addElement("Element " + i);
            }
        };

        Runnable removeTask = () -> {
            for (int i = 0; i < 3; i++) {
                threadSafeList.removeElement("Element " + i);
            }
        };

        Thread addThread1 = new Thread(addTask);
        Thread addThread2 = new Thread(addTask);
        Thread removeThread = new Thread(removeTask);

        addThread1.start();
        addThread2.start();
        removeThread.start();

        try {
            addThread1.join();
            addThread2.join();
            removeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final size: " + threadSafeList.getSize());
        threadSafeList.printElements();
    }
}
