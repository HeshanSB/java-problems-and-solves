/* Write a program to calculate the date of birth from a given NIC number. Refer the following procedure. */
import java.util.Scanner;
class Nic{
	public void calBirthday(String n){
		int day,date,month;
		String[] id = n.split("");
		int calYear = Integer.parseInt(id[0])*10+Integer.parseInt(id[1]);
		int Year = 1900+ calYear;
		int calDay = Integer.parseInt(id[2])*100+Integer.parseInt(id[3])*10+Integer.parseInt(id[4]);
		if(calDay<500){
			day = calDate(Year, calDay);
		}
		else{
			day = calDate(Year, calDay-500);
		}
		month = day/100;
		date = day%100;
		System.out.printf("Your Brithday is %d.%02d.%02d",Year,month,date);
	}
	public boolean leapYear(int y){
		if((y%4==0)&&((y%400==0)||(y%100!=0))){
			return true;
		}
		else{
			return false;
		}
	}
	public int calDate(int ye, int cd){
		int month;
		int date;
		int [] monthDay = {31,28,31,30,31,30,31,31,30,31,30,31,31};
		if(leapYear(ye)== true){
			System.out.println(ye);
			if(cd>59){
				monthDay[1]= 29;
			}
		}
		int days = 0,i = 0;
		while(i<=12){
			days = days + monthDay[i];
			if(days >= cd){
				break;
			}
			else{
				i++;
			}
		}
		if(i == 0){
			month = 1;
			date = cd;
		}
		else{
			month = i+1;
			date = cd-(days-monthDay[i]+1);
		}
		int mDate = month*100+date;
		return mDate;
	}
	
	public static void main(String args[]){
		Nic id1 = new Nic();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your NIC number : ");
		String id = sc.nextLine();
		id1.calBirthday(id);
	}
}