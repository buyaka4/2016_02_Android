package graphicshapes;


/**
 * Created by eladlavi on 02/03/2016.
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    private final static int DEFAULT_X = 20;
    private final static int DEFAULT_Y = 20;



    //access modifiers: Public Private Protected Default


    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        if(radius >= 0)
            this.radius = radius;
    }

    public Circle(int x, int y){
        this(x, y, 10);
    }

    public Circle(int radius){
        this(DEFAULT_X, DEFAULT_Y, radius);
    }

    public Circle(){
        this(DEFAULT_X , DEFAULT_Y);
    }

    @Override
    public double area(){
        //Math.PI is a constant, it is a final static field
        //of the class Main
        //(static means it belongs to the class as appose to
        // non-static which belongs to an object created from
        // the class).
        return Math.PI * this.radius * this.radius;
    }

    public void fillColor(byte red, byte green, byte blue){
        //System.out.println("color: " + color);
        System.out.println("fillColor1");
    }
    public void fillColor(float hue, float saturation, float brightness){
        System.out.println("fillColor2");
    }

    @Override
    public String toString() {
        return "center = ("+x+","+y+") and radius = " + radius;
    }



}
