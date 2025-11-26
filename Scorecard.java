import java.util.ArrayList;

public class Scorecard
{
   private ArrayList<Category> scorecard; 
   private int yahtzeeBonus;
   private static final int NUM_CATS = 13;
   
   public Scorecard( ) 
   {
 
      this.scorecard = new ArrayList<Category>(NUM_CATS);
      
      Category ones = new Ones();
      scorecard.add(ones);
      
      Category twos = new Twos();
      scorecard.add(twos);
     
      Category threes = new Threes();
      scorecard.add(threes);
     
      Category fours = new Fours();
      scorecard.add(fours);
     
      Category fives = new Fives();
      scorecard.add(fives);
     
      Category sixes = new Sixes();
      scorecard.add(sixes);
     
      Category threeOfAKind = new ThreeOfAKind();
      scorecard.add(threeOfAKind);
     
      Category fourOfAKind = new FourOfAKind();
      scorecard.add(fourOfAKind);
     
      Category fullHouse = new FullHouse();
      scorecard.add(fullHouse);
     
      Category smStraight = new SmStraight();
      scorecard.add(smStraight);
     
      Category lgStraight = new LgStraight();
      scorecard.add(lgStraight);
     
      Category fiveOfAKind = new FiveOfAKind();
      scorecard.add(fiveOfAKind);
     
      Category chance = new Chance();
      scorecard.add(chance);
   }
   
   public String toString()
   {
      String str = "Current Scorecard: \n";
      int i = 0;
      
      int upperTotal = 0;
      int lowerTotal = 0;
      
      for (CategoryValue cv: CategoryValue.values())
      {
         str += String.format("%15s: %d \n", cv, scorecard.get(i).getScore());
         
         
         if (i < 5)
         {
            upperTotal += scorecard.get(i).getScore();
         }
         
         else
         {
            lowerTotal += scorecard.get(i).getScore();
         }
         
         i++;
      }
      
      str += String.format("%17s%d \n", "Upper Total: ", upperTotal);
      str += String.format("%17s%d \n", "Lower Total: ", lowerTotal);
      
      str += String.format("%17s%d \n", "Total: ", upperTotal + lowerTotal);
      
      str+= "\n" + "******************************" + "\n" + "\n";
      return str;
   }
   
   public int getEvaluation(CategoryValue cv, Dice d)
   {
      int cvVal = cv.getValue();
      Category crunchcat = scorecard.get(cvVal);
      return crunchcat.evaluate(d);
   }
   
   /**
    * choose()
    * Use cv to get the appropriate Category and score that category.
    * @param   CategoryValue     category value user is selecting
    * @param   Dice              dice we're using
    */   
    
   public void choose(CategoryValue cv, Dice d)
   {
      int cvVal = cv.getValue();
      Category crunchcat = scorecard.get(cvVal);
      crunchcat.addValue(d);
   }
   

}