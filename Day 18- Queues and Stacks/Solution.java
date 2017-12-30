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
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
