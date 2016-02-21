package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("the distance between 5 and 8 is " + distance(5,8));
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
}
//distance(7,product(quotient(7, 3), 3));
//distance(7,product(2, 3));
//distance(7, 6);
//1;