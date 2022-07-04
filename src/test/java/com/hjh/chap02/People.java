package com.hjh.chap02;

public class People {
    private final int age;
    private final String gender;
    private final String name;

    public static class Builder {
        // 필수 매개변수
        private final int age;
        private final String gender;

        //선택 매개변수
        private String name;

        public Builder(int age, String gender) {
            this.age = age;
            this.gender = gender;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public People build() {
            return new People(this);
        }
    }

    private People(Builder builder) {
        age = builder.age;
        gender = builder.gender;
        name = builder.name;
    }
}
