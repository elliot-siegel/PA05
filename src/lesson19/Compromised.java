package lesson19;
import java.util.Random;
/**
* This class simulates a person who is immunocompromised.
* They are more likely to get infected and they recover slower,
* But they are more cautious so they are less likely to move around.
*/
public class Compromised extends Person {

  public Compromised(){
    super();
    infectionProb = 0.75;
    recoveryTime = 7;
  }

  public void tryToMove(){
    Random randInt = new Random();
    if (randInt.nextInt(5) == 0) {
      tryToMoveRandomly();
    }
  }
}
