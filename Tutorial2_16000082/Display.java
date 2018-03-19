class Display{
	public void pattern(){
		for(int i=0; i<11; i++){
			if(i<=5){
				for(int j=0; j<5-i; j++){
					System.out.print(" ");
				}
				for(int k=0; k<2*i+1; k++){
					System.out.print("*");
				}
			}
			else if(i>=6){
				for(int m=0; m<i-5; m++){
					System.out.print(" ");
				}
				for(int n=0; n<2*(11-i)-1; n++){
					System.out.print("*");
				}	
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		Display dp = new Display();
		dp.pattern();
	}
}