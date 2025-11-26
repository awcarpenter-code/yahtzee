/*
Alex Carpenter
CS 2100
game class for new game
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Game
{
   private ArrayList<Player> players;
   private boolean valid2 = true;
   //private String input;
   private int rollCount = 1;
   private boolean[] saved;
   private static final int MAX_ROLLS = 3;
   private static final int MAX_TURNS = 13;

   public Game()
   {
      this.players = new ArrayList<Player>(2);
      
      Player player1 = new Player("Player 1");
      Player player2 = new Player("Player 2");
      
      players.add(player1);
      players.add(player2);
      
      //boolean[] saved = {false, false, false, false, false};
   }

   
   public String welcome()
   {
      String str = "*******************************" + "\n" + "       WELCOME TO YAHTZEE" + "\n" + 
      "*******************************";
      return str;
   }
   
   public void resetDice(Player player)
   {
       DiceRoll d = player.getDiceRoll();
       
       d.setSaved(false);
       
       d.toss();
       
   }
   
   
   public void processScore(Player player)
   {
      int score = 0;
      System.out.println("Select a category that you have not scored in yet:");
      DiceRoll diceroll = player.getDiceRoll();
      Scorecard scorecard = player.getScorecard();
      
      for (CategoryValue cv: CategoryValue.values())
      {
         score = scorecard.getEvaluation(cv, diceroll);
         System.out.printf("%d %s %s %d %s %s", cv.getValue() + 1, cv, ":", score, "points", "\n");   
         
      }
    
      Scanner keyboard = new Scanner(System.in);
      //System.out.print("Please select a die # to toggle it between save and unsave, \"roll\" or \"score\": ");
      try
      {
      int input = keyboard.nextInt();
 
      for (CategoryValue cv: CategoryValue.values())
      {
         if (input == cv.getValue() + 1)
         {
            scorecard.choose(cv, diceroll);
            score = scorecard.getEvaluation(cv, diceroll);
            System.out.println("\n" + "You scored " + score + " points in " + cv + "\n");
         }
      }
      
      }
      
      catch(InputMismatchException e)
      {
         System.out.println("Cat memes");
      }
   }
   
   public void playgame()
   {
      String welcome = welcome();
      System.out.println(welcome);
      
      
      for (int turn = 0; turn < MAX_TURNS; turn++)
      {
         for (int i = 0; i < players.size(); i++)
         {
      
            Player player = players.get(i);
         
            //Add another while loop here to keep going after saving, until score or 3 rolls
            resetDice(player);
            System.out.println(player);
            
            
            //resetDice to get a new dice roll, reset saved list, and call toss
            validateInput(player);
              //valid2 = false;
      
            processScore(player);
            
            rollCount = 1;
      
         }//end for
      
      
      
      
      }
      
 
      
    }
   private boolean validateInput(Player player)
   {
         String input;
      
         boolean valid = false;
         
         while (valid == false)
         {  
            
   
            DiceRoll diceroll = player.getDiceRoll();
            //System.out.println(players.get(i));
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please select a die # to toggle it between save and unsave, \"roll\" or \"score\": ");
            input = keyboard.nextLine();

            diceroll = player.getDiceRoll();
        
            if (input.equals("1"))
            {
               diceroll.toggleSave(0);
               valid = false;
            }
            
            else if (input.equals("2"))
            {
               diceroll.toggleSave(1);
               valid = false;
            }
            
            else if (input.equals("3"))
            {
               diceroll.toggleSave(2);
               valid = false;
            }
            
            else if (input.equals("4"))
            {
               diceroll.toggleSave(3);
               valid = false;
            }
            
            else if (input.equals("5"))
            {
               diceroll.toggleSave(4);
               valid = false;
            }

            else if (input.equals("roll"))
            {
            
               rollCount++;
               
               if (rollCount <= MAX_ROLLS)
               {
                diceroll.toss();
               }

               
               
               valid = false;
            }
            
            else if (input.equals("score"))
            {
               return true;
            }
  
            else
            {
               System.out.print(input + " is not a valid die value" + "\n" + "\n");
    
               valid = false;
            }
            
             if (rollCount > MAX_ROLLS)
             {
                  rollCount = 1;
                  System.out.print("\n Out of rolls, you must score \n");
                  valid = true;
             }
            
            System.out.print(player);
         }//end while
         
         return true;
   }
}