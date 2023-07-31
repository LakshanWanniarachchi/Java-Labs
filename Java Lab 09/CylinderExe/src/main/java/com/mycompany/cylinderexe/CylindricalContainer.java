
package com.mycompany.cylinderexe;


public class CylindricalContainer extends Container {
    
    
  private double  Height  ;
  private double  Radius  ;
  
  
  public CylindricalContainer (double  Height ,double  Radius ) {
  
  this.Height = Height;
  this.Radius = Radius;
  
  
  }
  
  
  
  public double volume() {
  
  
  
  return Math.PI*this.Radius*this.Radius*this.Height; 
  
  }
  
    
    
}
