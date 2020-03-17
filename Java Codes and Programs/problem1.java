public class problem1{
   public static void main(String[] args){
      
      displacement( 3.0 , 4.0 , 5.0 );
      
   }
   
   public static double displacement(double v, double a, double t) {
      double d;
      d= v * t + 0.5 * a * t * t;
      return d; 
   }
}