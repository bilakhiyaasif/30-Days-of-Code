import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
 public Difference(int[] elements)
 {
     this.elements=elements;
     
 }
public void computeDifference()
{
    int t=0,m=0;
    for(int i=0;i<elements.length;i++)
    {
        for(int j=0;j<elements.length;j++)
        {
            t=elements[i]-elements[j];
            if(t<0)
            {
                t=t*(-1);
            }
            if(t>m)
            {
                m=t;
                t=0;
              
                
            }
            t=0;
            
        }
    }
    this.maximumDifference=m;
}

} // End of Difference class