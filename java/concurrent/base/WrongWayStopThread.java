package com.imooc.concurrent.base;

public class WrongWayStopThread extends Thread {
    public static void main(String[] args){
        WrongWayStopThread thread = new WrongWayStopThread();
        System.out.println("Starting thread...");
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Interrupting thread...");
        thread.interrupt();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stopping application...");
    }

    @Override
    public void run() {
        //使用特殊的退出旗标，线程是否被中断，但是这是不推荐使用的方法，原因见下面
        while (!this.isInterrupted()){
            System.out.println("Thread is running...");
            long time = System.currentTimeMillis();
            while ((System.currentTimeMillis()-time<1000)){
                //减少屏幕输出的空循环，相当于Thread.sleep(1000);的效果
            }

           /*//当线程由于调用了某些方法（如sleep，wait，join）而进入阻塞状态之时，调用interrupt方法会导致线程的中断状态被清除而不是被设置，线程会无法停止，sleep方法将会收到一个错误异常
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
