package com.mystudy.learn.scanner;

import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 점수는? : ");
        int score = sc.nextInt();
        char grade = 0;
        switch (score/10){
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("당신의 학점은 "+grade+"입니다.");
    }
}
