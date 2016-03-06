package graphicshapes;

/**
 * Created by eladlavi on 02/03/2016.
 */
public abstract class Shape {
    protected int color;
    public double costPerUnitOfArea;

    public abstract double area();

    public double totalCost(){
        return costPerUnitOfArea * area();
    }

}
