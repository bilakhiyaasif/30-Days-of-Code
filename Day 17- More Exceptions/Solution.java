import java.util.*;
import java.io.*;

class ex1 extends Exception
{

    ex1() throws Exception {
        throw new Exception("n and p should be non-negative"); 
    }
    
}
class Calculator
{
    public int power(int p,int q)throws ex1, Exception
            
    {
        if(p<0||q<0)
        {
            throw new ex1();
        }
        else
        {
        return (int)Math.pow(p, q);
        }
    }
}
class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
