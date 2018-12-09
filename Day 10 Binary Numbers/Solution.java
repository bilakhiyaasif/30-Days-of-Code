/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication17;

/**
 *
 * @author Bilakhiya
 */import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;
 
 public class Solution {
 
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         in.close();
         int s=0,m=0;
         int t=n;
         while(t>0)
         {
             if(t%2==1)
             {
                 s++;
                 if(s>m)
                 {
                     m=s;
                 }
             }
                 else
                 {
                     s=0;
                 }
                t=t/2;
             }
          
         
         System.out.println(m);
         
  
     }
 }
 