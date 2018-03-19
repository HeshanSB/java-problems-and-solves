/*Write a JAVA function to compute the Greater Common Divisor (GCD) of three given numbers. */
class Gcd{
	public int calGcd(int a, int b){
		if(b==0){
			return a;
		}
		else if (b>a){
			calGcd(b,a);
		}
		return calGcd(b,a%b);	
	}
	public static void main(String args[]){
		Gcd gcd = new Gcd();
		System.out.println(gcd.calGcd(35,20));
	}
}