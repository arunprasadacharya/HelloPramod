package com.company;

public class Calculator {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println(add(4,2));
        System.out.println(sub(5,2));
        System.out.println(mul(5,2));
        System.out.println(div(5,2));
    }
}
