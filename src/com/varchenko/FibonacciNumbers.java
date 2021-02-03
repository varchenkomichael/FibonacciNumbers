package com.varchenko;

public class FibonacciNumbers {
    public static void main(String[] args){
      for (int index = 0; index<25; index++) {
            System.out.println(f(index));
        }
    }
    public static int f(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return f(n-1) + f(n-2);
    }
}

