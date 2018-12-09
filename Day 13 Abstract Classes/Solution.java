import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
  class MyBook extends Book
  {
  
  
  
 
    // Declare the price instance variable
  
    /**   
    *   Class Constructor
    * 
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    int price=0;
    String title;
    String author;
    public MyBook(String t,String a,int p)
    {
    super(t,a);
    this.title=t;
    this.author=a;
    this.price=p;
    
    
    }
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    void display()
    {
    System.out.println("Title: "+title);
     System.out.println("Author: "+author);
      System.out.println("Price: "+price);
    
    
    }
    
// End class
}

public class Solution {