/**
 Alex Carpenter
 CS 2100
 Category Class
 An abstract base class for all categories on the score card.
*/

public abstract class Category
{

   private int score; 
   private boolean used;

   /**
    * evaluate()
    * An abstract method that will evaluate the Die
    * and return a score (does not change the score)
    * @param   Dice  list of dice
    * @return  int   score of dice in list
    */
   public abstract int evaluate(Dice d);
   
   /**
    * addValue()
    * Adds the value the Dice would produce to the score
    * Changes the score (where evaluate() does not)
    * Marks category as used.
    * @param Dice    dice we are adding value to
    */  
   public void addValue(Dice d)
   {
      score = evaluate(d);
      //System.out.println(score);  
   }
   
   /**
   gets score
   @return score
   */
   public int getScore()
   {
      return score;
   }
 
 
   /**
   gets used
   @return used
   */  
   public boolean getUsed()
   {
      return used;
   }

}