package com.mystudy.myclass.exam04;

//인스턴스 멤버 및 this
public class Car {
    //필드 선언
    String model ;
    int speed;

    public Car(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void run(){
        this.setSpeed(100); // this 생략 가능
        System.out.println(this.model+"가 달립니다.(시속 : "+this.speed+"km/h)"); // this 생략 가능
    }
}
