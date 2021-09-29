package com.company;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=100;
        System.out.println("Prime numbers between 1 and " + num);

        //loop through the numbers one by one
        for(int i=1; i < num; i++){

            boolean isPrime = true;

            //check to see if the number is prime
            for(int j=2; j < i ; j++){

                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            // print the number
            if(isPrime)
                System.out.print(i + " ");
        }
    }
}

