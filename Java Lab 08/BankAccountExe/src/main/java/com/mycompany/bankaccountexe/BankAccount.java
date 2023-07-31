
package com.mycompany.bankaccountexe;


abstract class BankAccount  {
    

   private int accountNumber;
   private float balance;
   
   
 public void setAn(int aNum) {
     
     this.accountNumber = aNum;
 


}
 

  public void setBall(float aBall) {
     
     
     this.balance = aBall;
     
      

}
  

   public int getAn() {
     
     return this.accountNumber ;
 
     
     
     

}
 
 
  public float getBall() {
     
     
     return this.balance;
     
     
     

}
  
  
  public abstract void calculateInterest();
  
}





