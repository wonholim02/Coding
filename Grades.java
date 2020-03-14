/************************************************************************************
Name: Wonho Lim 
Description:This program gets input from user about student's grades on homework and 
            two exams and then finalizes the student's course overall grade
************************************************************************************/

//importing Scanner from java.util
import java.util.Scanner;
public class Grades {
   static final int max = 100; //constant max value
   public static void main(String[] args) {
		introduction(); //introduction message
		Scanner in = new Scanner(System.in);//Scanner is used for methods
		double examscore = exam(in); //check exams
		double homeworkscore = homework(in); //chekc homeworks
		result(examscore,homeworkscore); //show final result
	}

   // Intro messege of the program   
	public static void introduction() {
		System.out.println("This program reads exam/homework scores");
		System.out.println("and reports your overall course grade.");
	}
   
   //this method get the values from user and calculate the weighted exam score
	public static double examCheck(Scanner in) {
      
		System.out.print("What is its weight (0-100)? "); //checck the weight
		int weight = in.nextInt(); //get the value
      
		System.out.print("Score earned? "); //check the score
		int score = in.nextInt();//get the value
      
		System.out.print("Was there a curve (1=yes, 2=no)? ");//check the curve
		int answer = in.nextInt(); //get the value
       
		if (answer == 1) {//check the amount of curve if it exists
			System.out.print("How much was the curve? "); //asking
			int curve = in.nextInt(); //get the value
         
			score += curve; //update the score after curve
         
			if (score > 100) { //if score is better than 100
				score = 100; //change it to 100
			}
		}
      
		double weightedScore = (double)score * weight / 100; //calculate the weighted score   
        
		System.out.println("Total points = " + score + " / " + max); //total point
		System.out.printf("Weighted score = %.1f / " + weight, weightedScore ); //until first deciaml
		System.out.println(); //blank
      
		return weightedScore; //return weighted score
	}

   
   // This calculates total weighted exam scores and returns that value
	public static double exam(Scanner in) {
		System.out.println();//blank	
		System.out.println("Exam 1: "); //exam 1
		double exam1 = examCheck(in); //get the value of exam 1
      		System.out.println();//blank
     		System.out.println("Exam 2: "); //exam 2
		double exam2 = examCheck(in); //get the value of exam 2
      		double exams = exam1 + exam2; //sum up
		return exams; //return the weighted exam scores
	}   

	// This is a method that asks about the homework and prints out the weighted score.
	public static double homework(Scanner in) {
		//these are variables we need to use
      		int totalScore = 0;
		int maxScore = 0;
  
		System.out.println(""); //blank
		System.out.println("Homework: "); //homwework section
      
		System.out.print("What is its weight (0-100)? "); //check the weight
		int weight = in.nextInt(); //get the value 
      
		System.out.print("Number of assignments? "); //check the number of homework assignment
		int assignments = in.nextInt(); //get the value
      
		for (int i=1; i <= assignments; i++) { //get the all value of homeworks
			System.out.print("Assignment " + i + " score and max? "); //asking
			int score = in.nextInt(); //get the score
			int max = in.nextInt(); //get the max
			
         	totalScore += score; //update score
		maxScore += max; //update max
		}
      
      double homeworks = (double)totalScore * weight / maxScore; //calculation      
      
		System.out.print("How many sections did you attend? "); //check sections
		int section = in.nextInt(); //get the value
		int sectionPoint = section*3; //make sectionpoint 
		
      if (sectionPoint > 20) { //if sectionpoint is bigger than 20
			sectionPoint = 20; //just 20
		}
      
		if (totalScore > maxScore) { //if totalpoint is bigger than max 
			totalScore = maxScore; //just max
		}
		
      System.out.println("Section points = " + sectionPoint + " / 20"); //show the sectionpoint
		totalScore += sectionPoint; ///update totalpoint
		maxScore += 20; //update totalmax
      
      if (totalScore > maxScore){
         totalScore = maxScore;
		}
    
        System.out.println("Total points = " + totalScore + " / " + maxScore); //show total point	
        System.out.printf("Weighted score = %.1f / " + weight, homeworks); //up to first decimal
	System.out.println(); //blank	
        return homeworks; //return weighted homwork score 
	} 
  
   // This method tells the overall percentage and GPA.  
	public static void result(double exams, double homeworks) {
      double grade = exams + homeworks; //calculate final score
		String message = "Study hard!"; //set basic message(if score is lower than 60) 
      double gpa = 0.0; //set basic gpa(if score is lower than 60)
      
      System.out.println("");//blank 
		System.out.printf("Overall percentage = %.1f", grade); //up to first decimal
		System.out.println("");//blank

      if(grade > 60) { //if score is better than 60
			message = "Nice try but needs more effort!"; //update message
			gpa = 0.7; //set gpa
	   }
      if (grade > 75) { //if score is better than 75
         message = "Not bad! You can still make more improvements!"; //set message
			gpa = 2.0; //set gpa
  		}
      if (grade > 85) { //if score is better than 85
				message = "FANTASTIC!"; //set message
            gpa = 3.0; //set gpa
		} 
      
		System.out.println("Your grade will be at least: " + gpa); //show grade
		System.out.println(message); //show message
   }
}
