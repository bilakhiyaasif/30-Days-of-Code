import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

//Write your code here
class Calculator implements AdvancedArithmetic
{
int data;
public Calculator()
{
data=0;
}
    public int divisorSum(int n)
    {
    if(n>=1&&n<=1000)
    {
    for(int u=1;u<=n;u++)
    {
    if(n%u==0)
    {
    data=data+u; 
    }
    }
    }
    return data;
    
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}