/*Employee class 
Attributes – Employee ID, Gender (M/F), Name, Date of Birth, 
Occupation (Dean, Lecturer, Clerk, Accountant, Pion, Security, Laborer, Receptionist, 
Technical officers, etc…), Basic salary, Number of overtime hours, Payment per hour(For overtime only). 
Methods 
a)  increaseOTHours(double hours) – The number of hours worked as over time is 
increased according to the variable ‘hours’. 
b) Double computeOT() – The amount for overtime is calculated by, 
Overtime Amount = overtime hours *amount per hour. 
c) Doube findDeductions(double amount) – Whenever the amount to be deducted is given, 
total deductions are computed based on the amount given and returns the value.
d) Double findAllowances(double amount) – Whenever the allowances are given total allowances are 
computed based on the amount given and returns the value. 
e) Double calculateEPF() – Calculates the EPF and returns the value. EPF is 4% of the basic salary.  
f) calculateNetSalary() – Net salary is calculated using the following formula. 
Net Salary = Basic salary – total deductions + allowances + EPF + Amount for overtime 
NOTE: Call the necessary methods in order to gather the required information to calculate the net salary. 
This method could be accessed only by the “Accountant”. If others try to access this method it 
should display as “You are not allowed to access the salary details of the employees”. 
g) displalyInformation() – Display all the relevant information of a particular employee. */
 
class Employee{
	String emId;
	char gender;
	String name;
	String dob;
	String occu;
	double bSalary;
	double otHours;
	double otPay;
	double deducated;
	double allow;
	double netSalary;
	public void increaseOTHours(double hours){
		otHours = otHours + hours;
	}
	public double computeOT(){
		double otAmount = otHours* otPay;
		return otAmount;
	}
	public double findDeductions(double amount){
		deducated = deducated + amount;
		return deducated;
	}
	public double findAllowances(double amount){
		allow = allow + amount;
		return allow;
	}
	public double calculateEPF(){
		double epf = bSalary*0.04;
		return epf;
	}
	public void calculateNetSalary(Employee emp){
		if(occu != "Accountant"){
			System.out.println("You are not allowed to access the salary details of the employees.");
		}
		else{
			emp.netSalary = emp.bSalary - emp.deducated - emp.allow + emp.computeOT();
		}
	}
	public void displayInformation(){
		System.out.println("employee ID :\t"+ emId+"\nGender :\t"+ gender+
		"\nEmp Name :\t"+name+"\nData of birth :\t"+dob+"\nOccupation :\t"+occu+
		"\nBasic Salary :\t"+bSalary+"\n OT total :\t"+otHours+"\n Net Salary :\t"+netSalary);
	}
	public static void main(String args[]){
		Employee emp1 = new Employee();
		emp1.name = "Heshan";
		emp1.occu = "Accountant";
		emp1.dob = "1995.04.21";
		emp1.emId = "951121088v";
		emp1.gender = 'M';
		emp1.bSalary = 25000;
		emp1.otHours = 25.5;
		emp1.otPay = 100;
		emp1.calculateNetSalary(emp1);
		emp1.displayInformation();
		Employee emp2 = new Employee();
		emp2.name = "Sandaruwan";
		emp2.occu = "Labour";
		emp2.calculateNetSalary(emp1);
	}
}