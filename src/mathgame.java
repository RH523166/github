











































import java.util.Scanner;
public class mathgame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int correctcount = 0; // score of the game
		int count = 1; // starts a count
		int difficulty = 1;
		Scanner input = new Scanner(System.in); // created a scanner
		
		
		
		while (count < 5) {	
		

		
		if ( difficulty == 1 && count < 5) { // program uses if correct count is 0
			int number1 = (int)(Math.random() * 10); //makes two random numbers 
			int number2 = (int)(Math.random() * 10);
			
			System.out.println("round " + count); // tells the player what round it is
			System.out.println("what is " + number1 + " plus " + number2 + "?"); // asks the first question
			int answer1 = input.nextInt(); // asks for the users answer to the question.
			
			if (number1 + number2 == answer1) { // checks if the answer is correct
				System.out.println("correct!"); // tells the user that he is correct
				correctcount++; // adds a point to the score
				System.out.println("total points: " + correctcount);// tells the player his score
				difficulty++;
				
			}
			else {
				System.out.println("Incorrect!"); // tells player he got it wrong
				System.out.println(number1 + " plus " + number2 + " is " + (number1 + number2));
				// shows the player what the right answer is
				}
			count++;	// adds 1 to the count so it knows what question it is on
		}
		
		
		
		if (difficulty == 2 && count < 5) { // uses this if correctcount is 1
			int number3 = (int)(Math.random() * 100); //makes two random numbers 
			int number4 = (int)(Math.random() * 100);
			
			System.out.println("round " + count); // tells the player what round it is
			System.out.println("what is " + number3 + " plus " + number4 + "?");// asks the harder question
			int answer2 = input.nextInt(); // asks for the users answer to the question.
			
			if (number3 + number4 == answer2){ // checks if the answer is correct
				System.out.println("Correct!");
				correctcount++;// adds a point to the score
				System.out.println("total points: " + correctcount); // tells the player his score
				difficulty++;
			}
			else {
				System.out.println("Incorrect!");
				System.out.println(number3 + " plus " + number4 + " is " + (number3 + number4));
				// shows the player what the right answer is
				difficulty--;
			}
			count++; // adds 1 to the count so it knows what question it is on
		}
		
		
		
		if (difficulty == 3 && count < 5) {
			int number5 = (int)(Math.random() * 10); //makes two random numbers between 1-9
			int number6 = (int)(Math.random() * 10);
			
			System.out.println("round " + count); // tells the player what round it is
			System.out.println("what is " + number5 + " times " + number6 + "?");// asks the harder question
			int answer3 = input.nextInt(); // asks for the users answer to the question.
			
			
			if (number5 * number6 == answer3){ // checks if the answer is correct
				System.out.println("Correct!");
				correctcount++; // adds a point to the score
				System.out.println("total points: " + correctcount); // tells the player his score
				difficulty++;
			}
			else {
				System.out.println("Incorrect!");
				System.out.println(number5 + " times " + number6 + " is " + (number5 * number6));
				// shows the player what the right answer is
				difficulty--;
			}
			count++; // adds 1 to the count so it knows what question it is on
		}
		
		
		
		if (difficulty == 4 && count < 5) {
			int number7 = (int)(Math.random() * 100); //makes two random numbers
			int number8 = (int)(Math.random() * 10);
			
			System.out.println("round " + count); // tells the player what round it is
			System.out.println("what is " + number7 + " times " + number8 + "?");// asks a harder question
			int answer4 = input.nextInt(); // asks for the users answer to the question.
			
			if (number7 * number8 == answer4){ // checks if the answer is correct
				System.out.println("Correct!");
				correctcount++; // adds a point to the score
				difficulty++;
				
			}
			else {
				System.out.println("Incorrect!");
				System.out.println(number7 + " times " + number8 + " is " + (number7 * number8));
				// shows the player what the right answer is
				difficulty--;
			}
			count++; // adds 1 to the count so it knows what question it is on
		}
		
		
		}
		
		
		System.out.println("Game over");
		System.out.println("total points: " + correctcount); // tells the player his final score
		System.out.println("Thanks for playing :)"); // end of the program 

	}

}
