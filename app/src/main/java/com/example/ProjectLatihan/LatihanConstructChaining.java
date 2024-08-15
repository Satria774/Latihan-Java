/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class Student
{
    public String aName;
    public int aMarks;
    
    //default constructor of the class
    public Student()
    {
        //this will call the constructor with String param
        this("Meghan");
    }
    public Student(String name){
        //call the constructor with (String,int) param
        this(name, 70);
    }
    public Student(String name, int marks){
        //call the constructor with (String,int) param
        this.aName=name;
        this.aMarks=marks;
    }
    void display(){
        System.out.println("Student Name: "+aName);
        System.out.println("Student Marks: "+aMarks);
    }
            
}
public class LatihanConstructChaining {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
    
}
