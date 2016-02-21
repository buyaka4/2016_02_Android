package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {
        int x = 9;
//        int y;
//        //y needs to be 3 if x is less than 5, and 4 otherwise
//        if(x<5)
//            y = 3;
//        else
//            y = 4;
//
        int y = x<5 ? 3 : 4;


    }

    //in the following exercises, you may not use any mathematical
    //operator, other than +. Furthermore, you may assume that the
    //parameters are non-negative integers.
    //write the following functions:
    //1. distance, will return the distance between two integers
    //i.e: distance(5,8) returns 3.
    //2. write a function that will return the product of two integers
    //i.e product(5,8) return 40.
    //3. write a function that takes two parameters, x and y,
    // and should return how many whole times y fits in x.
    //i.e quotient(7,3) returns 2, quotient(3,7) returns 0.
    //4. write a function that takes two parameters, x and y,
    // and should return the remainder of x divided by y.
    // i.e remainder(7,3) returns 1, remainder(3,7) returns 3.
    // don't care to much about performance in this exercise.


    //in the next following exercises, you may use any mathematical
    //operator.

    //5. write a function that will take two integer parameters,
    // x and y, and will return x raised to the power of y
    // i.e power(3,3) returns 27, power(5,0) returns 1,
    // power(0,0) return -1.
    // write exercise 5 again, this time, you may not use for or while
    // meaning, you may not use loops, you may not call other functions
    //6. write a function that will take one integer parameter,
    //   and will return the squared root of that number.
    //i.e sqrt(9) returns 3, sqrt(10) returns 4.
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



    public static int distance(int x, int y){
        int small = x;
        int large = y;
        if(x>y){
            small = y;
            large = x;
        }
        int result = 0;
        while(small+result<large)
            result++;

        return result;
    }
    //error types:
    //1. syntax error
    //2. runtime exception
    //3. logical error, the function doesn't achieve what it is supposed to achieve
    //4. logical error, the function doesn't achieve what it is supposed to achieve
    //   but only for some of the parameters.
    //5. performance issue.


    public static int product(int x, int y){
        int small = x;
        int large = y;
        if(x>y){
            small = y;
            large = x;
        }
        int result = 0;
        for (int i = 0; i < small; i++) {
            result += large;
        }
        return result;
    }


    public static int quotient(int x, int y){
        if(y == 0){
            return -1;
        }
        int result = 0;
        int sum = y;
        while(sum <= x){
            sum += y;
            result++;
        }
        return result;
    }

    //                              7      3
    public static int remainder(int x, int y){
        if(y == 0){
            return -1;
        }

        return distance(x,product(quotient(x, y), y));
    }
    /*
    public static int power(int x, int y){
        if(x==0){
            if(y==0)
                return -1;
            return 0;
        }
        if(y==0 || x==1)
            return 1;

        int result = x;
        for (int i = 1; i < y; i++) {
            result *= x;
        }
        return result;
    }
    */
    public static int power(int x, int y){
        if(x==0){
            if(y==0)
                return -1;
            return 0;
        }
        if(y==0 || x==1)
            return 1;

        if(y==1)
            return x;
        return  x * power(x, y-1);
    }

    //power(7,4)
    //power(7,3)*7
    //power(7,2)*7*7
    //power(7,1)*7*7*7
    //7*7*7*7


}
//distance(7,product(quotient(7, 3), 3));
//distance(7,product(2, 3));
//distance(7, 6);
//1;