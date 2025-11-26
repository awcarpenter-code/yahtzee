public class FiveOfAKind extends Category
{     

   private static final int UPPER = 6;
   private static final int LOWER =  1;
   private static final int YAHTZEE = 50;
   
   public int evaluate(Dice d)
   {
      for (int i = LOWER; i <= UPPER; i++)
      {
         
         if (d.count(i) >= 5)
         {
            return YAHTZEE;
         }
      }
      
      return 0;
      
   }

}