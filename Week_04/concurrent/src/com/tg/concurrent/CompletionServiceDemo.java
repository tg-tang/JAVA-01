package com.tg.concurrent;

import java.util.concurrent.*;

public class CompletionServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorCompletionService<Integer> executorCompletionService = new ExecutorCompletionService<>(executorService);
        Future<Integer> submit = executorCompletionService.submit(() -> {
            return method();
        });

        System.out.println("子线程的值：" + submit.get());
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }

    public static int method(){
        return 1;
    }
}
