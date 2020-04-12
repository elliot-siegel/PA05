package lesson19;
import java.util.Random;

public class Personfile extends Person{

  public Personfile(){
    super();
    infectionProb = 0.75;
    recoveryTime = 7;
  }
  public void tryToMove(){
    Random randInt = new Random();
    if(randInt.nextInt(5) == 0){ 
      tryToMoveRandomly();
 }
  }
}
