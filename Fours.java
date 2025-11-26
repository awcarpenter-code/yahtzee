/*
Alex Carpenter
CS 2100
Fours category
*/
public class Fours extends Category
{
   private static final int FOURS = 4;
   

   public int evaluate(Dice d)
   {
      return d.count(FOURS) * FOURS;
   }
}