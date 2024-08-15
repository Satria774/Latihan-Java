/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class Name{
    String first, last;
    
    public Name(String first, String last){
        this.first=first;
        this.last=last;
    }
}

class EmployeeInfo{
    int id;
    Name name;

    EmployeeInfo(int id, Name name) {
        this.id=id;
        this.name=name;
    }
    
    void display(){
        System.out.println("Employee id is "+id);
        System.out.println("Name of Employee "+name.first+" "+name.last);
    }  
}

public class LatihanHasRelationship {
    public static void main(String[] args) {
        Name name = new Name("Alex","Desouza");
        EmployeeInfo ei=new EmployeeInfo(1, name);
        ei.display();
    }
}
