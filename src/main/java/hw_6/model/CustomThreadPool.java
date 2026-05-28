package hw_6.model;

import java.util.LinkedList;
import java.util.Queue;

public class CustomThreadPool {

    private final Queue<Runnable> tasks = new LinkedList<>();

    public CustomThreadPool(int threadCount) {

        Worker[] workers = new Worker[threadCount];

        for (int i = 0; i < threadCount; i++) {
            workers[i] = new Worker(tasks);
            workers[i].start();
        }
    }

    public void execute(Runnable task) {

        synchronized (tasks) {

            tasks.add(task);

            tasks.notify();
        }
    }
}