package com.mystudy.myclass.exam03;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("원하는 연산자와 계산을 원하는 두 숫자를 입력해주세요[ex)+ 3 5]");
        String a = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result1 = 0;
        double result2 = 0;
        switch(a.charAt(0)){
            case '+': result1 = myCalc.plus(a,x,y); break;
            case '-': result1 = myCalc.minus(a,x,y); break;
            case '*': result2 = myCalc.multiply(a,x,y); break;
            case '/': result2 = myCalc.divide(a,x,y); break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
