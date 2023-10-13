package com.mystudy.noname;

public class Car {
    private Tire tire1 = new Tire();

    //익명 자식 객체
    private Tire tire2 = new Tire(){
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
        }
    }; // 익명객체는 중괄호 끝에 ';' 이 있어야 한다.

    //메소드(필드 이용)
    public void run(){
        tire1.roll();
        tire2.roll();
    }

    //메소드(로컬 변수 이용)
    public void run2(){
        Tire tire = new Tire(){
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
            }
        };
        tire.roll();
    }

    //메소드(매개변수 이용)
    public void run3(Tire tire){
        tire.roll();
    }
}
