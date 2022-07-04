package com.hjh.chap01.장점3;


public interface Sword {

    void attack();

    // 하위 타입 객체를 반환 할 수 있다.
    static Sword createSword(String name) {
        return new WoodSword(name);
    }
}
