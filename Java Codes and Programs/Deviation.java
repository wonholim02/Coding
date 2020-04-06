/***************************************************************************** 
Name: Wonho Lim  
Description: This code get standard deviation of ages from person array 
*****************************************************************************/
public class Deviation {
   public double stdDev(Person[] ageArray, int size){ //get parameters
      
      double standardDeviation; //declaring and initializing values
      double total = 0;
      double average = 0;
      double differenceTotal = 0;
      
      //Calculations
      for(int i = 0; i < size; i++){ //get the sum of ages
         total = total + ageArray[i].getAge();
      }
      
      average = total / size; //get average
      for(int i = 0; i < size; i++){ //get the differece square total
         differenceTotal = differenceTotal + Math.pow(ageArray[i].getAge() - average , 2);
      }
      
      standardDeviation = Math.sqrt(differenceTotal / total); //final calculation
      
      return standardDeviation; //return
   }
}
