// remove element leetcode question
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.text.*;
class Solution {
     public static void main(String[]args){
          Scanner sc= new  Scanner(System.in);
          int newindex=0;
          System.out.println("enter the number which you want to delete :");
          int n = sc. nextInt();
         System.out.println("enter the elements of an array :");
          int [] array =new int [6];
          for(int i=0;i<array.length;i++)
          if(sc.hasNextInt()){
                       array[i] = sc.nextInt();
          }
          System.out.println(" the elements of an array :");
          for( int i=0; i<array.length;i++){
            System.out.println(array[i]);
          }
          int [] newarray=new int[array.length -1];
         for(int i=0; i<array.length; i++){
                  if(array[i]!=n){
                      newarray[newindex]=array[i];
                      newindex++;
                   }  
                  }
          for(int i=0;i<newarray.length;i++){
           System.out.println(newarray[i]);
            }
}
}


