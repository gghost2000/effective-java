package com.hjh.chap01.장점1;

public class Item {
    private int damage;
    private boolean permanent;

    private Item(int damage, boolean permanent) {
        this.damage = damage;
        this.permanent = permanent;
    }

    // 이름을 가질 수 있어서 명확한 의도를 알 수 있다.
    public static Item createPermanentItem(int damage) {
        return new Item(damage, true);
    }
}
