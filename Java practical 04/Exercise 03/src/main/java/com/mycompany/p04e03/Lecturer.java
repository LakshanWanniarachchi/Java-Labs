package com.mycompany.p04e03;
public class Lecturer extends Person
{
    private String programme;
    public Lecturer(String name, int id, String programme) 
    {
        super(name, id);
        this.programme = programme;
    }
 
    public String getProg() 
    {
        return programme;
    }
    
    public void setProg(String programme) 
    {
        this.programme = programme;
    }
}
