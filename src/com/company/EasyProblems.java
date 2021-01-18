package com.company;

public class EasyProblems {
    static int num1 = 34;
    static int num2 = 45;

    public static void P1(){
        System.out.println(num1+num2);
        
    }

    public static void P2(){
        int sum = 0;
        int n = 35;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
    }

    public static void P3(){
        int factorial = 5;
        int sum = 1;
        for(int i = 1; i<=factorial; ++i){
            sum=sum*i;

        }
        System.out.println(sum);
    }

    public static void P4(){
        int[] array = {2,3,4,2,4,1,6,7,9,3,7,3,4,2,2,3,6,9,6,1,3,5,3,4};
        int num = -1;
        for(int i = 0; i< array.length; ++i){
            if(array[i]==0){
                num = i;
                break;
            }
        }
    }

    public static void P5(){
        String string = "Hello";
        for(int i = string.length(); i>0; ++i){}{

        }
    }
}

