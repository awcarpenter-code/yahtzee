/****
 CS 2100
 DiceRoll class
 A specialization of the Dice class that allows tossing
*/

public class DiceRoll extends Dice 
{
   public static final int NUM_DIE = 5;
   
   
   /*
   DiceRoll
   Rolls dice, fill SUPER object with random dice
   */
   public DiceRoll()
   {
      super(NUM_DIE);
      
      for (int i = 0; i < NUM_DIE; i++)
      {
         Die die = new Die();
         super.addDie(die);
      }
   }
   
    /**
    * toss()
    * Roll each of the Die in the Dice ArrayList
    */
   public void toss()
   {
       for (int i = 0; i < NUM_DIE; i++)
       {
         if(getSaved(i) == false)
         {
            //System.out.print("Cat eating a walnut" + "\n");
            Die die = getDie(i);
            die.roll();
         }
         
       }
   }
}