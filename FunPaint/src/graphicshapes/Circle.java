package graphicshapes;


/**
 * Created by eladlavi on 02/03/2016.
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    //access modifiers: Public Private Protected Default

    public Circle(){
        x = 20;
        y = 20;
        radius = 10;
    }

    public double area(){
        //Math.PI is a constant, it is a final static field
        //of the class Main
        //(static means it belongs to the class as appose to
        // non-static which belongs to an object created from
        // the class).
        return Math.PI * radius * radius;
    }

    void fillColor(){
        System.out.println("color: " + color);
    }

    @Override
    public String toString() {
        return "center = ("+x+","+y+") and radius = " + radius;
    }
}
