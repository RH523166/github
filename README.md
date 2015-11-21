Robert Harms 
November 20, 2015
Dr. Evert
CompSc HW 10

	Project 1:
	In this homework assignment, we are using arrays and methods to sort numbers. it takes 6 numbers and sorts them from least to greatest.


####code:


public class array{
	public static void main(String[] args) {
		System.out.println("We will sort 2, 4, 3, 1, 7, 6 "); //tells the user what we are about to sort
		sort(); // calls on the other method to perform its task
		System.out.println("success.");
	}
	static void sort(){
		int list[] = {2, 4, 3, 1, 7, 6}; // creates an array with 6 numbers
		int x; // create a variable
		for(int j = 0; j < 6; j++){ // a for loop to repeat the sorting so it is done correctly	
	
		for(int i = 0; i < list.length - 1; i++){ // a for loop for the sorting
			if(list[i] > list[i + 1]){ // if the first number is larger than the second
				x = list[i + 1]; // creates a place holder for the switch
				list[i + 1] = list[i]; // switches the two numbers
				list[i] = x; // makes the first number become the second number
			}
		}
		}
		for(int i = 0; i < list.length; i++ ){
			System.out.print(list[i] + " "); // outputs the numbers in a sorted order
		 }
}
}

output:
We will sort 2, 4, 3, 1, 7, 6 
1 2 3 4 6 7 success.


	The program uses the array to hold the numbers while the for loop goes through checking and switching the numbers around making sure that they are in order from least to greatest.
	
	project 2:

This project take the addition game and uses arrays and methods with for loops to make it better. The array was used to hold the random numbers so they could be used. The for loop was used to cycle through the question as the rounds went on. 

Code:

import java.util.Scanner;
public class doodlebob {
	public static void main(String[] args) {
		int difficulty = 10; // establish variables
		int correctcount = 0;
		Scanner input = new Scanner(System.in); // create a scanner for input
		for (int count = 1; count <=4; count++){ // set a for loop for 4 rounds
			int a = array(difficulty); // establish variables inside loop so they reset each time
			int b = array(difficulty);
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
	public static int array(int difficulty){
		int number[] = new int[2];
		number[0] = (int)(Math.random() * difficulty);
		number[1] = (int)(Math.random() * difficulty);
		return number[1];
	}
}

output:

round 1: What is 2 plus 9?11
correct!
total points: 1
round 2: What is 59 plus 88?50
Incorrect!
59 plus 88 is 147
round 3: What is 6 plus 0?6
correct!
total points: 2
round 4: What is 46 plus 54?100
correct!
total points: 3
Game over
total points: 3
Thanks for playing :)

The arrays were used with a method to create the random numbers. When called upon it sent the numbers to the main method to be used. As it repeated itself, the number would change each time it was called upon. 
