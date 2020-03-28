/************************************************************************************* 
Name: Wonho Lim
Description: This code prints out longest word that was typed by using sentinel value.
The program ifinifely repeats until the user put goodbye as a input. After user type
goodbye, it will show length of greatest string that user have printed. 
**************************************************************************************/

//importing scanner for the program
import java.util.Scanner;

public class SentinelProgram {
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      //Show direction to user and make them to choose
      System.out.print("Type a word (or \"goodbye\" to quit): ");
      String line  = scan.nextLine();
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
            longestLength = length;
            longestString = line;
            }
            System.out.print("Type a word (or \"goodbye\" to quit): ");
            line = scan.nextLine();
      }
      //Finally shows the result, word that user typed and its length 
      System.out.println("The longest word you typed was \"" + longestString + "\" (" + longestLength + "letters)"); 
   }   
}
