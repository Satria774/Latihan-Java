/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class Employee{
    int id;
    String name;
    
    Employee(int i, String n)
    {
        id=i;
        name=n;
    }
    
    void display(){
        System.out.println(id+" "+name);
    }
}
public class LatihanParameterizedConstruct {
    public static void main(String[] args) {
        Employee e1=new Employee(2, "Alex");
        Employee e2=new Employee(10, "Annie");
        e1.display();
        e2.display();
    }
}
