/*Write a JAVA program to calculate the surface area and the volume of a cube. You must define separate operations 
to calculate the surface area and the volume.*/ 
import java.util.Scanner;
class cube{
	int length;
	public int area(int l){
		length = l;
		int a = 6*l*l;
		return a;
	}
	public int volume(int l){
		length = l;
		int v = l*l*l;
		return v;
	}
	public static void main(String args[]){
		cube cu = new cube();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter cube length : ");
		int r = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter what you want(area/volume) : ");
		String av = sc.nextLine();
		switch(av){
		case("area"):
			System.out.println("Cube surface area = "+ cu.area(r));
			break;
		case("volume"):
			System.out.println("Cube volume = "+cu.volume(r));
			break;
		}
	}
}
