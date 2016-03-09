package com.company;

public class Main {

    //Nested Classes
    //Classes defined within a Class
    //Four types:
    //1. Static nested class
    //2. Inner class
    //3. Local inner class
    //4. Anonymous inner class
    public static void main(String[] args) {
        //Static:
        //Outer.Inner myObject = new Outer.Inner();
        //myObject.foo();

        //Inner:
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

    }
}
//1. Static nested class:
/*
class Outer{
    static class Inner{
        public void foo(){
            System.out.println("foo");
        }
    }

}
*/
//2. Inner class:
class Outer{
    class Inner{
        public void foo(){
            System.out.println("foo");
        }
    }

}











