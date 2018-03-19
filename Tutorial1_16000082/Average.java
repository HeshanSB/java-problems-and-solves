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