package com.example.ProjectLatihan;

public class Calculator {
    
    //Latihan membuat 2 method dan call by value
    public Integer add(Integer arg1,Integer arg2){
        arg1=100;
        Integer result =arg1+arg2;
        return result;
    }
    
    public Integer add(Integer arg1,Integer arg2,Integer arg3){
        Integer result=arg1+arg2+arg3;
        return result;
    }
    
    public static void main(String[] args) {
        Calculator cal =new Calculator();
        int arg1=10;
        int arg2=30;
        int arg3=40;
        System.out.println("Printing arg1 before passing it by value "+arg1);
        Integer result=cal.add(arg1,arg2);
        System.out.println("Printing arg1 after passing it by value to add method "+arg1);
        System.out.println("Result of addition is "+result);
        
        Integer resultFromNewMethodAdd=cal.add(arg1,arg2,arg3);
        System.out.println("Result from new add method "+resultFromNewMethodAdd);
    }
    
}
