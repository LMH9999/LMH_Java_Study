package com.mystudy.learn.scanner;

public class Grade {
    public static void main(String[] args) {
        int score = 70 ;
        char grade = 0 ;
        if (score>=90)
            grade = 'A';
        else if (score>=80)
            grade = 'B';
        else if (score>=70)
            grade = 'C';
        else if (score>=60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("당신의 학점은 "+grade+"입니다.");
    }
}
