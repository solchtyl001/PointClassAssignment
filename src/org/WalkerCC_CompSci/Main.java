package org.WalkerCC_CompSci;

public class Main {

    public static void main(String[] args) {

        //Create a point
        Point a = new Point(3,5);
        //Create another point
        Point b = new Point(-2, 7);


        double x_coordinate = a.getX();
        double y_coordinate = a.getY();

        b.FlipVertical();

        System.out.println("Point b's new x-coordinate is " + b.getX());
        System.out.println("Point b's new y-coordinate is " + b.getY());

        b.FlipHorizontal();

        System.out.println("Point b's new x-coordinate is " + b.getX());
        System.out.println("Point b's new y-coordinate is " + b.getY());

        a.Translate(2, -1);

        System.out.println("Point a's new x-coordinate is " + a.getX());
        System.out.println("Point a's new y-coordinate is " + a.getY());



    }
    
    public class Point {
    private double x = 0;
    private double y = 0;

    public Point(double x, double y){
     this.x = x;
     this.y = y;

    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y ;
    }

    public void FlipVertical() {

        this.x *= 1;
    }

    public void FlipHorizontal() {
        this.x *= -1;
    }

    public void Translate(double xChange, double yChange){
        this.x += xChange;
                this.y += yChange;

    }
}
}
