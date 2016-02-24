package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    //7. write a function that will take one integer parameters,
    //   and will return the sum of its digits.
    //i.e sumOfDigits(123) returns 6
    //8. ....... and will return the largest digit of a number.
    //i.e largestDigit(123) returns 3
    //9. ...... and will return the number in
    // reverse order of the digits.
    //i.e reverseDigits(123) returns 321
    //i.e reverseDigits(120) returns 21
    //10. write a function that will draw a rectangle on the screen
    //    using * (print " ") to space between *.
    //11. do exercise 10 again, this time, there are two more parameters
    //    x and y, x will move the rectangle right, and y,
    //    will move the rectangle down.
    //12. draw a circle (for Shalom), parameters: radius

    public static void drawRectangle(int width, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print((i==0 || i==height-1 || j==0
                        || j==width-1) ? "*" : " ");
                //System.out.print("("+j+","+i+")");
            }
            System.out.println();
        }
    }

    public static void drawRectangle2(int width, int height){
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < height - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
    }
}
