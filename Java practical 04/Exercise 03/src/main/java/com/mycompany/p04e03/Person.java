package com.mycompany.p04e03;
public class Person 
{
    private String name;
    private int id;
    
    public Person(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }
 
    public String getName() 
    {
        return name;
    }
 
    public void setName(String name) 
    {
        this.name = name;
    }
 
    public int getID() 
    {
        return id;
    }
 
    public void setID(int id) 
    {
        this.id = id;
    }
}
