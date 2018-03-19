/*8. Write a JAVA program to calculate the average of numbers based on following options. 
 Average of two integer numbers 
 Average of three integer numbers 
 Average of an integer number and a float number 
 Average of two integer numbers and a float number 
 Average of three float numbers 
 Average of two float numbers and two integer values 
 Average of two double values 
 Average of three numbers of type integer, double and float 
 
You must use overloaded methods to perform the required operations.*/                           
 
class Average{
	double av;
	Average(int n1,int n2){
		av = (n1+n2)/2;
		System.out.println("Average = "+av);
	}
	Average(int n1,int n2,int n3){
		av = (n1+n2+n3)/3;
		System.out.println("Average = "+av);
	}
	Average(int n1,float n2){
		av = (n1+n2)/2;
		System.out.println("Average = "+av);
	}
	Average(int n1,int n2,float n3){
		av = (n1+n2+n3)/3;
		System.out.println("Average = "+av);
	}
	Average(float n1,float n2,float n3){
		av = (n1+n2+n3)/3;
		System.out.println("Average = "+av);
	}
	Average(int n1,int n2,float n3,float n4){
		av = (n1+n2+n3+n4)/4;
		System.out.println("Average = "+av);
	}
	Average(double n1,double n2){
		av = (n1+n2)/2;
		System.out.println("Average = "+av);
	}
	Average(int n1,int n2, int n3, double n4, float n5){
		av = (n1+n2+n3+n4+n5)/5;
		System.out.println("Average = "+av);
	}
}
