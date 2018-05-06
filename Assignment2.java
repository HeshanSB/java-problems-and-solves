\*right shift and left shift inn java*\
import java.util.Scanner;
class Assignment2{
	public String octalToBinary(int n){
		String octalNum = Integer.toString(n);
		String[] octalNumArray = octalNum.split("");
		String fullDecimalNum = "";
		int num = 0;
		int i = 0;
		for(i=0; i<octalNumArray.length; i++){
			num = Integer.parseInt(octalNumArray[i]);
			String binaryNum ="";
			if(num != 0){
				while(num > 0){
					binaryNum = Integer.toString(num%2) + binaryNum; 
					num = num/2;
				}
			}
			else{
				binaryNum = "000";
			}
			if(binaryNum.length()== 1){
				binaryNum = "00"+binaryNum;
			}
			else if(binaryNum.length()== 2){
				binaryNum = "0"+binaryNum;
			}
			fullDecimalNum = fullDecimalNum + binaryNum;
		}
		return fullDecimalNum;
	}
	public int binaryToDecimal(String m){
		String[] binaryArray = m.split("");
		int decimalNum = 0;
		for(int i = 0; i < binaryArray.length; i++){
			int nu = Integer.parseInt(binaryArray[i]);
			decimalNum = decimalNum + (int)Math.pow(2,binaryArray.length-i-1)*nu; 
		}
		return decimalNum;
	}
	public String leftShift(String s, int shift){
		for(int i=0; i<shift; i++){
			s = s+"0";
		}
		return s;
	} 
	public String rightShift(String s, int shift){
		String[] shiftArray = s.split("");
		String shiftNum ="";
		for(int i=0; i<shiftArray.length-shift; i++){
			shiftNum = shiftNum+shiftArray[i];
		}
		
		return shiftNum;
	}
	public static void main(String args[]){
		Assignment2 as = new Assignment2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Octal Number : ");
		int oNum = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Right(R) or Left(L) shift : ");
		String shiftString= sc.nextLine();
		char shiftChar = shiftString.charAt(0);
		int sR = 0;
		int sL = 0;
		if (shiftChar != 'R' && shiftChar != 'L'){
			System.out.print("Please Enter \"R\" or \"L\" : ");
			shiftString = sc.nextLine();
			shiftChar = shiftString.charAt(0);
			if(shiftChar == 'R'){
				System.out.print("Enter how many right shifts : ");
				sR = sc.nextInt();
			}
			else if(shiftChar == 'L'){
				System.out.print("Enter how many left shifts : ");
				sL = sc.nextInt();
			}
		}
		else if(shiftChar == 'R'){
			System.out.print("Enter how many right shifts : ");
			sR = sc.nextInt();
		}
		else if(shiftChar == 'L'){
			System.out.print("Enter how many left shifts : ");
			sL = sc.nextInt();
		}
		String binary = as.octalToBinary(oNum);
		System.out.println("\n\nNumber1 :  "+ as.binaryToDecimal(binary));
		if(sR!=0){
			System.out.println("Number of bits to shifted  :  "+ sR+"\n");
			System.out.println("Binary format of Number1  :  "+binary+"\n");
			String rShift = as.rightShift(binary,sR);
			System.out.println("Perform bitwise Left shift(<<) opertion\n                 "+rShift+"\n");
			System.out.println("----------------------------------------------\n Final Result Decimal "+as.binaryToDecimal(rShift)+"\n---------------------------------------------------------");
		}
		else if(sL!=0){
			System.out.println("Number of bits to shifted  :  "+ sL+"\n");
			System.out.println("Binary format of Number1  :  "+binary+"\n");
			String lShift = as.leftShift(binary,sL);
			System.out.println("Perform bitwise Left shift(<<) opertion\n                 "+lShift+"\n");
			System.out.println("----------------------------------------------\n Final Result Decimal "+as.binaryToDecimal(lShift)+"\n---------------------------------------------------------");
		}
	}
}