package org.example.singleton;

public class SingletonSync {
    private static SingletonSync singletonSyncInstance;
    private SingletonSync(){}

    public static  SingletonSync getInstance() throws InterruptedException {
        if(singletonSyncInstance == null) {
            Thread.sleep(1000);
            synchronized(SingletonSync.class) {
                if(singletonSyncInstance == null) {
                    singletonSyncInstance = new SingletonSync();
                }
            }
        }
        return singletonSyncInstance;
    }
}
