import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;
  Player cop1;
  Player cop2;
  boolean b;
  boolean c;
  boolean d;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
    cop1 = new Player("Cop1",100,5);
    cop2 = new Player("Cop2",100,5);
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
    System.out.println("\"I was at my house during the incident.\"\n\"Wasn't that the place during the incident?\'\n\"...\"\n\"Do you have anything to say?\nWhat now? Agree or disagree?");
    String ok = inScanner.nextLine();
    if (ok.equals("Agree")||ok.equals("agree")){
      System.out.println("\"Yes. It was me. I killed Mr. Rowder.\"\n\"Knew it. Bring the culprit to jail.\"");
      enterJail();
    }else{
      System.out.println("\"That is extremely incorrect. I would never do anything against him.\"\n\"Really? We have evidence.\"\n\"Can you show them to me?\"\n\"Sure. First, you were at your house with Mr. Rowder. There were fingerprints on the body.\"\n\"Have you checked the time of the fingerprint?\"\n\"Yes. It was during the time where he was murdered.\"\n\"But I was at the kitchen during the incident. Have you checked the kitchen utensils?\"\n\"It looks like most washed away. We'll check.");
      inWaiting();
    }
  }
  private void inWaiting(){
    System.out.println("...");
    System.out.println("They take a long time.");
    System.out.println("You feel impatient, maybe a bit aprehensive of the result.");
    System.out.println("The door busts open.");
    System.out.println("\"...We found that you are not the culprit, "+ourHero.getName()+". Sorry about the interrogation. You're free now. \"\nWould you like to solve the mystery for yourself (solve) or leave this back (leave)?");
    String we = inScanner.nextLine();
    if (we.equals("yes")||we.equals("Yes")){
      System.out.println("You leave to your house. It's empty as ever.\nWithout Rowder, there is nothing here, as if the life had been sucked out of the room.\nYou find something in your kitchen. It's a paper. \n\nIt reads, \"dear, "+ourHero.getName()+", Someone is hunting me down. I am in the 2nd victim of the predator and he is going to kill me. Please, find me and find the murderer.\"\nWhat would you like to do?");
    }else if(we.equals("leave")||we.equals("Leave")){
      gameEnd(4);
    }else{
      inWaiting();
    }
  }
  private void enterJail()
  {
    console.setImage("jail.jpg");
    System.out.println("The jail cell looks pretty dull. There is nothing much but a barred window, your bed, and a vent. \nSo what would you like to do, "+ourHero.getName()+"? Stay or escape?");
    String nice = inScanner.nextLine();
      if (nice.equals("Escape")||nice.equals("escape")){
        attemptEscape();
    }
    else if(nice.equals("Stay")||nice.equals("stay")){
      gameEnd(2);
    }

  }
  private void attemptEscape(){
    if((b&&c)&&d){
      gameEnd(3);
    }
    System.out.println("You try to escape. Which one do you want to examine first? The bed, the vent, or the window?");
    String nice = inScanner.nextLine();
    if (b==false&&nice.equals("vent")||nice.equals("Vent")){
      System.out.println("You examine the vent. It looks pretty rusty. It looks pretty easy to break out, however it won't gurantee you'll be put immediatly in trouble.\nWhat would you like to do now? Vent or Examine?\n");
      String qwer = inScanner.nextLine();
      if((qwer.equals("vent"))||(qwer.equals("Vent"))){
        b = true;
        escape((int)(Math.random()*11));
      }else{
        attemptEscape();
      }

    }
    else if(b){
      System.out.println("This way seems to not exist anymore... Weird.");
      attemptEscape();
    }
    else if(c==false&&(nice.equals("window")||nice.equals("Window"))){
      c = true;
    }
    else if(c){
      System.out.println("What window? Don't you remember it was removed...?");
      attemptEscape();
    }
    else if (nice.equals("poster")||nice.equals("Poster")){
      d = true;
    }else if(d){
      System.out.println("So, it appears that the hole in the poster is no longer here. Weird.");
    }else{
      attemptEscape();
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
      battle(1,2);
    }
  }
  public void battle(int a,int q){
    int i = 0;
    boolean stun = false;
    if(a==1&&q==2){
      while((cop1.getHealth()<=0&&cop2.getHealth()<=0)||ourHero.getHealth()<=0){
      i = NPCturn();
      if(i==-1){
        stun = true;
        System.out.println("Your opponent stunned you! You can not move in the next turn. You also lose 5 health.");
        ourHero.setHealth(ourHero.getHealth()-5);
      }else{
        ourHero.setHealth(ourHero.getHealth()-i);
      }
      if(stun){
        System.out.println("You're stunned! You can't do anything...");
      }else{
        i =PlayerTurn();
        if(i==911214){
          gameEnd(2);
        }
        else if((int)(Math.random()*2)==1){
          cop2.setHealth(cop2.getHealth()-i);
        }else{
        cop1.setHealth(cop1.getHealth()-i);
        }
      }
      stun = false;
    }
    if(ourHero.getHealth()<=0){
      endBattle(0);
    }else if((cop1.getHealth()<=0&&cop2.getHealth()<=0)){
      endBattle(1);
    }
      
    }
  }
  public void endBattle(int a){
    if(a == 0){
      System.out.println("You lost...");
      System.out.println("You were brought you back to your cell. However they removed the way you attempted escape.");
      enterJail();
    }else if(a==1){
      System.out.println("You beat the 2 cops! However, your acts haven't gone unnoticed.");
      gameEnd(1);
    }else if(a==2){
      System.out.println("You attempt to flee, but the cops was able to catch up to you. \nThey bring you back to your cell. However they removed the way you attempted escape.");
      enterJail();
    }

  }
  public int NPCturn(){
    int a = (int)(Math.random()*10)+1;
    if(a==1){
      System.out.println("Your opponent used his special!");
      return -1;
    }
    else{
      System.out.println("Your opponent kicked you!");
      return 10;
    }
  }
  public int PlayerTurn(){
    System.out.println("Your turn! What would you like to do now?\n1 = Neutral attack, 2 = Special attack, 3 = Heal, 4 = Flee");
    int a = (int)(Math.random()*3)+1;
    if(a==1){
      System.out.println("You kicked your opponent!");
      return 10;
    }
    else if(a ==2){
      System.out.println("You do a flying sidekick!");
      return 5+(int)(Math.random()*20);
    }
    else if(a ==3){
      System.out.println("Your healed yourself for 5 health!");
      ourHero.setHealth(ourHero.getHealth()+5);
      return 0;
    }
    else if(a==4){
      System.out.println("You flee.");
      return 911214;
    }else{
      System.out.println("You did nothing... why");
      return 0;
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
    
    if (a == 2){
      System.out.println("Bad Ending 1: Accepting Fate");
      System.out.println("Bad ending, neither you find the culprit you also stay in the cell forever.\nYou never see the light of day, and live in guilt forever.");
    }
    if (a == 3){
      System.out.println("Bad Ending 2: No more ways out.");
      System.out.println("Bad/Worse ending, you are forced to stay in your cell forever. No more tricks, no more ways out, nothing.\nAt least you tried.");
    }
    if(a==4){
      System.out.println("Neutral Ending 2: Bystander");
      System.out.println("Neutral ending, you remain as a bystander, nothing will happen to you, but you will forever be in questioning of the culprit.");
    }
    inScanner.close();
  }
}