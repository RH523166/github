import java.util.Scanner;
public class doodlebob {
	public static void main(String[] args) {
		int difficulty = 10; // establish variables
		int correctcount = 0;
		Scanner input = new Scanner(System.in); // create a scanner for input
		for (int count = 1; count <=4; count++){ // set a for loop for 4 rounds
			int a = (int)(Math.random() * difficulty); // establish variables inside loop so they reset each time
			int b = (int)(Math.random() * difficulty);
			System.out.print("round " + count + ": "); // ask questions to player
			System.out.print("What is " + a + " plus " + b + "?");
			int answer = input.nextInt(); // asks for players response
			if (a + b == answer) { // checks if the answer is correct
				System.out.println("correct!"); // tells the user that he is correct
				correctcount++; // adds a point to the score
				System.out.println("total points: " + correctcount);// tells the player his score
				difficulty *= 10; // adds the difficulty
				
			}
			else {
				System.out.println("Incorrect!"); // tells player he got it wrong
				System.out.println(a + " plus " + b + " is " + (a + b));
				if (difficulty > 10) // lowers difficulty if he is higher than level one
					difficulty /= 10;
			}
		}
		System.out.println("Game over");
		System.out.println("total points: " + correctcount); // tells the player his final score
		System.out.println("Thanks for playing :)"); // end of the program 
	}
}

