/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

class StudentInfo{
    int roll;
    String name;
    void display(){
        System.out.println(roll+" "+name);
    }
}
public class LatihanDefaultContruct {
    
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = new StudentInfo();
        
        s1.display();
        s2.display();
    }
    
}
