/*
Alex Carpenter
CS 2100
Sixes category
*/
public class Sixes extends Category
{
   private static final int SIXES = 6;
   
   public int evaluate(Dice d)
   {
      return d.count(SIXES) * SIXES;
   }
}