
import java.util.Scanner;
public class mathgame2 {
	public static int sum(int ran, int dom){
		int result = (int)Math.random(); 
		
		//dom = (int)Math.random();
		
			return result;
		
	}
	public static void main(String[] args) {
		int difficulty = 10;
		int correctcount = 0;
		Scanner input = new Scanner(System.in); // created a scanner

		
		for (int count = 1; count <=4; count++){
			System.out.print("round " + count + ": ");
			int a = (int)(Math.random() * difficulty);
			int b = (int)(Math.random() * difficulty);
			System.out.print("What is " + a + " plus " + b + "?");
			int answer = input.nextInt(); // asks for the users answer to the question.
			if (a + b == answer) { // checks if the answer is correct
				System.out.println("correct!"); // tells the user that he is correct
				correctcount++; // adds a point to the score
				System.out.println("total points: " + correctcount);// tells the player his score
				difficulty *= 10;
				
			}
			else {
				System.out.println("Incorrect!"); // tells player he got it wrong
				System.out.println(a + " plus " + b + " is " + (a + b));
				if (difficulty > 10)
					difficulty /= 10;
				// shows the player what the right answer is
				}
		}
		System.out.println("Game over");
		System.out.println("total points: " + correctcount); // tells the player his final score
		System.out.println("Thanks for playing :)"); // end of the program 
		
	}
	
}
