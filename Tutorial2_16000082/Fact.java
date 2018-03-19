/*Write a recursive JAVA function to get the following output regarding factorial. */
class Fact{
	public int Factorial(int n){
		if(n==1){
			return 1;
		}
		else if(n==2){
			return 2;
		}
		else{
			return n*Factorial(n-1);
		}
		
	}
	public static void main(String[] args){
		Fact F1 = new Fact();
		System.out.println(F1.Factorial(5));
	}
}