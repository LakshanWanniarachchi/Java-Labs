
package com.mycompany.bankaccountexe;


public class CheckingAccount extends BankAccount {
    
    
    private final int CInterrest =2;
    
    @Override
    public  void calculateInterest(){
    
        System.out.println("Saving Account Interrest is :"+(CInterrest*getBall())/100);
    
    
     }
    
    
}
