/*Attributes – Registration Number , Gender (M/F), Name, Date of birth, 
Marks of three subjects (Computer science, Statistics, Mathematics) , Average,  Grade 
 
Methods  
a) calculateStudentAverage() – Calculate the average of three subjects. 
b) findGrade() – Find the grade of the student based on the average. 
100 <= Average <= 75  “A” 
75 < Average <= 65  ”B” 
65 < Average <= 55  “C” 
55 < Average <= 45  ”D” 
Average < 45   “F” 
c) displayInformation() – Display all the relevant information of a particular student. 
d) calculateSchoolAverage(array stu) – Calculates the overall average of all three subjects separately. 
e) displayMessage() – If the overall averages of all three subjects are greater than 50 then it should 
display “Excellent”. Overall average for only two subjects are greater than 50 then it should display 
“Improve” Otherwise it should display “Poor”. 
f) findBatchTop(array stu) The one who has the highest average is considered to be the “Batch top”. 
Display the relevant information of the batch top by calling the ‘displayInformation()’ method.  
g) findHighestMarks(arrray stu) – The method finds the highest marks of each subject separately. 
Then displays the relevant details of the student who gained the highest marks. */
 
class Student{
	public String rNo;
	public char gender;
	public String name;
	public String dob;
	public int cs;
	public int stat;
	public int math;
	public double average;
	public char grade;
	
	public double calculateStudentAverage(){
		average = (cs+stat+math)/3;
		return average;
	}
	public void findGrade(){
		if(average>=75 || average<=100){
			grade = 'A';
		}
		else if(average<75 || average<=65){
			grade = 'B';
		}
		else if(average>=55 || average<65){
			grade = 'C';
		}
		else if(average>=45 || average<55){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
	}
	public void displayInformation(){
		System.out.println("Re.No : "+rNo);
		System.out.println("Gender : "+gender);
		System.out.println("Stu.name : "+ name);
		System.out.println("Date Of Birth : "+ dob);
		System.out.println("Computer Sicence : "+ cs);
		System.out.println("Statistics : "+stat);
		System.out.println("Mathematics : "+ math);
	}
	public double[] calculateSchoolAverage(Student[] stu){
		double csA = 0;
		double statA = 0;
		double mathA = 0;
		int lenStu = stu.length;
		for(int i = 0 ; i<stu.length ; i++ ){
			csA = csA+stu[i].cs;
			statA = statA + stu[i].stat;
			mathA = mathA + stu[i].math;
		}
		double csAv = csA/lenStu;
		double statAv = statA/lenStu;
		double mathAv = mathA/lenStu;
		double[] avArray ={csAv, statAv, mathAv};	
		return avArray;
	}
	public void displayMessage(Student[] stu){
		double[] stuAv = calculateSchoolAverage(stu);
		if((stuAv[0] + stuAv[1] + stuAv[2])/3 > 50){
			System.out.println("Excellent");
		}
		else{
			if(((stuAv[0]+ stuAv[1])/3 < 50) && ((stuAv[0] + stuAv[2])/3 < 50) && ((stuAv[1] + stuAv[2])/3 < 50)){
				System.out.println("Poor");
			}
			else{
				System.out.println("Improve");
			}
		}
	}
	public void findBatchTop(Student[] stu){
		double highestAverage=0;
		int studentNo = 0;
		for(int i=0; i<stu.length; i++){
			double average = stu[i].calculateStudentAverage();
			if(average > highestAverage){
				highestAverage = average;
				studentNo = i;
			}
		}
		stu[studentNo].displayInformation();
	}
	public void findHighestMarks(Student[] stu){
		int HighestMath = 0;
		int HighestCs = 0;
		int HighestStat = 0;
		int mathNo = 0, csNo = 0, statNo = 0;
		for(int i=0; i<stu.length; i++){
			int m = stu[i].math, c = stu[i].cs, s = stu[i].stat;
			if(m > HighestMath){
				HighestMath = m;
				mathNo = i;
			}
			if(c > HighestCs){
				HighestCs = c;
				csNo = i;
			}
			if(s > HighestStat){
				HighestStat = s;
				statNo = i;
			}
		}
		System.out.println("Hightest marks for Mathematics = "+stu[mathNo].math+"\n Student name = "+ stu[mathNo].name);
		System.out.println("Hightest marks for Computer Scince = "+stu[csNo].cs+"\n Student name = "+ stu[csNo].name);
		System.out.println("Hightest marks for Statistics = "+stu[statNo].math+"\n Student name = "+ stu[statNo].name);
	}
	
	public static void main(String args[]){
		Student Heshan = new Student();
		Heshan.name = "Heshan Sandaruwan";
		Heshan.rNo = "2016/cs/008";
		Heshan.gender = 'M';
		Heshan.dob = "1995.04.21";
		Heshan.cs = 75;
		Heshan.math = 62;
		Heshan.stat = 34;
		Student Isuru = new Student();
		Isuru.name = "Isuru Sandaruwan";
		Isuru.rNo = "2017/cs/045";
		Isuru.gender = 'M';
		Isuru.dob = "1998.02.10";
		Isuru.cs = 35;
		Isuru.math = 53;
		Isuru.stat = 72;
		System.out.println("Heshan's Average is "+Heshan.calculateStudentAverage());
		Isuru.displayInformation();
		Student[] st ={Heshan, Isuru};
		Isuru.calculateSchoolAverage(st);
		Isuru.displayMessage(st);
		Isuru.findBatchTop(st);
		Isuru.findHighestMarks(st);
		
	}
}
