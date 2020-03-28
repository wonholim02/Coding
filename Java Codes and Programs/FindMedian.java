/*************************************************************************************
Name: Wonho Lim 
Description: This code gets the int type array and find the median of them by sorting.
*************************************************************************************/ 
import java.util.Arrays; //importing Array

public class FindMedian {
  
  public double FindMedian(int[] newArray, int arraySize){ 
     
     Arrays.sort(newArray); 
     
     double median;
     
     if(arraySize % 2 == 0){  
     
        median = ( newArray [ arraySize / 2 - 1 ] + newArray [ arraySize / 2 ] ) / 2.0; //calculation
        
        return median; //return  median
     }
     
     median = newArray [ arraySize / 2 ]; 
        
     return median; 
  }
}
