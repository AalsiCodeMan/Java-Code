package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result=1+2;
        System.out.println("1+2:"+result);
        int previousResult=result;
        System.out.println("PreviousResult:"+ previousResult);

        result-=1;
        System.out.println("3-1:"+result);
        System.out.println("PreviousResult:"+previousResult);

        result*=10;
        System.out.println("2*10:"+result);

        result/=5;
        System.out.println("20/5:"+result);

        result%=3;
        System.out.println("4%3:"+result);

    }
}
