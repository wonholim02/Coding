/* 
Name: Wonho Lim 
Class: APCS Section C 
Date: 21 September 2019 
Description: This program get the height width and length by parameter and 
calculates sum of area sufrace and voulme. 
*/ 
public class Box { //Box Class
   private double height; //make field
   private double width; //make field
   private double length; //make field
   
   public Box(){ //give basic values to fields
      height=1; //1
      width=1; //1
      length=1; //1
   }
   
   public Box(double height2, double width2, double length2){ //get parameters and update fields
      height= height2; //update
      width= width2; //update
      length= length2; //update
   }
   
   public void setHeight(double up) { //get parameter and change height field(Setter)
      height=up; //update
   }
   
   public void setWidth(double left) { //get parameter and change width field(Setter)
      width=left;//update
   }
   
   public void setLength(double right) { //get parameter and change length field(Setter)
      length=right;//update
   }
   
   public double calcVolume() { //calculate volume and return
      double volume = height * width * length; //calculate volume
      return volume; //return volume 
   } 
   
   public double calcSurfaceArea() { //calculate surface area and return
      double surfaceArea = 2*height*width + 2*height*length + 2*width*length; //calculate sum of areas
      return surfaceArea; //return surface area 
   }
}