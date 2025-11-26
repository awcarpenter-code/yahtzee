/*
Alex Carpenter
CS 2100
Threes category
*/

public class Threes extends Category
{
   private static final int THREES = 3;
   

   /*
   Evaulate threes category
   @return nummThrees
   */
   public int evaluate(Dice d)
   {
      
      return d.count(THREES) * THREES;
   }
}