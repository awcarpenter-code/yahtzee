/*
Alex Carpenter
CS 2100
Ones category
*/

public class Ones extends Category
{
   private static final int ONE = 1;
   
   /*
   Evaulate ones category
   @return numOnes
   */
   public int evaluate(Dice d)
   {
      int numOnes = d.count(ONE);
      return numOnes;
   }
}