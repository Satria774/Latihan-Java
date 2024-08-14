/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

/**
 *
 * @author Asus
 */
public class LatihanPercabangan {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int temp;
        
        //if statement
        if(a<b){
            temp=a+b;
            System.out.println(temp);
        }
        
        //if-else and nested if-else statement
        if(a<b){
            temp=a+b;
            System.out.println(temp);
        }else{
        temp=a-b;
            System.out.println(temp);
        }
        
        if(a>b){
            temp=a+b;
            System.out.println(temp);
        }else{
        temp=b-a;
            System.out.println(temp);
        }
        
        System.err.println(" ");
        
        int ch=40;
        switch(ch){
            case 20:  System.out.println("Case 20 executed");
            case 30:  System.out.println("Case 30 executed");
            case 40:  System.out.println("Case 40 executed"); break;
            default: System.out.println("Case 20,30,40 not executed");
        }
    }
}
