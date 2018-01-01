/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package day20;

import java.util.Arrays;
import java.util.Scanner;
//2 to 600 n
//
public class Solution{
public static void swap(int a[],int l)
{
   
}
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int jk=sc.nextInt();
        //if(jk>=2&&jk<=600)
        //{
        int a[] = new int[jk];
        for(int k=0;k<jk;k++)
        {
           // int x1=sc.nextInt();
           // if(x1>=1&&x1<=1000000)
            //{
            a[k]=sc.nextInt();
            //}
        }
        
        
        int numofswaps=0;
        int n=a.length;
      
        for (int i = 0; i < n; i++) {
          
            for (int j = 0; j < n-1; j++) {
                  if(a[j]>a[j+1])
                  {
                     
                      int t=a[j];
                      a[j]=a[j+1];
                      a[j+1]=t;
                      numofswaps++;
                  }
            }
             if(numofswaps==0)
                  {
                      break;
                  }
        }
        
        
        System.out.println("Array is sorted in "+numofswaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
        }
        //}    

}
