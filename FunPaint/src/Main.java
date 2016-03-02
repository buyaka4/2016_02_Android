import graphicshapes.Circle;

/**
 * Created by eladlavi on 02/03/2016.
 */
public class Main {

    public static void main(String[] args){
        //creating a reference/pointer:
        Circle myCircle;
        //create an object of type Circle, and making
        //out reference point to the newly created object.
        myCircle = new Circle();
        //creating an object is called: instantiation
        //from the word "instance".
        //it is also called, initialization
        System.out.println(myCircle);
        double a = myCircle.area();

    }

}
