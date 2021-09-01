package com.kevin;

public class MyThread extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}

