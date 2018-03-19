/* Create a Point.java class and add a functionality to, 
a. Get the distance from the root 
b. Move a point and how can we get the distance of two points? */
class Point{
	int num1;
	int num2;
	Point(int n1, int n2){
		num1 = n1;
		num2 = n2;
	}
	public void distanceRoot(){
		double dis1 = Math.sqrt((num1*num1)+(num2*num2));
		System.out.println(dis1);
	}
	public void distanceBetween(Point po1 , Point po2){
		double dis2 = Math.sqrt((po1.num1-po2.num1)*(po1.num1-po2.num1)+(po1.num2-po2.num2)*(po1.num2-po2.num2));
		System.out.println(dis2);
	}
}

class test{
	public static void main(String args[]){
		Point p1 = new Point(0,4);
		Point p2 = new Point(0,5);
		p1.distanceRoot();
		p1.distanceBetween(p1, p2);
	}
}
