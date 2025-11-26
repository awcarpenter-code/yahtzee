
/****
 Alex Carpenter
 CS 2100
 Dice Class
 An initially empty container to add Die objects to
*/

import java.util.ArrayList;

public class Dice
{
   private ArrayList<Die> dice;
   private static final int DEF_CAP = 5;
   private boolean[] saved = {false, false, false, false, false};
   
   
   public Dice()
   {
      this.dice = new ArrayList<Die>(DEF_CAP);  
   }
   
   /**
   * Dice()
   * Instantiates a new ArrayList of the number passed in.
   */
   public Dice(int num)
   {
      this.dice = new ArrayList<Die>(num);    
   }
   
   /**
    * addDie()
    * Adds die to the container
    * @param Die  add die to the dice list
    */
   public void addDie(Die d)
   {
      dice.add(d);
   }

   /**
    * getNumDice()
    * Gets the number of dice in the container
    * @return int size of current dice list
    */
   public int getNumDice()
   {
      return dice.size();
   }
   
    /**
    * getDie()
    * Gets the Die in the container
    * @return Die
    */
   public Die getDie(int i)
   {
      return dice.get(i);
   }
   
   /**
    * sum()
    * Returns sum of the Die values in the ArrayList.
    * @return int sum of Die values in the ArrayList.
    */  
   public void removeDie(Die d)
   {
      dice.remove(d);
   }
   
   
   /**
    * contains()
    * Returns sum if at least one Die has the value passed in.
    * @param  int       value to compare dice against
    * @return boolean   true if at least one die in dice list has value
    */  
   public int count(int val)
   {
      int counter = 0;
      
      for (int i = 0; i < dice.size(); i++)
      {
         if (dice.get(i).getValue() == val)
         {
            counter++;
         }
        
      }
     return counter;
   }
   
   /**
    * sum()
    * Returns sum of the Die values in the ArrayList.
    * @return int sum of Die values in the ArrayList.
    */  
   public int sum()
   {
      int sum = 0;
      
      for (int i = 0; i < dice.size(); i++)
      {
         sum = sum + dice.get(i).getValue();      
      }
      return sum;
   }
   
   
   /**
    * contains()
    * Returns true if at least one Die has the value passed in.
    * @param  int       value to compare dice against
    * @return boolean   true if at least one die in dice list has value
    */  
   public boolean contains(int val)
   {
      
      for (int i = 0; i < dice.size(); i++)
      {
         if (dice.get(i).getValue() == val)
         {
            return true;
         }
      }
      
      return false;
    }
    

   /**
    * toString()
    * Returns string for each die, index and value
    * @return String   returns index and value for each die in list
    */ 
    public String toString()
    {
      int count = 1;
      String str = "Dice:" + "\n";
      for (int i = 0; i < dice.size(); i++, count++)
      {
         str += count + ":  " + "value " + dice.get(i).getValue();
         if (saved[i] == true) //then add "SAVED" onto string
         {
            str+= " SAVED";
         }
         
         str += "\n";
      }
      
      str += "\n";
      
      return str;
    }
      
      
  
    //ADD TOGGLE METHOD HERE
    public void toggleSave(int i)
    {
    
      if (saved[i] == true)
      {
         saved[i] = false;
      }
     
      


      else
      {
         saved[i] = true;
      }
    
    }
   
   public boolean getSaved(int i)
   {
      return saved[i];
   }
   
   public void setSaved(boolean reset)
   {
       for  (int i = 0; i < saved.length; i++)
       {
         saved[i] = reset;
         
       }
   }

}
