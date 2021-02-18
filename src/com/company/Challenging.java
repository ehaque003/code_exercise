package com.company;

import java.util.Scanner;

public class Challenging {
    public static void P1(){
        Scanner in = new Scanner(System.in);
        System.out.print("What is the word: ");
        String word = in.nextLine();
        boolean isPlalindrome = true;
        char[] wordchar = word.toCharArray();
        int i;
        for(i = 0; i<wordchar.length; ++i){
            if(wordchar[i]==wordchar[wordchar.length-1-i]){
                for(int j = i; j<= wordchar.length-1-i; ++j){
                    if(wordchar[j]!=wordchar[wordchar.length-j-1]){
                        break;
                    }
                }
            }
        }
        for(int j = i; j <= wordchar.length-i-1; ++i){
            System.out.print(wordchar[j]);
        }
    }
}
