
import java.util.Scanner;
public class mathgame20 {
	public static void sub(String[] args) {
		int difficulty = 10;
		int correctcount = 0;
	
		for (int count = 1; count <=4; count++){
			int a = (int)(Math.random() * difficulty);
			int b = (int)(Math.random() * difficulty);
			
	}
	}
	public static void main(String[] args) {
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
	}
}
}