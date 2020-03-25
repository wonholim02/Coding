/***************************************************************************************
Name: Wonho Lim
Description: This program is a mini substraction game that provides highest score at last.
             3~6 six random numbers are given to players and players should calculate them
             properly to earn a point. 
********************************************************************************************/
import java.util.Scanner; 
public class SubstractionGame {

	public static void main(String[] args) {
                int number; //initialize the number
                int point = 0; //the point that user gets after giving correct answer.
                int answer = 0; //player's answer
                int respond = 1; //checking whether the user wants to keep playing the game
		int bestScore = 0; //save the highest score that the user get
		boolean again = true; //whether the player is correct or not
		Scanner in = new Scanner(System.in); //scanner for receving user's input
      
		do { //do while loop
			String question = ""; //initialize string for question 
			number = (int)(Math.random() * 18) - 5; //slelect a random number
			answer = number; //set the answer
			question = String.valueOf(number); //change the form of random number to string
			
         //to make an equation with 3~6 numbers, I used two for loops
         for(int i = 0; i < 2; i++) {  //pick two random number
				number = (int)(Math.random() * 18) - 5; 
            
				answer = answer - number; //update the answer
				question = question + " - " + number; //update the question
			}
         
			for(int i = 0; i < (int)(Math.random() * 4); i++) { //pick several(1~4 numbers) random numbers
				number = (int)(Math.random() * 18) - 5;
				answer = answer - number; //update the answer
				question = question + " - " + number; //update question
			}
			System.out.print(question + " = "); //show the question
			int response = in.nextInt(); //get the answer from the player
         
			if(response == answer) { //if the answer is correct
           			 point++; //add a point
				again = true; //keep let it be true
			} else { //if the answer is not correct
				again = false; //change the boolean value to false to exit. 
				
            		if(point > bestScore) { //update the highest score if needed
					bestScore = point;
				}
            
			System.out.println("Wrong! The answer was " + answer); //show the correct answer for loser
			System.out.print("Try again? (1 for yes, 2 for no) "); //ask whether the player wants to play again
			respond = in.nextInt(); //get the player's response whether the player will play again or not
			System.out.println();
				
            		if(respond == 1) {
              		 	point = 0; //reset the point
				again = true; //change boolean to true
			}
		}
	} while(again == true); //until the user gets wrong, the loop infinitely repeated
		System.out.println("Your highest score was " + bestScore + "."); //print the highest score at last
    }
}
