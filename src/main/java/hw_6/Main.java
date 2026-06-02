package hw_6;

import hw_6.model.CustomThreadPool;

public class Main {

    public static void main(String[] args) {

        CustomThreadPool pool = new CustomThreadPool(3);

        for (int i = 1; i <= 10; i++) {

            int taskId = i;

            pool.execute(() -> {

                System.out.println(
                        Thread.currentThread().getName() +
                                " executes task " +
                                taskId
                );

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}