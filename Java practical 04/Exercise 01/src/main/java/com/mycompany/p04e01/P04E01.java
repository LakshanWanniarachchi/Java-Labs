package com.mycompany.p04e01;
public class P04E01 
{
    public static void main(String[] args) 
    {
        Employee obj1=new Employee();
        Employee obj2=new Employee();
        
        obj1.setID(123);
        obj1.setName("Mr.Bogdan");
        obj1.setDesignation("Clerk");
        
        obj2.setID(456);
        obj2.setName("Ms.Bird");
        obj2.setDesignation("Attendent");
        
        System.out.println("Employee ID is "+obj1.getID());
        System.out.println("Employee Name is "+obj1.getName());
        System.out.println("Employee Designation is "+obj1.getDesignation());
        System.out.println("Employee ID is "+obj2.getID());
        System.out.println("Employee Name is "+obj2.getName());
        System.out.println("Employee Designation is "+obj2.getDesignation());        
    }

}
