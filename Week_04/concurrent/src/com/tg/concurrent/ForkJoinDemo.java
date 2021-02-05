package com.tg.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool(1);
        ForkJoinTask<Integer> forkJoinTask = (ForkJoinTask<Integer>) forkJoinPool.submit(() -> {
            return method();
        });

        System.out.println("子线程的值：" + forkJoinTask.get());
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }

    public static int method(){
        return 1;
    }
}
