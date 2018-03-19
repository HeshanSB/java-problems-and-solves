/* Running speed of an athlete is measured, using the starting time and the ending time of the race. 
Each athlete is given a unique identification number and the corresponding times are stored in terms
 of hours, minutes and seconds in 24 hour time. Assume that the race is started when the start command
 is given and the athletes have to reach the victory target located 100m far from the beginning place.
 Suppose that there are three athletes participate for the race. 
  */
class Race{
	int idNo;
	String stTime;
	String enTime;
	static int amount ;
	Race(int id, String st, String en){
		idNo = id;
		stTime = st;
		enTime = en;
		amount = amount + 1;
	}
	public int calTime(){
		String[] start = stTime.split(":");
		String[] end  = enTime.split(":");
		int sHours = Integer.parseInt(start[0]);
		int sMins = Integer.parseInt(start[1]);
		int sSecs = Integer.parseInt(start[2]);
		int eHours = Integer.parseInt(end[0]);
		int eMins = Integer.parseInt(end[1]);
		int eSecs = Integer.parseInt(end[2]);
		int sInSec = sHours*3600+sMins*60+sSecs;
		int eInSec = eHours*3600+eMins*60+eSecs;
		int spend = eInSec - sInSec;
		return spend;
	}
	public double calSpeed(){
		double speed = 100.0/calTime();
		return speed;
	}
	public void display(){
		System.out.println("\nDETAILS OF ATHLETE "+amount);
		System.out.println("--------------------------------------------");
		System.out.println("\tIndentification Number :"+ idNo+ "\n\tStarting time :\t"+
		stTime+"\n\tEnding Time :\t"+ enTime);
		System.out.println("\n\tThe time spent:\n");
		int hours = calTime()/3600;
		int Mins = (calTime()%3600)/60;
		int Secs = (calTime()%3600)%60;
		System.out.println("\t\tHours : "+hours+"\n\t\tMinutes : "+Mins+"\n\t\tSeconds : "+Secs);
		System.out.println("\n\tTotal time spent : "+calTime()+" seconds\n");
		System.out.println("\tSpeed : "+calSpeed()+ " m/s");
	}
}