public class Chance extends Category
{
   public int evaluate(Dice d)
   {
      return d.sum();
   }
   
}