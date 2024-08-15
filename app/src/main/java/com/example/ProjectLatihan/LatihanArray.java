/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjectLatihan;

/**
 *
 * @author Asus
 */
public class LatihanArray {
    public static void main(String[] args) {
        //single dimentional array
        int[] arrayOfInteger= new int[] {5,6,7};
        int[] array ={2,4,6,8,10};
        
        //multidimentional array 3X2
        int[][] multidimentionalArray={
            {1,2},
            {3,4},
            {5,6}
        };
        
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[4]); 
        
        System.out.println("size of first array in multidimentional array "+multidimentionalArray[0].length);  
        System.out.println(" ");
        
        // createing array of character
        char[]source={'H','A','P','P','Y','L','E','A','R','N','I','N','G'};
        char[] destination = new char[7];
        
        //Copying elements from one array to another
        System.arraycopy(source, 0, destination, 1, 5);
        System.out.println(new String(destination));
        
        //Deleting element from array
        int flag=3;//elements to be deleted
        for (int i=0;i<source.length; i++){
            //delete function
            if(flag ==i){
                for(int j=i+1;i<source.length-1;j++){
                source[i] = source[j];
                i++;
                }
                System.out.println(source);
            }
        }
        
        
    }
}
