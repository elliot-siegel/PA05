/**
 * 
 */
package lesson19;

import java.util.Random;
/**
 * @author HippoCity
 *
 */
public class FrequentFlier extends Person {

	public FrequentFlier() {
		super();
	}

	void tryToMove() {
		Random random = new Random();
		int i = random.nextInt(country.places.length);
	    int j = random.nextInt(country.places[i].length);
	    
	    while (country.places[i][j] != null) {
	    	i = random.nextInt(country.places.length);
	    	j = random.nextInt(country.places[i].length);
	    }
	      country.places[this.x][this.y]=null;
	      this.setPosition(i,j);
	      country.places[i][j]=this;

	}

}
