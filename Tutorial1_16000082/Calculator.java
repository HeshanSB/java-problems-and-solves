/*Write a Java program to define a calculator. The calculator should be able to store two numbers and perform following 
operations on them.               
 Add 
 Subtract 
 Multiply 
 Divide */
 
import java.util.Scanner;
class Calculator{
	double num1;
	double num2;
	public void Add(double n1, double n2){
		num1 = n1;
		num2 = n2;
		double num3 = num1 + num2;
		System.out.println(num1+" + "+num2+ " = "+num3);
	}
	public void Subtract(double n1, double n2){
		num1 = n1;
		num2 = n2;
		double num3 = num1 - num2;
		System.out.println(num1+" - "+num2+ " = "+num3);
	}
	public void Multiply(double n1, double n2){
		num1 = n1;
		num2 = n2;
		double num3 = num1 * num2;
		System.out.println(num1+" * "+num2+ " = "+num3);
	}
	public void Divide(double n1, double n2){
		num1 = n1;
		num2 = n2;
		double num3 = num1 / num2;
		System.out.println(num1+" / "+num2+ " = "+num3);
	}
	public static void main(String args[]){
		System.out.println("\n*****Welcome to Calculator*******\n");
		Calculator c1 = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter frist number : ");
		double nu1 = sc.nextDouble();
		System.out.print("Enter Second number : ");
		double nu2 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter operation : ");
		String op = sc.nextLine();
		switch(op){
			case "+":
				c1.Add(nu1,nu2);
				break;
			case "-":
				c1.Subtract(nu1,nu2);
				break;
			case "*":
				c1.Multiply(nu1,nu2);
				break;
			case "/":
				c1.Divide(nu1,nu2);
				break;
		}
	}
}
