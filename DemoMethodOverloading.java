/*WAP to achieve method overloading*/

class TestMethodOverloading
{
	void show()
	{
		System.out.println("Shree");
	}
	void show(int no)
	{
		System.out.println("Value of number is "+no);
	}
	void show(char ch)
	{
		System.out.println("Value of character is "+ch);
	}
	void show(int no1, int no2)
	{
		System.out.println("Value of number1 is "+no1+" and number2 is "+no2);
	}
	void show(int no, char ch)
	{
		System.out.println("Value of number is "+no+" and character is "+ch);
	}
}
class DemoMethodOverloading
{
	public static void main(String args[])
	{
		TestMethodOverloading ob = new TestMethodOverloading();
		ob.show();
		ob.show(50);
		ob.show('S');
		ob.show(10,'A');
		ob.show(20,30);
	}
}