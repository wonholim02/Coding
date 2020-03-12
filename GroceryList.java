/**********************************************************************************************
Name: Wonho Lim 
Class: APCS Section C 
Description: This program help user to add, remove, replace, display the grocery list as long
as they want and then quit if they want to.
**********************************************************************************************/ 
//importing needed things
import java.util.ArrayList;
import java.util.Scanner;
 
public class GroceryList{
   private ArrayList<String> list = new ArrayList<String>(); //add arraylist field
   Scanner scan = new Scanner(System.in); //add scanner
   
   public void start(){ //start method ask user what they want to do
      int answer = 0;
      System.out.println("This program help user to add, remove, replace, display the grocery list");
      System.out.println("(making own grocery list)as long as they want and then quit if they want to.");
      
      System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.replace 4.display 5.quit) ");
      answer = scan.nextInt(); //get the first answer before start the program
      
      while( answer != 5 ) { //until the user want to quit
         
         if( answer == 1 ){ //adding and asking again
            add();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.replace 4.display 5.quit) ");
            answer = scan.nextInt();
         }
         
         if( answer == 2 ){ //removing and asking again
            remove();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.replace 4.display 5.quit) ");
            answer = scan.nextInt();
         }
         
         if( answer == 3 ){ //replacing and asking again
            replace();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.replace 4.display 5.quit) ");
            answer = scan.nextInt();
         }
         
         if( answer == 4 ){ //displaying and asking again
            display();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.replace 4.display 5.quit) ");
            answer = scan.nextInt();
         }
      }
      System.out.println("Power off");//if the user put 5, end the program
   } 
   
   public void add(){ //adding
      System.out.print("What do you want to add? ");//aksing and getting values
      String adding = scan.nextLine();
      adding = scan.nextLine();  
      
      list.add(adding);
   }
   
   public void remove(){ //removing
      System.out.print("What do you want to remove? ");//aksing and getting values
      String removing = scan.nextLine();
      removing = scan.nextLine();
      
      if(list.contains(removing) == true) { //if exist
         list.remove(list.indexOf(removing));
      } else { //if it does not
         System.out.println("There is no such item!");
      }  
   }
   
   public void replace(){ //replacing
      System.out.print("What do you want to replace? ");//asking and getting values
      String replacing = scan.nextLine();
      replacing = scan.nextLine();
      System.out.print("With what? ");
      String instead = scan.nextLine();
      
      if(list.contains(replacing) == false) { //if it does not
         System.out.println("There is no such item!");
      } 
      if(list.contains(replacing) == true) { //if it is exist
         list.set(list.indexOf(replacing),instead); 
      } 
   }
   
   public void display(){ //displaying
      for(int i = 0; i < list.size(); i++){ //getting and displaying all the index one by one
         System.out.println(list.get(i));
      }
      System.out.println("There are " + list.size() + " items in your list."); //total number
   }
}