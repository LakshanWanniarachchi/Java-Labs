package com.mycompany.p04e03;
public class Student extends Person
{
    private String course;
 
    public Student(String name, int id, String course) 
    {
        super(name, id);
        this.course = course;
    }
    
    public String getCourse() 
    {
        return course;
    }
 
    public void setCourse(String course) 
    {
        this.course = course;
    }
}
