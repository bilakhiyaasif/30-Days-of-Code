/**
 * 
 */
//package d1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Bilakhiya
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i=0,j=0;
	int a[][]=new int[6][6];
	Scanner sc=new Scanner(System.in);
	int max=Integer.MIN_VALUE;
        int t1=0;
        
        for(i=0;i<6;i++)
        {
            for(j=0;j<6;j++)
            {
                a[i][j]=sc.nextInt();
                
            }
        }
        i=0;j=0;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                t1=a[i][j]+a[i][j+1]+a[i][j+2]
                    +a[i+1][j+1]
                    +a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                        
              max=Math.max(t1, max);
              
            }
        }
        
        System.out.println(max);
        
        
        
        
        
	}
}
