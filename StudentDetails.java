/*WAP TO INPUT STUDENT INFORMATION AND DISPLAY*/
import java.util.*;
class student
{
	String name;
	int roll;
	float mark;
	String sic;
	void input()
	{
		System.out.println("Enter the information of student (Name , roll , sic, mark)");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		roll = sc.nextInt();
		sic =  sc.next();
		mark = sc.nextFloat();
	}
	void display()
	{
		System.out.println("THe information of student is ");
		System.out.println("Name: " + name);
		System.out.println("Roll no: " + roll);
		System.out.println("mark: " + mark);
		System.out.println("sic number: " + sic);
		
	}

}
class StudentDetails
{
	public static void main(String args[])
	{
		student ob1 = new student();
		ob1.input();
		ob1.display();
	}
}
