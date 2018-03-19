/*Create a class for a Die. It should change its value randomly each time it rolls. Extend the program into two dice game.
Roll two dice and if the total gets 7, you win. */
import java.util.Random;
class Die{
	int value;
	public int rollDie(){
		Random rand = new Random();
		this.value = rand.nextInt(6)+1;
		return value;
	}
	public static void main(String args[]){
		Die d1 = new Die();
		Die d2 = new Die();
		if((d1.rollDie() + d2.rollDie())== 7){
			System.out.println("You win!!!!");
		}
		else{
			System.out.println("You lost, try again...");
		}
	}
}
