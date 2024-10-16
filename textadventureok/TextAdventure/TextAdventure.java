import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("distantcity.jpg");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();

    // Change ourHero's name
    ourHero.changeName(input);
    // ADD CODE HERE
    
    // describe the starting situation. Feel free to change this
    System.out.println("The lights turn on. You can hear an interrogating voice asking questions. \n He asked, \"Where were you during the incident?\"\nAh yes, the incident. You can remember it vividly.\nYet you don't know who did it.\nYou keep reminding of yourself the revenge you would get if you found the culprit. \nBut first you need to get out of the interrogation. What would you like to do now, " + ourHero.getName() + "?\n Lie or Tell the Truth?: ");
    input = inScanner.nextLine();
    if (input.equals("Lie")||input.equals("lie")){
      lie(0);
    }
    if (input.equals("Truth")||input.equals("truth")){
      truth(0);
    }

  }
  private void lie(int b){
    if(b==0){
    System.out.println("You say, \"I was at my work when the incident happened.\"\n\"I doubt it.\"\n\"But I'm telling the truth!\"\n\"Nope. The workplace reportedly said that you weren't there.\"\n"+ourHero.getName()+" What would you like to do now? Continue to lie or tell the truth?");
    String wow = inScanner.nextLine();
    if (wow.equals("Lie")||wow.equals("lie")){
      lie(1);
    }    
    else if (wow.equals("Truth")||wow.equals("truth")){
      truth(1);
    }

    }
    else if(b == 1){
      System.out.println("\"The workplace must haven't seen me then.\"\n\"We looked at the cameras together. You didn't come in the the workplace. Stop lying and tell the truth, and maybe we'll lower your sentence.\"\n"+ourHero.getName()+" What now? Continute to lie, or tell the truth?");
      String wow = inScanner.nextLine();
      if (wow.equals("Lie")||wow.equals("lie")){
        lie(2);
      }
      else if (wow.equals("Truth")||wow.equals("truth")){
        truth(2);
      }
    }
    else if(b == 2){
      System.out.println("\"Maybe I entered a different way?\"\n\"You're only permitted to enter through one enterance in order to enter work.\"\n"+ourHero.getName()+" What now? Continute to lie, or tell the truth?");
      String wow = inScanner.nextLine();
      if (wow.equals("Lie")||wow.equals("lie")){
        lie(3);
    
      }
      else if (wow.equals("Truth")||wow.equals("truth")){
        truth(3);
      }
    if(b==3){
      System.out.println("The interrogator leaves. You feel a wave of relief. \nIt immediatly leaves when you charged guilty. Your lack of evidence to prove your innocence was overwhelmed by the opposition.\nYou got a life sentence.");
      gameEnd(0);
    }
    }
  }
  private void truth(int a){

  }
  private void enterZone1()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone3()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void gameEnd(int a)
  {
    if (a==0){
      System.out.println("Bad ending: Perpetual Lies");
      System.out.println("You were forced to stay in your cell for the rest of your life. You never see the light of day ever again.");
    }

    inScanner.close();
  }
}