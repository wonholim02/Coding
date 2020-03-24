/*************************************************************************************************************
Name: Wonho Lim 
Description: This code investigates the income and expense of user, calculates the difference 
between user's income and expense, and shows the statistical values and notice what kind of person the user is. 
*************************************************************************************************************/ 

//importing Scanner from java.util
import java.util.Scanner; //import scanner to get a input from users.
public class Budgeter { //class named Budgeter
   public static void main(String[] args) {
   intro();
   result();
   }
   
   public static void intro() { //intro messages for the program
      System.out.println("This program asks for your monthly income and");
      System.out.println("expenses, then tells you your net monthly income.");
      System.out.println("");
   }   
   
   //Scanner as a method is needed because we can only use 1 scanner object
   public static double scan() {
      Scanner in = new Scanner(System.in); //make new scanner
      
      double number; //make a variable call number
      
      number = in.nextDouble(); //store the user's input to number
      
      return number; //return user's input as a number to use it
   }
   
   //return the total income of user
   public static double income(){
      //initializing and declaring the variables we need
      double totalIncome = 0;
      double incomeCategories = 0;
      double income;
      
      //asking how many categories we user have and save it
      System.out.print("How many categories of income? "); //asking
      incomeCategories = scan(); //get the user's answer
      
      while(incomeCategories != 0){ //until income categories become zero
         System.out.print("    Next income amount? $"); //asking incomes
         income = scan(); //get the values
         totalIncome = totalIncome + income; //update the total income
         incomeCategories--; //decrease remaining number of income categories by 1
         }
      //return the total income at last    
      return totalIncome;
   }
   
   public static double spend(){
      //initializing and declaring the variables we need
      double totalExpense = 0.00;
      double expenseCategories = 0;
      double expense;
      
      System.out.print("How many categories of expense? ");//asking user the number of categories
      expenseCategories = scan(); //get the user's answer
      
      while(expenseCategories > 0){ //until expense categories become zero
         System.out.print("    Next expense amount? $"); //asking expenses
         expense = scan(); //get the values
         totalExpense = totalExpense + expense; //update the total value
         expenseCategories--;  //decrease remaning number of expense categories by 1
      }
      //return the total expense at last
      return totalExpense;
   }
   
   //asking user whether the total expense is daily expense or montly expense  
   public static int daycount2(){
      //initializing and declaring the variables we need
      int days2 = 1;
      double response2;      
      System.out.println("");//blank
      System.out.print("Enter 1) monthly or 2) daily expenses? "); //asking user
      response2 = scan(); //get the user input 
      if (response2 == 1){ //if the user put 1
         days2 = 31; //one month is 31 days so days is 31
      }
      if (response2 == 2){ //if the user put 2 
         days2 = 1; //daily is just one day so days is 1
      }
      return days2; //return the day value at last
   }
   
   //show the final result to user
   public static void result(){
   //calling methods and return values
      final int DAY = 31; //constant day value for 1 month
      double totalIncome = income();
      int days2 = daycount2();
      double totalExpense = spend();
      
      //if it is daily expense, we should muliply by 31 to get a monthly(total) value
      if(days2 == 1){
         totalExpense = totalExpense*DAY;
      }
      
      //to get a daily values, devide total income and expense by DAY
      double incomePerDay = totalIncome / DAY;
      double expensePerDay = totalExpense / DAY;
      
      //show total income
      System.out.println("");
      System.out.print("Total income = $");
      System.out.printf("%.2f", totalIncome); //round up to second decimal
      System.out.print(" ($");
      System.out.printf("%.2f", incomePerDay); //round up to second decimal
      System.out.println("/day)");
      
      //show total expenses
      System.out.print("Total expenses = $");
      System.out.printf("%.2f", totalExpense); //round up to second decimal
      System.out.print(" ($");
      System.out.printf("%.2f", expensePerDay); //round up to second decimal
      System.out.println("/day)");
      System.out.println("");
      
      //show what type of person the user is due to expense and income value and give custom messege 
      //if total income is bigger than total expense but the gap is samller than 250, consider as a saver
      if(totalIncome>totalExpense && (totalIncome-totalExpense) < 250){
         System.out.print("You earned $"); 
         System.out.printf("%.2f", totalIncome-totalExpense); //round up to second decimal
         System.out.println(" more than you spent this month.");
         System.out.println("You're a saver.");
         System.out.println("Good! Please Keep that good spending habit!"); //my own custom line 
      }
      //if total income is bigger than total expense and gap is bigger than 250, consider as a big saver
      if(totalIncome>totalExpense && (totalIncome-totalExpense) > 250){
         System.out.print("You earned $");
         System.out.printf("%.2f", totalIncome-totalExpense); //round up to second decimal
         System.out.println(" more than you spent this month.");
         System.out.println("You're a big saver.");
         System.out.println("Your habit is respectable, but sometimes you should use some money for yourself."); //my own custom line
      }
      //if total expense is bigger than total income and gap is smaller than 250, consider as a spender
      if(totalIncome<totalExpense && (totalExpense-totalIncome) < 250){
         System.out.print("You spent $");
         System.out.printf("%.2f", totalExpense-totalIncome); //round up to second decimal
         System.out.println(" more than you earned this month.");
         System.out.println("You're a spender.");
         System.out.println("It will be better if you save more money."); //my own custom line
      }
      //if total expense is bigger than total income and gap is bigger than 250, consider as big spender
      if(totalIncome<totalExpense && (totalExpense-totalIncome) > 250){
         System.out.print("You spent $"); 
         System.out.printf("%.2f", totalExpense-totalIncome);  //round up to second decimal
         System.out.println(" more than you earned this month.");
         System.out.println("You're a big spender.");
         System.out.println("You are spending too much money!"); //my own custom line
      }
      //if total expense and income is equal, consider as spender
      if(totalIncome == totalExpense){
         System.out.print("You spent $"); 
         System.out.printf("%.2f", totalExpense-totalIncome); //round up to second decimal
         System.out.println(" more than you earned this month.");
         System.out.println("You're a spender.");
         System.out.println("It will be better if you save more money."); //my own custom line   
      }
   }
}
