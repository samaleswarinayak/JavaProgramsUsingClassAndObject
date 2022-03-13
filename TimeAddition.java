/* WAP to define a Time class with hour,minute and seconds as data members. Find the time addition of to times and display with proper format*/

import java.util.*;
class Time
{
	int hour,min,sec,day;
	
	void input()
	{
		System.out.println("Enter the  hour min and sec ");
		try (Scanner sc = new Scanner(System.in)) {
			hour = sc.nextInt();
			min = sc.nextInt();
			sec = sc.nextInt();
		}
	}
	void compute(Time ob1, Time ob2)
	{
		int hr,sc;
		hour = ob1.hour+ob2.hour;
		min = ob1.min+ob2.min;
		sec = ob1.sec+ob2.sec;
		sc = sec/60;
		sec = sec%60;
		min = min + sc;
		hr = min/60;
		min=min%60;
		hour = hour + hr;
		day = hour/24;
		hour = hour %24;
		
	}
		
	
	void display()
	{
		System.out.println("The addition of two time is: " + day +" day and " + hour + "Hour:" + min + "Minute:" + sec + "Second");
		
	}

}
class TimeAddition
{
	public static void main(String args[])
	{
		Time ob1 = new Time();
		Time ob2 = new Time();
		Time ob3 = new Time();
		ob1.input();
		ob2.input();
		ob3.compute(ob1,ob2);
		ob3.display();
	}
}

