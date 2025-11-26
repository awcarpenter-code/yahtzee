public class Player
{
   private Scorecard scorecard;
   private String name;
   private DiceRoll diceroll;
   
   public Player(String name)
   {
      this.name = name;
      this.scorecard = new Scorecard();
      this.diceroll = new DiceRoll();
   }   


   public String toString()
   {
      String str = "*** " + name + ":" + " ***" + "\n";
      str += scorecard;
      str += diceroll;
      
      return str;
   }
   
   public DiceRoll getDiceRoll()
   {
      return diceroll;
   }
   
   public Scorecard getScorecard()
   {
      return scorecard;
   }
  

}