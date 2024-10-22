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

}