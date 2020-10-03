/* DEFINE A CLASS STACK HAVING DATAMEMBER top AND METHODS push(),pop(),display().WAP TO IMPLEMENT THE FUNCTIONALITIES OF STACK*/

import java.util.*;
class Stack
{
	static java.util.Scanner sc= new Scanner(System.in);
	static int top=-1;
	static int arr[]=new int[50];
	static void push()
	{
		top++;
		System.out.println("Enter the element to push:  ");
		arr[top]=sc.nextInt();
	}
	static void pop()
	{
		System.out.println("Popped element:  "+arr[top]);
		top--;
	}
	static void display()
	{
		System.out.println("Values of stack are");
		for(int j=top;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
	}
	
	public static void main(String args[])
	{
		int size,choice;
		System.out.println("Enter the size of stack");
		size=sc.nextInt();
		while(true)
		{
			System.out.println("1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT");
			
			System.out.println("Enter your choice:  ");
			choice =sc.nextInt();
		
			switch(choice)
			{
				case 1:
						if(top==size-1)
						{
							System.out.println("STACK OVERFLOW");
						}
						else
						{
							push();
						}
					break;
				case 2:
						if(top==-1)
						{
							System.out.println("STACK UNDER FLOW");
						}
						else
						{
							pop();
						}
					break;
				case 3:
						if(top==-1)
						{
							System.out.println("STACK UNDER FLOW");	
						}
						else
						{
							display();
						}
					break;
				case 4:
						System.out.println("THANK YOU");
						System.exit(0);
				default:
						System.out.println("Wrong Choice");
			}
		}
	}
}
