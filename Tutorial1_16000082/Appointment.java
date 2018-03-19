/*Q 5.  Write a java class called Appointment.java representing an appointment you have with a person. 
This class should store three bits of information about an appointment: 
 With whom the appointment is 
 Day of the appointment 
 Appointment duration 
The Appointment class should have six methods 
 setName() 
 getName() 
 setDay() 
 getDay() 
 setDuration() 
 getDuration() 
Let the user create two Appointment objects and then prints appointment details. 
Sample output: 
Enter appointment one person: Chamara Peris 
Enter day of the appointment one: Monday 
Enter the duration of appointment one: 1 
Enter appointment two person: Kasun Kalhara 
Enter day of the appointment two: Tuesday 
Enter the duration of appointment two: 1.5 
You have a 1 hour appointment on Monday with Chamara Peris. 
You have a 1.5 hour appointment on Tuesday with Kasun Kalhara.*/ 
import java.util.Scanner;
class Appointment{
	String person;
	String day;
	float duration;
	public void setName(String name){
		this.person = name;
	}
	public String getName(){
		return person;
	}
	public void setDay(String date){
		this.day = date;
	}
	public String getDay(){
		return day;
	}
	public void setDuration(float dur){
		this.duration = dur;
	}
	public float getDuration(){
		return duration;
	}
	public static void main(String args[]){
		Appointment ap1 = new Appointment();
		Appointment ap2 = new Appointment();
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter frist person name: ");
		ap1.setName(s1.nextLine());
		System.out.print("Enter day of the appointment one : ");
		ap1.setDay(s1.nextLine());
		System.out.print("Enter the duration of appointment one : ");
		ap1.setDuration(s1.nextFloat());
		s1.nextLine();
		System.out.print("Enter second person name: ");
		ap2.setName(s1.nextLine());
		System.out.print("Enter day of the appointment two : ");
		ap2.setDay(s1.nextLine());
		System.out.print("Enter the duration of appointment two : ");
		ap2.setDuration(s1.nextFloat());
		System.out.println("You hava a "+ ap1.getName()+" hour appointment on "+ap1.getDay()+" with "+ ap1.getDuration());
		System.out.println("You hava a "+ ap2.getName()+" hour appointment on "+ap2.getDay()+" with "+ ap2.getDuration());
	}
}
