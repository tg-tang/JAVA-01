package com.tg.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Integer num = CompletableFuture.supplyAsync(() -> {
            return method();
        }).get();

        System.out.println("子线程的值：" + num);
        System.out.println("当前线程：" + Thread.currentThread().getName());

    }

    public static int method(){
        return 1;
    }
}
