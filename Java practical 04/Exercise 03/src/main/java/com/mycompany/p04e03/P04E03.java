package com.mycompany.p04e03;
public class P04E03 
{
    public static void main(String[] args) 
    {
        Student obj1= new Student("Taylor Swift", 1234, "CS");
        System.out.println("Student: " +obj1.getName());
        System.out.println("ID: " + obj1.getID());
        System.out.println("Course: " + obj1.getCourse());
 
        Lecturer obj2 = new Lecturer("Shakira", 5678, "SE");
        System.out.println("\nLecturer: " + obj2.getName());
        System.out.println("ID: " + obj2.getID());
        System.out.println("Programme: " + obj2.getProg());
    }
}
