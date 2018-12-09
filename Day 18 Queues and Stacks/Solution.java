import java.io.*;
import java.util.*;

/**
 *
 * @author Bilakhiya
 */


public class Solution {
 
        LinkedList q;
        LinkedList s;
        
        public Solution()
        {
            q=new LinkedList();
            s=new LinkedList();
        }
        
        // p.pushCharacter(c);
           // p.enqueueCharacter(c);
            // if (p.popCharacter() != p.dequeueCharacter()) {
      
        //stack
        public char popCharacter()
        {
            return (char)s.removeFirst();
        }
        public void pushCharacter(char c)
        {
            s.addFirst(c);
            
        }
        //queue
        public void enqueueCharacter(char c)
        {
            q.addLast(c);
            
        }
        public char dequeueCharacter()
        {
           return (char)q.remove(0);
           
        }

    public static void main(String[] args) {