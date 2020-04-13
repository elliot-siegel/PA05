
package lesson19;

/**
* This class represents a person is doubtful that the virus
* is dangerous, so they move around normally
*/

public class Skeptic extends Person {

	public Skeptic() {
		super();
	}

	public void tryToMove() {
		super.tryToMoveRandomly();
	}

}
