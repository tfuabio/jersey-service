package com.sample.shinyay.rest;

public enum MyIntegerEnum {
    one(1),
    two(2),
    three(3);

    private final Integer num;

    private MyIntegerEnum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }
}
