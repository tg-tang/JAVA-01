package com.tg.concurrent;

import java.util.concurrent.Semaphore;

public class SemphereDemo {

    public static int num;

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(0);
        new Thread(() -> {
            num = method();
            semaphore.release();
        }).start();

        try {
            semaphore.acquire();
            System.out.println("子线程的值：" + num);
            System.out.println("当前线程：" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static int method(){
        return 1;
    }
}
