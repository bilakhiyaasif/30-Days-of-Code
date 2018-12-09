/**
 * 
 */
//package hck1;

import java.util.Scanner;

/**
 * @author Bilakhiya
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	static String check(String a)
	{
		String odd="",even="";
		for(int i=0;i<a.length();i++)
		{
			if(i%2==0)
			{
				even=even+a.charAt(i);
			}
			else
			{
				odd=odd+a.charAt(i);
			}
		}
		
		return even+" "+odd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  if(n>=1&&n<=10)
		  for(int i=0;i<n;i++)
		  {
		  String s=sc.next();
		  if(s.length()>=2&&s.length()<=10000)
		  {
		  System.out.println(check(s));
		  }
		  }
		}
	

}
