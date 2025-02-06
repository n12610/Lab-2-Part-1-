
/**
 * Write a description of class Lab2P1 here.
 * @ since 06Feb2025
 * @author Nick Williams, twilliams027@student.sdccd.edu
 * @version 1.0
 */

public class Lab2P1
{   
    public static void main (String [] args)
    {
      double x;
      double y;
      double z;
      double dif;
      
      x = 1.23456789E204;
      y = 1/x;
      z = (x*y); 
      dif = 1-z;
      
      System.out.println("the value of x is" + x);
      System.out.println("the value of y is" + y);
      System.out.println("the value of z is" + z);
      System.out.println("the value of 1-z is"+ dif);
        
    }
}
