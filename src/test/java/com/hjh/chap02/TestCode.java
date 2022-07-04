package com.hjh.chap02;


import org.junit.jupiter.api.Test;

public class TestCode {

    @Test
    public void peopleBuildTest() {
        People people = new People.Builder(10, "남성").name("이름").build();

    }
}
