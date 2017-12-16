import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>=1&&n<=1000){
            
        
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            int t=in.nextInt();
            if(t>=1&&t<=10000){
            arr[i] = t;
            }  
        }
        in.close();
        for(int j=arr.length-1;j>=0;j--)
        {
            System.out.print(arr[j]+" ");
        }
        }
    }
}
