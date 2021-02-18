package com.company;

import java.util.Locale;
import java.util.Scanner;

public class ModerateProblems {
    static int test = 45;
    public static void P1(){
        if(test%3==0){
            System.out.println("Fizz");
        }
        if(test%5==0){
            System.out.println("Buzz");
        }

    }
    public static void P2(){
        int num = 0;
        for(int i = 2; i<test; ++i){
            if(test%i==0){
                ++num;
            }
        }
        if(num==0){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }

    }

    public static void P3(){
        int temp1 = 0;
        int temp2 = 1;
        int temp3;
        for(int i = 0; i<test; ++i){
            temp3=temp1+temp2;
            temp1=temp2;
            temp2=temp3;
        }
    }

    public static void P4(){
        Scanner in = new Scanner(System.in);
        System.out.print("What is your number or word: ");
        String input = in.nextLine();
        input = input.toLowerCase(Locale.ROOT);
        Boolean isPlalindrome = true;
        for(int i = 0; i<input.length(); ++i){
            if(input.charAt(i)!=input.charAt(input.length()-1-i)){
                isPlalindrome = false;
                System.out.println("This is not a palindrome.");
                break;
            }
        }
        if(isPlalindrome){
            System.out.println("This is a palindrome");
        }
    }

    public static void P6(){
        Scanner in1 = new Scanner(System.in);
        System.out.print("What is the first number: ");
        int num1 = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("What is the second number: ");
        int num2 = in2.nextInt();
        int max = 1;
        if(num2>num1){
            for(int i = 2; i<=num1; ++i){
                if(num1%i==0&&num2%i==0){
                    max=i;
                }
            }
            System.out.println("The GCD of "+num1+" and "+num2+" is "+max+".");
        }
        else{
            for(int i = 2; i<=num2; ++i){
                if(num1%i==0&&num2%i==0){
                    max=i;
                }
            }
            System.out.println("The GCD of "+num2+" and "+num1+" is "+max+".");
        }
    }
    public static void P7(){
        Scanner in = new Scanner(System.in);
        System.out.print("What is the amount of rice in kilos you want to try to split up: ");
        int goal = in.nextInt();
        int big = 5;
        int small = 1;
        boolean result = false;
        if (big * 5 >= goal) {
            if (small >= goal % 5)
                result = true;
        } else {
            if (small >= goal - big * 5) {
                result = true;
            }
        }
    }
    public static void P10(){
        Scanner in = new Scanner(System.in);
        System.out.print("Is this a going or a receiving message: ");
        String codeordecode = in.nextLine();
        codeordecode=codeordecode.trim();
        codeordecode=codeordecode.toLowerCase(Locale.ROOT);
        String message;
        String codemessage;
        if(codeordecode.contains("going")){
            Scanner in1 = new Scanner(System.in);
            System.out.println("Do not use characters / and ~");
            System.out.print("What is the going message: ");
            message = in.nextLine();
            message.toLowerCase(Locale.ROOT);
            char[] messagechar = message.toCharArray();
            char[] codemessagechar = new char[messagechar.length];
            for(int i = 0; i<messagechar.length; ++i){
                if(messagechar[i]=='y'){
                    codemessagechar[i]='a';
                }
                else if(messagechar[i]=='z'){
                    codemessagechar[i]='b';
                }
                else if(messagechar[i]=='8'){
                    codemessagechar[i]='0';
                }
                else if(messagechar[i]=='9'){
                    codemessagechar[i]='1';
                }
                else if(messagechar[i]=='.'){
                    codemessagechar[i]='/';
                }
                else if(messagechar[i]==' '){
                    codemessagechar[i]='~';
                }
                else{
                    codemessagechar[i]=(char)(messagechar[i]+2);
                }
            }
            System.out.print("The coded message for your receiver is: ");
            for(int i = 0; i<codemessagechar.length; ++i){
                System.out.print(codemessagechar[i]);
            }

        }
        else if(codeordecode.contains("receiving")){
            Scanner in1 = new Scanner(System.in);
            System.out.print("What is the receiving message: ");
            message = in.nextLine();
            message.toLowerCase(Locale.ROOT);
            char[] messagechar = message.toCharArray();
            char[] codemessagechar = new char[messagechar.length];
            for(int i = 0; i<messagechar.length; ++i){
                if(messagechar[i]=='a'){
                    codemessagechar[i]='y';
                }
                else if(messagechar[i]=='b'){
                    codemessagechar[i]='z';
                }
                else if(messagechar[i]=='0'){
                    codemessagechar[i]='8';
                }
                else if(messagechar[i]=='1'){
                    codemessagechar[i]='9';
                }
                else if(messagechar[i]=='/'){
                    codemessagechar[i]='.';
                }
                else if(messagechar[i]=='~'){
                    codemessagechar[i]=' ';
                }
                else{
                    codemessagechar[i]=(char)(messagechar[i]-2);
                }
            }
            System.out.print("The coded message from your sender is: ");
            for(int i = 0; i<codemessagechar.length; ++i) {
                System.out.print(codemessagechar[i]);
            }
        }
        else{
            System.out.println("Please use terms like going or receiving. :)");
        }
    }
    public static void P12(){
        int[] arraynum = {1,3,5,7,8};
        int sum = 0;
        for(int i = 0; i<arraynum.length; ++i){
            for(int j = 0; j< arraynum.length- i-1; ++j){
                sum=sum+arraynum[i]+arraynum[j];
            }
        }
    }
}
