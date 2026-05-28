package hw_6.model;

import java.util.Queue;

public class Worker extends Thread {

    private final Queue<Runnable> tasks;

    public Worker(Queue<Runnable> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {

            Runnable task;

            synchronized (tasks) {

                while (tasks.isEmpty()) {

                    try {
                        tasks.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                task = tasks.poll();
            }

            try {
                task.run();
            } catch (Exception e) {
                System.out.println("Task error: " + e.getMessage());
            }
        }
    }
}