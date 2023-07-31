
package com.mycompany.bankaccountexe;


public class SavingAccount extends BankAccount{
    
    
  private final int SInterrest =12;
    
  @Override
    public  void calculateInterest(){
    
        System.out.println("Saving Account Interrest is :"+(SInterrest*getBall())/100);
    
    
     }
    
    
    
    
}
