package com.tg.concurrent;

public class JoinDemo {

    public static int num;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            num = method();
        });
        thread.start();

        thread.join();

        System.out.println("子线程的值：" + num);
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }

    public static int method(){
        return 1;
    }

}

