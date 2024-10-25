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
  int i;
  Player unknown;
  int x;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
    cop1 = new Player("Cop1",100,5);
    cop2 = new Player("Cop2",100,5);
    unknown = new Player("John",150,10);
    b = false;
    c = false;
    d = false;
    i = 0;
    x = 0;
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("interogation.jpg");

    // ask the user for their name.
    System.out.println("I am not changing the text do not read too much you'll die");
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
      System.out.println("\"Yes. It was me. I killed John.\"\n\"Knew it. Bring the culprit to jail.\"");
      enterJail();
    }else{
      System.out.println("\"That is extremely incorrect. I would never do anything against him.\"\n\"Really? We have evidence.\"\n\"Can you show them to me?\"\n\"Sure. First, you were at your house with Mr. Rowder. There were fingerprints on the body.\"\n\"Have you checked the time of the fingerprint?\"\n\"Yes. It was during the time where he was murdered.\"\n\"But I was at the kitchen during the incident. Have you checked the kitchen utensils?\"\n\"It looks like most washed away. We'll check.");
      inWaiting1();
    }
  }
  public void inWaiting1(){
    console.setImage("waiting.jpg");
    System.out.println("...");
    System.out.println("They take a long time.");
    System.out.println("You feel impatient, maybe a bit aprehensive of the result.");
    System.out.println("The door busts open.");
    System.out.println("\"...We found that you are not the culprit, "+ourHero.getName()+". Sorry about the interrogation. You're free now. \"\nWould you like to continue with the story?d");
    String we = inScanner.nextLine();
    if (we.equals("yes")||we.equals("Yes")){
      enterHouse();
    }else if(we.equals("no")||we.equals("No")){
      gameEnd(4);
    }else{
      inWaiting1();
    }
  }
  private void enterHouse(){
    console.setImage("house.jpg");
    System.out.println("You leave to your house. It's empty as ever.\nYour roommate isn't here.\nIts quiet. \nYou find a note on the table, written by your roommate.");
    System.out.println("You can barely read a handful of the words in the note.\nHello, ████, I ███████ you ████ gotten this due to ███ █████████\nIf you ████ this, the culprit may be █████\n██████.");
    System.out.println("\nWhat would you like to do? Look or stay?");
    String hi = inScanner.nextLine();
    if(hi.equals("Look")||hi.equals("look")){
      System.out.println("You look around the house. You find a similar note like the last one. \n");
      System.out.println("Please do ███ find ███ person.\nI ███ ███ ██ hope that you ████ find him. \n Please, continue to ████ ███ him.");
      System.out.println("Do you look or stay?");
      hi = inScanner.nextLine();
      if(hi.equals("Look")||hi.equals("look")){
        System.out.println("No more notes. There looks like theres a pathway to the outdoors. \nYou never opened the door. \nWould you go out or examine?");
        hi = inScanner.nextLine();
        if(hi.equals("out")||hi.equals("Out")){
          console.setImage("outdoor.jpg");
          System.out.println("You follow the tracks to hopefully your next clue.\nTheres a person with a pencil, notepad, and a knife.\nThe face looks awfully similar, but you can't decipher it.\n\"Looks like you'll be the next target.\"\nA Battle commences.");
          battle2();
        }
      }else{
        gameEnd(4);
      }
    }else{
      gameEnd(4);
    }
  }
  private void battle2(){
    while((unknown.getHealth()>=0)&&(ourHero.getHealth()>=0)){
      i = OtherTurn();
      if(i==-1){
        System.out.println("Your opponent slashes you. You lose 5 health for every turn for the next 3 turns.");
        x = 3;
      }else{
        ourHero.setHealth(ourHero.getHealth()-i);
      }
      if(x>=0){
        System.out.println("You lose 5 health due to the slashes.");
        ourHero.setHealth(ourHero.getHealth()-5);
      }
      ourHero.setHealth(ourHero.getHealth()-5);
      System.out.println("Your health is "+ourHero.getHealth()+". Your opponents health are "+unknown.getHealth());
        i =PlayerTurn();
        if(i==911214){
          System.out.println("It's too late to run.");
        }
        else if(i==0){
          
        }else{
        unknown.setHealth(unknown.getHealth()-i);
        }
        System.out.println("Your health is "+ourHero.getHealth()+". Your opponents health are"+cop1.getHealth()+" "+cop2.getHealth());
      
    }
      if(ourHero.getHealth()<=0){
        System.out.println("You see the face that you just won against.\nIt appears to be a person you knew for a very long time.\nIt appears to be your roommate, John.\nApparently, he had faked his death in order to get away from the anxieties of life.\nIt still doesn't stop you to realize that he had attempted to kill you.\nDo you think he is good or bad?");
        String test = inScanner.nextLine();
        if(test.equals("Good")||test.equals("good")){
          gameEnd(9);
        }else{
          if(ourHero.getHealth()<=50){
            gameEnd(6);
          }else if(ourHero.getHealth()<=100){
            gameEnd(7);
          }else{
            gameEnd(8);
          }
        }

      }else if((unknown.getHealth()<=0)){
        
        gameEnd(5);
      }
  }
  private int OtherTurn(){
    int a = (int)(Math.random()*4)+1;
    if(a==1){
      System.out.println("Your opponent used his special!");
      return -1;
    }
    else if(a==2){
      System.out.println("Your opponent kicked you!");
      return 5;
    }
    else if(a==3){
      System.out.println("Your opponent healed himself!");
      return 0;
    }else{
      return 0;
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
      System.out.println("You examine the vent. It looks pretty rusty. It looks pretty easy to break out, however it won't gurantee you'll be put immediatly in trouble.\nYou go through.\n");
        b = true;
        escape((int)(Math.random()*11));

    }
    else if(c==false&&(nice.equals("window")||nice.equals("Window"))){
      System.out.println("You examine the window, it appears to not have a long drop, and can safely end up with your freedom.\nIt is not guranteed there will be guards behind it.\n You break out of the window.");
      c = true;
      escape((int)(Math.random()*11));
    }
    else if (nice.equals("poster")||nice.equals("Poster")){
      System.out.println("You examine the poster, it appears to have motivaional words.\nThere is nothing here.");

    }
    else if(b){
      System.out.println("This way seems to not exist anymore... Weird.");
      attemptEscape();
    }
    else if(c){
      System.out.println("What window? Don't you remember it was removed...?");
      attemptEscape();
    }else{
      attemptEscape();
      }
  }
  private void escape(int a){
    console.setImage("police.jpg");
    if (a==5){
      System.out.println("You were lucky! There was nothing on the other side, just land.");
      gameEnd(1);
    }
    else if(a<=7){
      System.out.println("You found 2 police officers in the other side. You are forced to engage in battle.\n");
      battle(1);
    }else{
      System.out.println("You found multiple police officers. They overwhelm you and you are but back to jail.");
      attemptEscape();
    }
  }
  public void battle(int a){
    boolean stun = false;
    if((a==1)){
      while(!((cop1.getHealth()<0)&&(cop2.getHealth()<0)&&(ourHero.getHealth()<0))){
      i = NPCturn();
      if(i==-1){
        stun = true;
        System.out.println("Your opponent stunned you! You can not move in the next turn. You also lose 5 health.");
        ourHero.setHealth(ourHero.getHealth()-5);
      }else{
        ourHero.setHealth(ourHero.getHealth()-i);
      }
      System.out.println("Your health is "+ourHero.getHealth()+". Your opponents health are"+cop1.getHealth()+" and "+cop2.getHealth());
      if(stun){
        System.out.println("You're stunned! You can't do anything...");
      }else{
        i =PlayerTurn();
        if(i==911214){
          endBattle(2);
        }
        else if(i==0){
          
        }
        else if((int)(Math.random()*2)==1){
          cop2.setHealth(cop2.getHealth()-i);
        }else{
        cop1.setHealth(cop1.getHealth()-i);
        }
        System.out.println("Your health is "+ourHero.getHealth()+". Your opponents health are"+cop1.getHealth()+" "+cop2.getHealth());
      }
      stun = false;
    }
    ourHero.setHealth(100);
    cop1.setHealth(100);
    cop2.setHealth(100);
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
    }else if(a==5){
      System.out.println("The wounds are too much. You couldn't make it to the hospital.");
      gameEnd(5);
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
      return 5;
    }
  }
  public int PlayerTurn(){
    System.out.println("Your turn! What would you like to do now?\n1 = Neutral attack, 2 = Special attack, 3 = Heal, 4 = Flee");
    
    int a = inScanner.nextInt();
    if(a==1){
      System.out.println("You kicked your opponent!");
      return 10;
    }
    else if(a ==2){
      System.out.println("You do a flying sidekick!");
      return 5+(int)(Math.random()*20);
    }
    else if(a ==3){
      System.out.println("Your healed yourself for 15 health!");
      ourHero.setHealth(ourHero.getHealth()+15);
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
    else if(a==5){
      System.out.println("Bad Ending 3: Die Trying");
      System.out.println("Worse/Worst ending, you couldn't make it out.");
    }
    else if(a ==6){
      System.out.println("Neutral Ending 3: The hospitalized");
      System.out.println("Neutral/Worse ending, you ratted out John without remorse before immediatly going to the hospital.");
    }
    else if(a ==7||a==8){
      System.out.println("Neutral Ending 3: Normal");
      System.out.println("You found the culprit of the murder, and return to your normal life.");
    }
    else if(a ==9){
      System.out.println("True ending");
      System.out.println("You were able to find John, and help him. No casualties happened.");
    }
    inScanner.close();
  }
}