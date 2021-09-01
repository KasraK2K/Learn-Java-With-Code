package com.kevin;

public class MyRunnable implements Runnable {
    public static int amount = 0;

    public  static void main(String[] args) {
        MyRunnable myObj = new MyRunnable();
        Thread thread = new Thread(myObj);
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public  void run() {
        amount++;
    }

}
