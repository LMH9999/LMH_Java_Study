package com.mystudy.myclass.exam03;

public class Calculator {

    int plus(String a,int x, int y){
        int result = x+y;
        System.out.println(x+a+y+" = "+result);
        return result;
    }
    int minus(String a,int x, int y){
        int result = x-y;
        System.out.println(x+a+y+" = "+result);
        return result;
    }
    int multiply(String a,int x, int y){
        int result = x*y;
        System.out.println(x+a+y+" = "+result);
        return result;
    }
    double divide(String a,int x, int y){
        double result = (double)x/y;
        System.out.println(x+a+y+" = "+result);
        return result;
    }
}
