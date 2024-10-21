import java.util.Scanner;

public class Player
{
  String name;
  int health;
  double gold;
  int monstersDefeated;
  Scanner inScanner;

  public Player(String playerName, int startingHealth, double startingGold)
  {
    name = playerName;
    health = startingHealth;
    gold = startingGold;
    inScanner = new Scanner(System.in);
  }

  public String getName()
  {
    return name;
  }

  public void changeName(String newName)
  {
    name = newName;
  }

  public int getHealth()
  {
    return health;
  }

  public void setHealth(int newHealth)
  {
    health = newHealth;
  }

  public double getGold()
  {
    return gold;
  }

  public void setGold(double newAmount)
  {
    gold = newAmount;
  }

  public int getMonstersDefeated()
  {
    return monstersDefeated;
  }

  public void defeatMonster()
  {
    System.out.println("placeholder :3");
  }
  public int NPCturn(int v){
    int a = (int)(Math.random()*4)+1;
    if(a==1){
      System.out.println("Your opponent kicked you!");
      return 10*v;
    }
    else if(a ==2){
      
    }
    else if(a ==3){

    }
    else if(a ==4){

    }
  return 0;
  }

}