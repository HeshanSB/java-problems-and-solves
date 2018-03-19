class numb{
	int num1 = 0;
	int increment(int n){
		num1 = num1 + n;
		return num1;
	}
	int decrement(int n){
		num1= num1 - n;
		return num1;
	}
}
class operations{
	int add(int n1, int n2){
		return n1+n2;
	}
	int multi(int n1, int n2){
		return n1*n2;
	}
	int sub(int n1, int n2){
		return n1-2;
	}
	int divide(int n1, int n2){
		return n1/n2;
	}
}
class number{
	public static void main(String args[]){
		operations op1 = new operations();
		System.out.println(op1.add(2,3));
	}
}