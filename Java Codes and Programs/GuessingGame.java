/********************************************************************************************************
Name: Wonho Lim
Description: This program is a mini game which interacts with player. The program pick a random integer 
asks the user guesses the number correctly. If the user gives incorrect value, the program shows whether 
guessed number is higher or lower. If the user gets the correct answer, the program asksuser whether they 
want to keep playing or not. Finally, after the user stops, the program shows the overall result of games. 
********************************************************************************************************/

//importing Scanner from java.util
import java.util.Scanner; 
public class GuessingGame {

	public static void main(String[] args) {
		
      		haiku(); //print my haiku
		int trial=0; //number of trials
		int totalGames = 1; //total number of games
		int totalGuess = 0; //total number of guesses
		int bestScore = 0; //the best score that user made
      		final int MAX = 100; //maximum number to decalre the range of number
    		boolean check = true; //check whether the player wants to play again or not
    		char smallY = 'y'; //samll case y
	  	char capitalY = 'Y'; //capital case Y
      
      		while(check == true) {
			trial = 0; //reset trial to 0 for a new game 
         		int randomNumber = (int)(Math.random() * MAX) + 1; //picks a random number
			
         		System.out.println("I'm thinking of a number between 1 and " + MAX + "...");
         		Scanner in = new Scanner(System.in); //gets input from the user
			System.out.print("Your guess? "); //asks the answer
			int answer = in.nextInt();//gets user's answer
			
         		trial = asking(randomNumber, answer, trial); //asking user new answer
			trial++; //add trial by 1 after guessing
			
         		if(totalGames == 1) { //if it's a first game that the user had
					bestScore = trial; //change best score to the first game's score
			}
			if(trial < bestScore) { //if the score is even smaller than best score
				bestScore = trial; //change best score to last game's score
			}
     
			totalGuess = totalGuess + trial; //update total guesses
         
			if(trial == 1) { //if get the answer at once
				System.out.println("You got it right in " + trial + " guess!"); //print guess number
			} else {
				System.out.println("You got it right in " + trial + " guesses!"); //print guess number
			}
         
			System.out.print("Do you want to play again? "); //ask whether user wants to play again
			String checkString = in.next(); //get user's input
			System.out.println(); 
			char[] checkArray = checkString.toCharArray(); //change input to array with characters
			if(checkArray[0] == capitalY || checkArray[0] == smallY) { //if first letter is Y or y
				totalGames++; //increase total number of games
			} else {
				check = false; //get out of do-while loop
			}
			
		}
		result(totalGames, totalGuess, bestScore); //prints results of the game at last
	}
	
   		//This method prints my haiku
   		public static void haiku(){
     		System.out.println("Hello, new player!");
     		System.out.println("This is a good guessing game.");
     		System.out.println("I hope you like it!");
		}
   
		//This is a method makes user to play game.
		public static int asking(int randomNumber, int answer, int trial) {
		Scanner in = new Scanner(System.in); //use scanner 
		while(answer != randomNumber) { //while the answer and the number is different
			  //infinitely asks until get a correct answer
			if(answer > randomNumber) { //if answer is bigger than the number
				System.out.println("It's lower."); 
				System.out.print("Your guess? ");
				answer = in.nextInt(); //ask the new answer
			}  
         		if(answer < randomNumber) { //if answer is smaller than the number 
				System.out.println("It's higher.");
				System.out.print("Your guess? "); 
				answer = in.nextInt(); //ask the new answer
			}
			trial++; //add trial by 1 after each guesses that player makes
		}
		return trial; //return the value of trial
	}
	
	//This method shows overall result of games that player had
	public static void result(int totalGames, int totalGuess, int bestScore) {
		double guessOverGame = (double)totalGuess / totalGames; //divide guesses by games(Average)
		System.out.println("Overall results:"); //Overall results 
		System.out.println("Total games   = " + totalGames); //total number of games 
		System.out.println("Total guesses = " + totalGuess); //total number of guesses
		System.out.print("Guesses/game  = "); // average guesses per game
		System.out.printf("%.1f", guessOverGame); //round up the value
		System.out.println(""); // change the line
		System.out.println("Best game     = " + bestScore); //best game's guess number
      }
}
