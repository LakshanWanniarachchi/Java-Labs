package com.mycompany.p05e04;
public class Rectangle extends Shape
{
    private double length,width;
 
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
 
    public double calculateArea()
    {
        return length*width;
    }
}
