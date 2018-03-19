/*Courses class – This represents the details of the courses offered by the university. 
 Attributes – Course ID, Course Code, Subject, Level (1,2,3,4 years), Number of credits 
 Methods
a)displalyInformation() – Display all the relevant information of a particular employee.*/ 
 
class Courses{
	String cId;
	int cCode;
	String subject;
	int level;
	int noOfCredits;
	public void displayInformation(){
		System.out.println("Course ID :\t"+cId+"\nCourse Code :\t"+cCode+"\nSubject :\t"+subject+
		"\nLevel :\t"+level+"\nNumber of credits :\t"+noOfCredits);
	}
	public static void main(String args[]){
		Courses co1 = new Courses();
		co1.cId = "scs1012";
		co1.cCode = 012;
		co1.subject = "Dara Structers and Algorithm";
		co1.level = 2;
		co1.noOfCredits = 3;
		co1.displayInformation();
	}
}