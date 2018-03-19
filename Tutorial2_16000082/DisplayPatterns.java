class DisplayPatterns{
	public void pattern1(){
		for(int i = 0; i<6; i++){
			for(int j = 0; j<10; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pattern2(){
		for(int i = 0; i<6; i++){
			if (i==0 || i==5){
				for(int j=0; j<10; j++){
					System.out.print("*");
				}
			}
			else{
				System.out.print("*");
				for(int k=0; k<8; k++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pattern3(){
		for(int i=0; i<6; i++){
			for(int j=0; j<i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pattern4(){
		for(int i=0; i<6; i++){
			for(int j=0; j<6-i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		DisplayPatterns dp = new DisplayPatterns();
		dp.pattern1();
		System.out.println();
		dp.pattern2();
		System.out.println();
		dp.pattern3();
		System.out.println();
		dp.pattern4();
	}
}