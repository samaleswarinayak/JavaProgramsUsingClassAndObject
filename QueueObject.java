/* DEFINE A CLASS QUEUE HAVING DATAMEMBER rear and front AND METHODS insert(),delete(),display().WAP TO IMPLEMENT THE FUNCTIONALITIES OF Linear Queue*/

import java.util.*;
class QueueObject
{
	static Scanner sc= new Scanner(System.in);
	static int rear=-1,front=-1;
	static int arr[]=new int[50];
	void insert()
	{
		if(rear == -1)
		{
			front++;
		}
		rear++;
		System.out.println("Enter the element to insert:  ");
		arr[rear]=sc.nextInt();
	}
	void delete()
	{
		System.out.println("Deleted element:  "+arr[front]);
		front++;
	}
	void display()
	{
		System.out.println("Values of Queue are");
		for(int j=front;j<=rear;j++)
		{
			System.out.print(arr[j]+"\t");
		}
	}
	
	public static void main(String args[])
	{
		QueueObject ob = new QueueObject();
		int size,choice;
		System.out.println("Enter the size of Queue");
		size=sc.nextInt();
		while(true)
		{
			System.out.println("\n1.INSERT\n2.DELETE\n3.DISPLAY\n4.EXIT");
			
			System.out.println("Enter your choice:  ");
			choice =sc.nextInt();
		
			switch(choice)
			{
				case 1:
						if(rear==size-1)
						{
							System.out.println("QUEUE OVERFLOW");
						}
						else
						{
							ob.insert();
						}
					break;
				case 2:
						if(front==-1 || front == rear+1)
						{
							System.out.println("QUEUE UNDER FLOW");
						}
						else
						{
							ob.delete();
						}
					break;
				case 3:
						if(front==-1 || front == rear+1)
						{
							System.out.println("QUEUE UNDER FLOW");	
						}
						else
						{
							ob.display();
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
