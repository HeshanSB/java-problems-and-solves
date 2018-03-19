/* Find whether a given number(N) reaches to 1 after performing following two operations, 
If current value(x) is even, then x = x/2. 
If current value(x) is odd, then x = 3*x + 1. 
Example, for N = 12, 
we get the sequence 12, 6, 3, 10, 5, 16, 8, 4, 2, 1.  */
class Number{
	public void givenNum(int n){
		if(n ==1){
		}
		else if(n%2==0){
			n = n/2;
			System.out.println(n);
			givenNum(n);
		}
		else{
			n = 3*n+1;
			System.out.println(n);
			givenNum(n);
		}
	}
	public static void main(String args[]){
		Number num = new Number();
		num.givenNum(12);
	}
}