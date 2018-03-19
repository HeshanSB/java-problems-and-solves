/*A method to find the winner of the race. The winner is the one who finished the race with the minimum
 amount of time. Define another class called “Race” which is the driver class of the program. 
Hint: 1 minute=60 seconds and 1 hour=60 minutes  Consider three different ending times for the 
three athletes */
class RaceWinner{
	public static void main(String args[]){
		Race r1 = new Race(10, "12:45:32", "13:54:45");
		Race r2 = new Race(23, "6:32:34", "9:34:23");
		Race r3 = new Race(45, "23:34:45", "23:45:23");
		System.out.println("\n*************THE WINNER*******************");
		if(r1.calTime()<r2.calTime() && r1.calTime()<r3.calTime()){
			r1.display();
		}
		else if(r2.calTime()<r1.calTime() && r2.calTime()<r3.calTime()){
			r2.display();
		}
		else if(r3.calTime()<r1.calTime() && r3.calTime()<r2.calTime()){
			r3.display();
		}
	}
}