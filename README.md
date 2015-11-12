Robert Harms 
November 11, 2015
Dr. Evert
CompSc HW 9

	#Math game
	In this homework assignment, we are taking the math game that we did in a previous 
	assignment and improving it. We use for loops and methods to improve this code by
	making it shorter and less repititive. 

1. establish variables
2. set the for loop
	a. ask the question
	b. ask for the player's answer
	c. make an if statemnt for the correct answer
		- give the player a point
		- raise the difficulty
	d. make an else statement for the incorrect answer
		- tell them the right answer
		- lower if difficulty if it is not the lowest
3. game over
	a. add up the points
	b. thank the player for playing

####code:

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


####output:

 round 1: What is 7 plus 6?13
correct!
total points: 1
round 2: What is 83 plus 75?155
Incorrect!
83 plus 75 is 158
round 3: What is 1 plus 3?4
correct!
total points: 2
round 4: What is 73 plus 67?140
correct!
total points: 3
Game over
total points: 3
Thanks for playing :)


I could not see a use for another method so I just used the for
loop so the out put is a test of the for loop and the entire system.
I shortened it quite a bit, but could not figure out what to do with
another method to help this program. the for loop is in place to
count the rounds and within the code it changes based on the difficulty
the player is at. I put the random number generator inside the loop so
it would also repeat itself and give the user random numbers every round. 

For the command prompt, i used git hub to pull down and push all my work
to my repository. I merged the report, outline, and code all together
to make it one single report. 
