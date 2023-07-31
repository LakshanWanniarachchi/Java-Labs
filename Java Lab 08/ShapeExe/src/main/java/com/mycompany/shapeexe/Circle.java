
package com.mycompany.shapeexe;


public class Circle implements Shape {
    
    private double r;
    
    public void setData(double r) {
    
    this.r=r;

    }
    
    public double getData() {
    
    return this.r;

    }
    
   
    
    
    @Override
     public double calculateArea(){
     
     
     return Math.PI*this.r*this.r;
     
     }
    
     
    @Override
      public  double calculatePerimeter() {
      
      return 2*Math.PI*this.r;
      
      
      }
    
    
}
