package com.tg.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {

    public static void main(String[] args) throws Exception {
        FutureTask futureTask = new FutureTask<>(new Task1());
        new Thread(futureTask).start();

        System.out.println("子线程的值：" + futureTask.get());
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }
}

class Task1 implements Callable {

    @Override
    public Object call() throws Exception {
        return 1;
    }
}
