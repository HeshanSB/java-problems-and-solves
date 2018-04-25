/*Binary AND operation codeing */ 
import java.util.Scanner;
class assignment{
/*Numbers convert Decimal to Binary */
	public String binary(int n){
		String num ="";
		while(n>0){
			num = Integer.toString(n%2)+num;
			n=n/2;
		}
		return num;
	}
	public String[] lengthEqual(String num1, String num2){
		int lenDif;
		if(num1.length() > num2.length()){
			lenDif = num1.length() - num2.length();
			for(int i=0; i<lenDif; i++){
				num2 = "0"+num2;
			}
		}
		else if(num1.length() < num2.length()){
			lenDif = num2.length() - num1.length();
			for(int i=0; i<lenDif; i++){
				num1 = "0" + num1;
			}
		}
		String[] sameLength ={num1,num2};
		return sameLength;
	}
/* and operation doing */
	public String andOp(String[] array){
		String num1 = array[0];
		String num2 = array[1];
		String finalNum = "";
		String[] number1 = num1.split("");
		String[] number2 = num2.split("");
		for(int i=0; i<num1.length(); i++){
			int nu1 = Integer.parseInt(number1[i]);
			int nu2 = Integer.parseInt(number2[i]);
			if(nu1==0){
				finalNum = finalNum + "0";
			}
			else{
				if(nu2==1){
					finalNum = finalNum + "1";
				}
				else{
					finalNum = finalNum + "0";
				}
			}
		}
		System.out.println(finalNum);
		return finalNum;
	}
/* number convert binary to decimal */
	public double finalValue(String num){
		String[] numArray = num.split("");
		double finalNumber = 0;
		for(int i=0; i< numArray.length; i++){
			int nu = Integer.parseInt(numArray[i]);
			int power = (numArray.length-1)-i;
			double multi = Math.pow(2,power);
			finalNumber = finalNumber + Integer.parseInt(numArray[i])*multi;
		}
		return finalNumber;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Number1 : ");
		int number1 = sc.nextInt();
		System.out.print("Number2 : ");
		int number2 = sc.nextInt();
		assignment as = new assignment();
		System.out.println(number1+" :	"+as.binary(number1));
		System.out.println(number2+" :	"+as.binary(number2));
		String[] array = as.lengthEqual(as.binary(number1), as.binary(number2));
		String and = as.andOp(array);
		System.out.println("Final Result = "+as.finalValue(and));
	}
}