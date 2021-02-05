package com.tg.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    private static int num;

    public static void main(String[] args) throws Exception {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(1, () -> {
            num = method();
        });

        cyclicBarrier.await();

        System.out.println("子线程的值：" + num);

        System.out.println("当前线程：" + Thread.currentThread().getName());

    }

    public static int method(){
        return 1;
    }
    
}

