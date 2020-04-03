/*********************************************************************************************
Name: Wonho Lim 
Description: This program get the location of taxi first, get the moved distance by parameter,
and then update total distance
*********************************************************************************************/ 
public class Taxicab { //class Taxicab
   private int x; //make field
   private int y;
   private int total;
   
   public Taxicab(){ //give basic values to fields
      x = 0; 
      y = 0; 
      total = 0; 
   }
   
   public Taxicab(int xgo, int ygo){ //get parameters and update fields except total
      x = xgo; //update
      y = ygo; //update
      total = 0; //total still 0
   }
   
   public int getXCoord(){ ////getter of xcordination(return it)
      return x; //return x
   }
   
   public int getYCoord(){ //getter of ycordination(return it)
      return y; //return y
   }
   
   public int getDistanceTraveled(){ //getter of total
      return total; //return total 
   }
   
   public void moveX(int horizontal){ //get value from parameter and update fields
      x = x + horizontal; //add distance
      total = total + Math.abs(horizontal); //update total
   }
   
   public void moveY(int vertical){ //get value from parameter and update fields
      y = y + vertical; //add distance
      total = total + Math.abs(vertical); //update total
   }
}
