package org.example.test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrays implements Runnable{
    private static int a=100;
    public static void main(String[] args)  {
        System.out.println("主线程进入");
       new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("run2");
               a--;
               System.out.println(a);
           }
       }).start();
        System.out.println("主线程进入");
       new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("run2");
               a--;
               System.out.println(a);
           }
       }).start();


    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("run2");
        a--;
        System.out.println(a);
    }
}
