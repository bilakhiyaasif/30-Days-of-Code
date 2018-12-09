//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>=1&&n<=100000)
        {
        Map<String,Long>m1=new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            long phone = in.nextInt();
            
            // Write code here
            m1.put(name, phone);
           
            
        }
        int j=1;
      while(in.hasNext()){
          if(j>=1&j<=100000)
          {
               String s = in.next();
               if(m1.containsKey(s))
               {
                   long values=m1.get(s);
                   System.out.println( s+"="+values);
               }
               else
               {
                   System.out.println("Not found");
               }
               j++;
      
          }
        }
       in.close();
    
        
        }   
    }
}
