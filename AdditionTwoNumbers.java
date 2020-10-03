/*WAP to check the use of class and object in java*/

import java.util.*;
class AdditionTwoNumbers
{
	int no1,no2,res;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		no1= sc.nextInt();
		no2= sc.nextInt();
	}
	void add()
	{
		res = no1+no2;
	}
	void show()
	{
		System.out.println(res+" is the sum of "+no1+" and "+no2);
	}
	public static void main(String args[])
	{
		DemoClass ob = new DemoClass();//Object is created
		ob.input();
		ob.add();
		ob.show();
	}
}
