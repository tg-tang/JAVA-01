package com.tg.concurrent;

import java.util.concurrent.Callable;

public class CallableDemo {

    public static void main(String[] args) throws Exception {

        Integer num = new Callable<Integer>() {
            @Override public Integer call() throws Exception {
                return method();
            }
        }.call();

        System.out.println("子线程的值：" + num);
        System.out.println("当前线程：" + Thread.currentThread().getName());

    }

    public static int method(){
        return 1;
    }
}
