/*
Alex Carpenter
CS 2100
Die class to create a die object
Can be rolled and its value  printed as a string
*/

import java.util.Random;

public class Die
{
   private int value;
   private static final int SIDES = 6;
   private Random rand = new Random();
   
   /**
   Die constructor
   */
   public Die()
   {
      rand = new Random();
      value = rand.nextInt(SIDES) + 1;
   }
   
   /**
   roll mehtod
   */
   public void roll()
   {
      value = rand.nextInt(SIDES - 1 + 1) + 1;
   }
   
   /**
   gets value
   @return value
   */
   public int getValue()
   {
      return value;
   }
   
   /**

   /*
   toString methiod
   @return str
   */
   public String toString()
   {
      String str = " " + value;
      return str;
   }

}

