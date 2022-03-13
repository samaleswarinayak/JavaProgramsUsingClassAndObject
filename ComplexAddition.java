/*WAP to add two complex numbers*/

import java.util.*;

class Complex
{
	float real,imaginary;
	
	void input()
	{
		System.out.println("Enter the real and imaginary part");
		try (Scanner sc = new Scanner(System.in)) {               // try block is added inorder to fox resource leak
			real = sc.nextFloat();
			imaginary = sc.nextFloat();
		}
		
		
	}
	void addition(Complex ob1, Complex ob2)
	{
		real = ob1.real + ob2.real;
		imaginary = ob1.imaginary + ob2.imaginary;
		
	}
		
	void display()
	{
		System.out.println("The addition of two complex number is: " + real + " " + "+ " + imaginary + "i");
		
	}

}
class ComplexAddition
{
	public static void main(String args[])
	{	
		Complex ob1 = new Complex();
		Complex ob2 = new Complex();
		Complex ob3 = new Complex();
		ob1.input();
		ob2.input();
		ob3.addition(ob1,ob2);
		ob3.display();
	}
}
