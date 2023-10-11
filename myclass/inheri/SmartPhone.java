package com.mystudy.myclass.inheri;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super(model,color); // 부모의 생성자가 매개변수가 있으면 반드시 super() 작성, 없다면 생략 가능
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String mode1, String color) 생성자 실행됨");
    }
}
