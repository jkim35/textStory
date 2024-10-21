import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;
  boolean b;
  boolean c;
  boolean d;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
    b = false;
    c = false;
    d = false;
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("interogation.jpg");

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
    }
    if(b==3){
      System.out.println("The interrogator leaves. You feel a wave of relief. \nIt immediatly leaves when you charged guilty. Your lack of evidence to prove your innocence was overwhelmed by the opposition.\nYou got a life sentence.");
      enterJail();
    }
  }
  private void truth(int a){

  }
  private void enterJail()
  {
    System.out.println("The jail cell looks pretty dull. There is nothing much but a barred window, your bed, and a vent. \nSo what would you like to do, "+ourHero.getName()+"? Stay or escape?");
    String nice = inScanner.nextLine();
      if (nice.equals("Escape")||nice.equals("escape")){
        attemptEscape();
    }

  }
  private void attemptEscape(){
    System.out.println("You try to escape. Which one do you want to examine first? The bed, the vent, or the window?");
    String nice = inScanner.nextLine();
    if (b==false&&nice.equals("vent")||nice.equals("Vent")){
      System.out.println("You examine the vent. It looks pretty rusty. It looks pretty easy to break out, however it won't gurantee you'll be put immediatly in trouble.\nWhat would you like to do now? Vent or Examine?\n(Vent will make you go through the vent while the examine will allow you to choose a different object.): ");
      nice = inScanner.nextLine();
      if(nice.equals("vent")||nice.equals("Vent")){
        b = true;
        escape((int)Math.random()*11);
      }

    }
    else if(nice.equals("window")||nice.equals("Window")){
      c = true;
    }else if (nice.equals("poster")||nice.equals("Poster")){
      d = true;
    }else{

    }
  }
  private void escape(int a){
    if (a==5){
      System.out.println("You were lucky! There was nothing on the other side, just land.");
      gameEnd(1);
    }
    else if(a>=7){
      System.out.println("You found 2 police officers in the other side. You are forced to engage in battle.");
      StartBattle(1,2);
    }else{

    }
  }
  private void StartBattle(int a,int q){
    int i = 0;
    if(a==1&&q==2){
      Player cop1 = new Player("Cop1",100,5);
      Player cop2 = new Player("Cop2",100,5);
      
    }
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
    if (a == 1){
      System.out.println("Neutral Ending 1: Prison Escapee");
      System.out.println("Neutral/Bad ending, you managed to escape, without finding the true culprit.\nYou are now forced to go into hiding in order to keep yourself safe and not go back to jail.");
    }
    inScanner.close();
  }
}