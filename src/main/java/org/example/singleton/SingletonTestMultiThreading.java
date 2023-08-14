package org.example.singleton;

public class SingletonTestMultiThreading {
    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            try {
                System.out.println(SingletonSync.getInstance().hashCode());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(()->{
            try {
                System.out.println(SingletonSync.getInstance().hashCode());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

        Thread t3 = new Thread(()->{
            try {
                System.out.println(SingletonSync.getInstance().hashCode());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t4 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                System.out.println(SingletonSync.getInstance().hashCode());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t3.start();
        t4.start();
    }
}
