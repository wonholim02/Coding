/************************************************************************************* 
Name: Wonho Lim
Description: This code prints out longest word that was typed by using sentinel value.
The program ifinifely repeats until the user put goodbye as a input. After user type
goodbye, it will show length of greatest string that user have printed. 
**************************************************************************************/

//import scanner for the program
import java.util.Scanner;
//give a class name for the program
public class SentinelProgram {
   public static void main (String[] args) {
      //Create an object for scanner
      Scanner scan = new Scanner(System.in);
      //Show direction to user and make them to choose
      System.out.print("Type a word (or \"goodbye\" to quit): ");
      //Scan a string and save it
      String line  = scan.nextLine();
      //This will save the length of all strings
      int length = 0;
      //This will save the length of longest string
      int longestLength = 0;
      //This will save exact string of the longest string
      String longestString = "";
      //It infinifely repeats until the goodbye typed. After then, it will show length and string of the longest string.
      while (!line.equals("goodbye")){
      //This make the user input's length
         length = line.length();
         //it happens only if new input is longer than former longest line
         if (length > longestLength){ 
            //Save the new input's length
            longestLength = length;
            //Save the new input's exact string
            longestString = line;
            }
            //Show direction to user and make them to choose
            System.out.print("Type a word (or \"goodbye\" to quit): ");
            //Scan a new input that user give and apply again
            line = scan.nextLine();
      }
      //Finally shows the result, word that user typed and its length 
      System.out.println("The longest word you typed was \"" + longestString + "\" (" + longestLength + "letters)"); 
   }   
}
