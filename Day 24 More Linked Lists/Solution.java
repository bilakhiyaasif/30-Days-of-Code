import java.util.Scanner;
class Node{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Solution
{
	public static Node insert(Node head,int data)
	{
	Node p=new Node(data);
	if(head==null)
	{
		head=p;
	}
	else if(head.next==null)
	{
		head.next=p;
	}
	else
	{
		Node start=head;
		while(start.next!=null)
		{
			start=start.next;	
		}
		start.next=p;
		return head;
		//System.out.println();
	}
	return head; 	
	}
	public static void display(Node head)
	{
		Node start=head;
		while(start!=null)
		{
			System.out.print(start.data+" ");
			start=start.next;
		}
		
	}
	public static Node remove_duplicates(Node head)
	{
	   if(head==null||head.next==null)
	   {
		   return head;
	   }
	   Node prev=head;
	   Node p=head.next;
	   
	   while(p!=null)
	   {
		   if(p.data==prev.data)
		   {
			prev.next=p.next;
			p=p.next;			   
		   }
		   else{
			   prev=p;
			   p=p.next;   
		   }
	   }
	   return head;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		int T=sc.nextInt();
		while(T-->0)
		{
			int ele=sc.nextInt();
			head=insert(head,ele);
		}
		head=remove_duplicates(head);
		display(head);	
	}
}
	
