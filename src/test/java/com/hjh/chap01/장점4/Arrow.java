package com.hjh.chap01.장점4;

public interface Arrow {

    // 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환 할 수 있다.
    static Arrow createArrow(int degree) {
        if (degree >= 100 ) {
            return new FireArrow();
        } else {
            return new NormalArrow();
        }
    }
}
