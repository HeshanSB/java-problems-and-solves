/* The given JAVA program represents the details of the members in a family. The class ‘FamilyMember’
 is the class defined to store information of the family members and class defined as ‘Family’ is the
 driver class of the program. Each family member has a first name, middle initial and a last name
 which is common to all the family members. The title is the prefix that uses in front of the name 
such as Mr., Ms., and Mrs. Some of the members in the family have an occupation. Hence they also have 
a basic salary. There are two constructors in the JAVA program one of which is to assign the values of
 the members who have an occupation and the other one is for the members who do not have an occupation.
 There are two methods which are defined in the ‘FamilyMember’ class. The method defined as 
‘displayPersonalData’ is to display the personal information of the family members and the method called
 ‘displayProfessionalData’ is to display the professional details. 
i. Correct the errors which will appear when the program is compiled. 
ii. Store details of Mother, Son and Daughter and display them. 
iii. Modify the method ‘displayPersonalData’ to display the gender in words (Female or Male). 
iv. Modify the method ‘displayProfessionalData’, so that it does not display the basic salary
 for the members who do not have an occupation. 
v. Define a new method to calculate the total monthly income of the family. 
vi. Define a new method to calculate the tax, based on the following criteria. If total monthly 
income of the family is, 
Less than or equal to Rs. 10000/=, then no tax is calculated 
In between Rs. 10000/= and Rs. 30000/=, then the tax is 5% of the total monthly income of the family.
Greater than Rs. 30000/=, then 7.5% of the total monthly income is calculated as the tax. */
 
class FamilyMember{
	String fName;
	char mi;
	String lName;
	String title;
	char gender;
	String occupation;
	double bSalary;
	FamilyMember(String f, char m, String l, String t, char gen){
		fName = f;
		mi = m;
		lName = l;
		title = t;
		gender = gen;
	}
	FamilyMember(String f, char m, String l, String t, char gen, String oc, double bs){
		fName = f;
		mi = m;
		lName = l;
		title = t;
		gender = gen;
		occupation = oc;
		bSalary = bs;
	}
	public void displayPersonalData(){
		System.out.println("\n**************PERSONAL INFORMATION****************\nFrist name :\t"+
		fName+"\nMiddle intial : "+ mi+"\nLast Name :\t"+lName+"\nTitle :\t\t"+title+
		"\nGender :\t"+gender);
	}
	public void displayProfessionalData(){
		System.out.println("\n****************PROFESSIONAL DETAILS****************\n");
		if(bSalary == 0){
			System.out.println(fName+" hasn't an occupation");
		}
		else{
			System.out.println("Name :\t\t"+title+"."+fName+" "+mi+" "+lName+"\nOccupation :\t"+occupation+"\nBasic Salary :\tRs."+bSalary);
		}
	}
}
class Family{
	public static void main(String args[]){
		FamilyMember Mother = new FamilyMember("Kanthi",'M',"Perera", "Mrs",'F');
		FamilyMember Father = new FamilyMember("Upali", 'K', "Perera","Mr", 'M', "Engineer",35000.00);
		FamilyMember Son = new FamilyMember("Mahesh", 'L',"Perera", "Mr", 'M');
		FamilyMember Daugther = new FamilyMember("Sumali", 'D', "Perera", "Ms", 'F', "Doctor", 45000.00);
		Mother.displayPersonalData();
		Father.displayPersonalData();
		Son.displayPersonalData();
		Daugther.displayPersonalData();
		Father.displayProfessionalData();
		Mother.displayProfessionalData();
		Daugther.displayProfessionalData();
		Son.displayProfessionalData();
	}
}
