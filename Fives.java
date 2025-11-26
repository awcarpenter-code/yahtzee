/*
Alex Carpenter
CS 2100
Fives category
*/

public class Fives extends Category
{
   private static final int FIVES = 5;
 
 
   public int evaluate(Dice d)
   {
      return d.count(FIVES) * FIVES;
   }
}