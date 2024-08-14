/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

/**
 *
 * @author Asus
 */
public class LatihanJumpStatement {
    public static void main(String[] args) {
        
        //break statement
        for(int i=10;i>5;i--){
            if(i==7){
                break;
            }
            System.out.println(i);
        }
        
        System.out.println(" ");
        
        //continue statement
        for(int i=0;i<10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
