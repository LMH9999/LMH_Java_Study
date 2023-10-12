package com.mystudy.abstr;

public class Dog extends Animal{
    //abstract는 재정의 하지 않으면 오류
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
