/*QUESTION 1. Define a dog class mentioned above and give birth to Leader and Lassy. 
a. By birth their stomach is empty. 
b. Feed some meat to Lassy. //
c. If a strange man comes near by simulate the reaction of Leader.
d. One years gone.
e. Keep track of siblings.*/
class Dog{
	public String name;
	public String type;
	public String color;
	public int age;
	public String stomach;
	public static int siblings;
	Dog(){
		siblings = siblings + 1;
		stomach = "Empty";
		System.out.println("Stomach is Empty. Siblings = "+ siblings);	
	}
	public void feed(){
		stomach = "Full";
		System.out.println("Stomach is full");
	}
	public void reaction(){
		System.out.println("Barke.......");
	}
	public void oneYear(){
		age = age +1;
		System.out.println("One year a go!! age = "+ age);
	}
}

class Birth{
	public static void main(String args[]){
	Dog d1 = new Dog();
	Dog d2 = new Dog();
	d1.name = "Leader";
	d1.type = "Dobberman";
	d1.color = "Brown";
	d1.age = 3;
	d2.name = "Lassy";
	d2.type  = "G.Shepherd";
	d2.color  = "Mix";
	d2.age  = 5;
	d2.feed();
	d1.reaction();
	d1.oneYear();
	d2.oneYear();
	}
}