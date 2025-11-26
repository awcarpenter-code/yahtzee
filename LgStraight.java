public class LgStraight extends Category
{
   private int counter = 1;
   private static final int DICE = 5;
   private static final int LG_STR = 5;
   private Die curr;
   private int dice[] = {1, 1, 1, 1, 1};
   
   
   public int evaluate(Dice d)
   {
      int curr;
      int last;
      
      //curr = d.getDie(0).getValue();
      
      for (int i = 0; i < dice.length; i++)
      {
         dice[i] = d.getDie(i).getValue();

      }
      
      selectionSort(dice);
      curr = dice[0];
      last = curr;
   
      for (int i = 0; i < DICE; i++)
      {
         
         curr = dice[i];
         
         
         if (curr == last + 1)
         {
            counter++;
         }
         
         last = dice[i];
         
         
      }
     
      if (counter >= LG_STR)
      {
         return 40;
      } 
      
      return 0;
   }
   
   private void selectionSort(int dice[])
   {
      int startScan, index, minIndex, minValue;
      
      for (startScan = 0; startScan < (dice.length-1); startScan++)
      {
         minIndex = startScan;
         minValue = dice[startScan];
         
         for (index = startScan + 1; index < dice.length; index++)
         {
            if (dice[index] < minValue)
            {
               minValue = dice[index];
               minIndex = index;
            }
         }
         dice[minIndex] = dice[startScan];
         dice[startScan] = minValue;
      }
   }
}