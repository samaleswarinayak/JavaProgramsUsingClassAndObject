/*WAP TO FIND THE LARGEST AMONG THREE NUMBER USING CLASS AND OBJECT*/

import java.util.*;
class Largest
{
	int num;
	
	void input(int num1)
	{
		num = num1;		
	}
	void large(Largest ob1, Largest ob2 , Largest ob3)
	{
		if(ob1.num > ob2.num)
		{
			if(ob1.num > ob3.num)
			{
				num = ob1.num;
			}
			else
			{
				num = ob3.num;
			}
		}
		else
		{
			if(ob2.num > ob3.num)
			{
				num = ob2.num;
			}
			else
			{
				num= ob3.num;
			}
		}
		
	}
			
	void show()
	{
		System.out.println("The largest among the 3 number is: " + num);
		
	}

}
class LargestTest
{
	public static void main(String args[])
	{
		int num;
		Largest ob1 = new Largest();
		Largest ob2 = new Largest();
		Largest ob3 = new Largest();
		Largest ob4 = new Largest();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number ");
		num = sc.nextInt();
		ob1.input(num);
		System.out.println("enter second number ");
		num = sc.nextInt();
		ob2.input(num);
		System.out.println("enter third number ");
		num = sc.nextInt();
		ob3.input(num);
		ob4.large(ob1,ob2,ob3);
		ob4.show();	
		
	}
}
