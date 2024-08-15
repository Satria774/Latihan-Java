/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

/**
 *
 * @author Asus
 */
public class LatihanString {
    public static void main(String[] args) {
        //concating a string before allocating
        String s1="Happy";
        System.out.println("Before");
        System.out.println("Original String is: "+s1);
        
        System.out.println("After concatenation String is: "+s1.concat(" Learning"));
        System.out.println(" ");
        //concating a string after allocating
        System.out.println("after");
        System.out.println("Original String is: "+s1);
        
        s1=s1.concat(" Learning");
        
        System.out.println("After concatenation String is: "+s1);
        System.out.println(" ");
        
        //String Operation
        String s="edurika";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(2));
        System.out.println(" ");
        
        //compareTo
        String a1="Hello";
        String a2="Heldo";
        System.out.println(a1.compareTo(a2));
        System.out.println(" ");
        
        //isEmpty
        String a3="";
        System.out.println(a3.isEmpty());
        System.out.println(" ");
        
        //valueOf
        int c=50;
        String s2=String.valueOf(c);
        System.out.println(s2);
        System.out.println(" ");
        
        //replace
        String s3="Heldo";
        String replace=s3.replace('d', 'l');
        System.out.println(replace);
        System.out.println(" ");
    
        //contains
        System.out.println(replace.contains("d"));
        System.out.println(" ");
        
        //equals
        String x="Welcome to Edureka";
        String y="WeLcOme to eDurEkA";
        System.out.println(x.equals(y));
        
        //charAt
        System.out.println(x.charAt(3));
        
        //endsWith
        String p="Happy Learning";
        System.out.println(p.endsWith("u"));
        
        //StringBuffer
        
        //creating StringBuffer and append method
        StringBuffer s4 = new StringBuffer("Welcome to edureka!");
        s4.append("Happy Learning");
        System.out.println(s4);
        
        //insert method
        s4.insert(0, 'w');
        System.out.println(s4);
        
        //replace method
        StringBuffer s5 = new StringBuffer("Hello");
        s5.replace(0,2,"hEl");
        System.out.println(s5);
        
        //delete method
        s5.delete(0, 1);
        System.out.println(s5);
        
        //reverse method
        StringBuffer s6 = new StringBuffer("edureka");
        System.out.println(s6.reverse());
        System.out.println(s6.capacity());
        System.out.println(" ");
        
        //String Builder
        StringBuilder sb1=new StringBuilder("Happy");
        sb1.append("Learning");
        System.out.println(sb1);
        
        System.out.println(sb1.delete(0, 1));
        
        System.out.println(sb1.insert(1, "Welcome"));
        
        System.out.println(sb1.reverse());
    }
}
