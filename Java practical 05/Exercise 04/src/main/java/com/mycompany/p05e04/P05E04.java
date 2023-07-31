package com.mycompany.p05e04;
public class P05E04 
{
    public static void main(String[] args) 
    {
        Circle c=new Circle(5.0);
        System.out.println("Area of a circle: "+c.calculateArea());
        c.display();
 
        Rectangle r=new Rectangle(3,4);
        System.out.println("Area of a rectangle: "+r.calculateArea());
        r.display();
    }
}
