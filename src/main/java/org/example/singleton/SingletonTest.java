package org.example.singleton;

public class SingletonTest {
    public static void main(String[] args) throws InterruptedException {
       // Test singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        //In single threaded environment both instance will be same.
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());


    }
}
