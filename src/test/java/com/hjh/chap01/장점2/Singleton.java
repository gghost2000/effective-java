package com.hjh.chap01.장점2;

// 호출 될 때 마다 새로 생성하지 않아도 된다
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
