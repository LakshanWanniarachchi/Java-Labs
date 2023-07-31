

package com.mycompany.bankaccountexe;


public class BankAccountExe {

    public static void main(String[] args) {
       
       SavingAccount s = new SavingAccount();
       s.setAn(25789643);
       s.setBall(1000000.00f);
       
       s.calculateInterest();
        
       CheckingAccount c = new  CheckingAccount();
       c.setAn(54239867);
       c.setBall(2000000);
       c.calculateInterest();
        
    }
}
