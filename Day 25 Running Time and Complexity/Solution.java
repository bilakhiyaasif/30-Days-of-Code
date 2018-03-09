import java.util.Scanner;

public class Solution {
    public static boolean isprime(int n)
    {
			//int n=10;
	int f1=0;
	for(int i=2;i<=Math.sqrt(n);i++)
	{
		//System.out.println(i);
		if(n%i==0)
		{
			f1=1;
			break;
		}
		
	}
	if(f1==0)
	{
		//System.out.println("prime");
		return true;
	}
	f1=0;
       return false;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
			if(n>=1&&n<=(2)*(Math.pow(10,9))){
            if(n>=2 && isprime(n))
            {
                System.out.println("Prime");
            }
            else
            {
               System.out.println("Not prime"); 
            }
            t--;
		}
        }
	
	
    }
}














