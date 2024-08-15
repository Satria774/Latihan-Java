/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class ClassInfo{
    int rollno;
    String name;
    
    ClassInfo(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    void display(){
        System.out.println(rollno+" "+name);
    }
}
class Message{
    Message(){
        this("Annie");
        System.out.println("Welcome to Edureka");
    }
    
    Message(String n){
        System.out.println(n);
    }
}

public class LatihanJavaKeyword {
    public static void main(String[] args) {
        ClassInfo c1=new ClassInfo(10, "John");
        ClassInfo c2=new ClassInfo(12, "Annie");
        c1.display();
        c2.display();
        
        Message m=new Message();
    }
}
