package com.mycompany.p04e01;
public class Employee 
{
    private int empID;
    private String empName;
    private String empDesignation;
    
    public void setID(int empID)
    {
        this.empID=empID;
    }
    public int getID()
    {
        return empID;
    }
    public void setName(String empName)
    {
        this.empName=empName;
    }
    public String getName()
    {
        return empName;
    }
    public void setDesignation(String empDesignation)
    {
        this.empDesignation=empDesignation;
    }
    public String getDesignation()
    {
        return empDesignation;
    }

}
