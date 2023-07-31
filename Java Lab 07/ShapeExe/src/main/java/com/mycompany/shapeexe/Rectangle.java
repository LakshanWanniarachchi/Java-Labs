package com.mycompany.shapeexe;


public class Rectangle extends shape {
    
      
    private int a, b , total;
    public Rectangle (int a, int b) {
    
    this.a=a;
    this.b = b;
    
    
    
    }
    
    @Override
     public void calculateArea() {
     
      this.total = this.a*this.b;
      
     }
    
     
    @Override
     public void display() {
    
        System.out.println("Area is :"+this.total);
    
    }
             
        
}
