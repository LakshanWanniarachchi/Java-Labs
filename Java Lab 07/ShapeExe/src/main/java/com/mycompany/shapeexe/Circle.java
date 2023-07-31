package com.mycompany.shapeexe;


 class Circle extends shape {
    
    private float r, total;
    public Circle (float r) {
    
     this.r = r;
    
    
    
    }
    
    @Override
     public void calculateArea() {
     
      this.total = (float)((3.14)*r*r);
      
      
     }
    
     
    @Override
     public void display() {
    
        System.out.println("Area is :"+this.total);
    
    }
             
     
     
    
    
}
