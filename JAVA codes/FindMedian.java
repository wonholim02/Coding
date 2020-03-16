/***************************************************************************** 
Name: Wonho Lim 
Description: This gets the int array and find the median of them by sorting.
*****************************************************************************/ 
import java.util.Arrays; //to sort array late, import array

public class FindMedian {
  
  public double FindMedian(int[] newArray, int arraySize){ //get two parameters
     
     Arrays.sort(newArray); //sorting the array
     
     double median;
     
     if(arraySize % 2 == 0){ //if there are even number of ints 
     
        median = ( newArray [ arraySize / 2 - 1 ] + newArray [ arraySize / 2 ] ) / 2.0; //calculation
        
        return median; //return  median
     }
     
     median = newArray [ arraySize / 2 ]; //if there are odd number of ints
        
     return median; //return median
  }
}
