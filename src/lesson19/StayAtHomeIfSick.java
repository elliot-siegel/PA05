package lesson19;

/**
* This class represents someone who will self-quarantine if they become sick.
*/
public class StayAtHomeIfSick extends Person{


	public StayAtHomeIfSick() {
		super();
	}

	public void tryToMove() {

    if (!this.infected){
      super.tryToMoveRandomly();
    }
	}

}
