package com.company;

public class Main {

    public static void main(String[] args) {


        Number[] myNumbers = new Number[4];
        myNumbers[0] = new Double(8.6);
        myNumbers[1] = new Integer(3);
        myNumbers[2] = new Float(3.2f);
        myNumbers[3] = new RationalNumber(1,5);
        System.out.println(sum(myNumbers));


        Animal a = new Dog();

        Dog d = (Dog)a;
        d.bark();


        //((Dog)a).bark();

        Cat myCat = (Cat)a;
        myCat.growl();


        //Circle c3 = (Circle)a;


        //the list of methods that you may invoke, is determined by the type
        //of the pointer

        a.eat("bonzo");

        //but, when a method is invoked, the method that is actually invoked
        //is determined by the type of the actual object. not by the pointer.

    }

    public static double sum(Number[] nums){
        double sum = 0.0;

        for (Number num : nums) {
            sum += num.doubleValue();
        }


        return sum;
    }
}

class RationalNumber extends Number{

    private int numerator;//mone
    private int denominator; //mehane

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        if(denominator == 0) {
            this.denominator = 1;
            this.numerator = Integer.MAX_VALUE;
        }
        else
            this.denominator = denominator;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        double num = this.numerator;
        double deno = this.denominator;

        return num / deno;
    }


}


class Animal{
    void goToSleep(){
        System.out.println("going to sleep");
    }
    void eat(String food){
        System.out.println("eating " + food);
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("waf waf...");
    }

    @Override
    void eat(String food) {
        System.out.print("yam yam ");
        super.eat(food);
    }
}

class Cat extends Animal{
    void growl(){

    }
}

class Circle{

}



















