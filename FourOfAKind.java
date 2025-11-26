public class FourOfAKind extends Category
{     

   private static final int UPPER = 6;
   private static final int LOWER =  1;
   
   public int evaluate(Dice d)
   {
      for (int i = LOWER; i <= UPPER; i++)
      {
         
         if (d.count(i) >= 4)
         {
            return d.sum();
         }
      }
      
      return 0;
      
   }

}