package com.lr.blog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Blog {
    @Value("${blog.value}")
    private String value;
    @Value("${blog.number}")
    private int number;
    @Value("${blog.bignumber}")
    private long bigNum;
    @Value("${blog.randomUnder10}")
    private double randomUnder10;
    @Value("${blog.randomBetween10And20}")
    private double randomBetween10And20;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBigNum() {
        return bigNum;
    }

    public void setBigNum(long bigNum) {
        this.bigNum = bigNum;
    }

    public double getRandomUnder10() {
        return randomUnder10;
    }

    public void setRandomUnder10(double randomUnder10) {
        this.randomUnder10 = randomUnder10;
    }

    public double getRandomBetween10And20() {
        return randomBetween10And20;
    }

    public void setRandomBetween10And20(double randomBetween10And20) {
        this.randomBetween10And20 = randomBetween10And20;
    }
}
