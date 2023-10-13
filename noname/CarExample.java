package com.mystudy.noname;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        car.run2();

        car.run3(new Tire(){
            public void roll(){
                System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
            }
        });
    }
}
