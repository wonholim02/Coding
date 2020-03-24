/*
Chris Lim, Hyungkyu Lee
your#,21220
2019 Summer
APCS, Section C
This program prints 20 ranndom values, between 0 and 99, and prints the values again in numerical order
*/

import java. util. Arrays;
public class SummerHw{
   public static void main(String[] args){
      int[] number = new int[20];                  // the array length is 20
      
      System.out.println("Array Content: ");
     for( int i = 0; i<number.length; i++){       // assign a random value between 1 and 99 in the array and print the values 
         number[i] = (int)(Math.random() * 100);
         System.out.print(number[i] + " ");
      }
      
      System.out.println("");
      
      Arrays.sort(number);                        // sorts the array
      
      System.out.println("Array Content after sorting: ");
      
      for(int i : number){                        // prints the array
         System.out.print( i+" ");
      }
      
   }
}
