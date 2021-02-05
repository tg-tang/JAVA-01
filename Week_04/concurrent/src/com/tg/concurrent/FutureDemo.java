package com.tg.concurrent;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(new Task());

        System.out.println("子线程的值：" + future.get());

        System.out.println("当前线程：" + Thread.currentThread().getName());
    }
}

class Task implements Callable{

    @Override
    public Object call() throws Exception {
        return 1;
    }
}
