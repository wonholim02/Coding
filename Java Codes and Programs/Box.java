/**************************************************************************
Name: Wonho Lim 
Description: This program get the height width and length by parameter and 
calculates sum of area,sufrace, and voulme of the box. 
***************************************************************************/ 
public class Box { //Box Class
   private double height; //make field
   private double width; 
   private double length; 
   
   public Box(){ //give basic values to fields
      height=1; //1
      width=1;
      length=1; 
   }
   
   public Box(double height2, double width2, double length2){ //get parameters and update fields
      height= height2;
      width= width2; 
      length= length2; 
   }
   
   public void setHeight(double up) { //get parameter and change height field(Setter)
      height=up; 
   }
   
   public void setWidth(double left) { //get parameter and change width field(Setter)
      width=left;
   }
   
   public void setLength(double right) { //get parameter and change length field(Setter)
      length=right;
   }
   
   public double calcVolume() { //calculate volume and return
      double volume = height * width * length; //calculate volume
      return volume; //return volume 
   } 
   
   public double calcSurfaceArea() { //calculate surface area and return
      double surfaceArea = 2*height*width + 2*height*length + 2*width*length; 
      return surfaceArea;  
   }
}
