public class FullHouse extends Category
{
   private static final int UPPER = 6;
   private static final int LOWER =  1;
   
   //if count is three, set boolean ThreeofaKind true
   public int evaluate(Dice d)
   {  
   
      boolean ThreeofaKind = false;
      boolean TwoofaKind = false;
   
      for (int i = LOWER; i <= UPPER; i++)
      {
         if (d.count(i) == 3)
         {
           ThreeofaKind = true; 
         }
         
         else if (d.count(i) == 2)
         {
           TwoofaKind = true; 
         }
    
      } 
       
       
      if (ThreeofaKind == true && TwoofaKind == true)
      {
         return 25;  
      }
    
      return 0; 
   }

}