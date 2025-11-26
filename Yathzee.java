public class Yathzee extends Category
{     

   private static final int UPPER = 1;
   private static final int LOWER =  6;
   
   public int evaluate(Dice d)
   {
      for (int i = LOWER; i < UPPER; i++)
      {
         
         if (d.count(i) >= 5)
         {
            return d.sum();
         }
      }
      
      return 0;
      
   }

}