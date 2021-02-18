package com.company;

import java.util.Scanner;

public class Area_Calculator {
    public static void AreaCal(){
        Scanner in = new Scanner(System.in);
        System.out.print("What is the height");
        int height = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("What is the length");
        int length = in2.nextInt();

        int trianglearea = (length*height)/2;
        int triangleperimeter = (int)(Math.sqrt(Math.pow(length, 2)*Math.pow(height, 2)))+length+height;
        System.out.println("The perimeter of the triangle is "+triangleperimeter+" and the area is "+trianglearea);
    }
}
