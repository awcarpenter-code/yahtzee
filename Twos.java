/*
Alex Carpenter
CS 2100
Twos category
*/

public class Twos extends Category
{
   private static final int TWOS = 2;
   
   /*
   Evaulate twos category
   @return numTwos
   */
   public int evaluate(Dice d)
   {
      return d.count(TWOS) * TWOS;
   }
}