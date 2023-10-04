package com.mystudy.learn.scanner;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("원하는 구구단 단수를 입력해 주세요(종료를 원하시면 '-1' 또는 '1'을 입력 해주세요.) : ");
            int dan = sc.nextInt();
            if (dan == 0 || dan == 1)
                break;
            System.out.println("===="+dan+ "단====");
            for (int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + dan*i);
            }
        }
    }
}
