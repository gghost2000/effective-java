package com.hjh.chap01.장점3;

public class WoodSword implements Sword {

    private String name;

    public WoodSword(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("나무 검 공격!!");
    }
}
