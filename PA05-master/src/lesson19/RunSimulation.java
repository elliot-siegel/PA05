/** */
package lesson19;

import java.util.Random;
/**
 *
 * @author tim
 *
 */

public class RunSimulation {
	// the maximum number of days the simulation will run
	private static int MAX_TICKS=1000;



	private Random random = new Random();
	private int width;
	private int height;
	private int numStayHome;
	private int numEssential;
	private int numSkeptic;
	private int numFrequentFlier;
	private int numPersonfile;

	public RunSimulation(String[] args){
		this.width = Integer.parseInt(args[0]);
		this.height = Integer.parseInt(args[1]);
		this.numStayHome = Integer.parseInt(args[2]);
		this.numEssential = Integer.parseInt(args[3]);
		this.numSkeptic = Integer.parseInt(args[4]);
		this.numFrequentFlier = Integer.parseInt(args[5]);
		this.numPersonfile = Integer.parseInt(args[6]);
	}

	public Int[] OneSimulation(String[] args) {
		// first we get the simulation parameters
		// from the command line
		int noNewInfectionDay = 0;
		int maxinfected = 0;
		int totalNumInfected = 0;

		// next we create the population and the country
		Population population;

		//population = new Population(numPeople);
		//population = new AllStayAtHome(numPeople);
		//int numEssential = numPeople/10;
		//int numOther = numPeople/20;
		//int numStayHome = numPeople - numEssential - numOther;
		population = new MixedPopulation(numStayHome, numEssential, numSkeptic, numFrequentFlier,numPersonfile);
		population.createPeople();

		Country country = new Country(width,height);
		// and add a link to the population in the country
		country.population = population;
		// next we place the people into the country randomly
		population.placePeople(country);

		for(int k=0;k<MAX_TICKS; k++) {
			country.simulateOneStep();

			if(country.numInfected > maxinfected){
				maxinfected = country.numInfected;
			}

			if(country.newInfections == 0){
				noNewInfectionDay = k;
			}

			if (country.numInfected==0) {
				break;
			}
		}
		totalNumInfected = country.numRecovered;

		return new int[] {noNewInfectionDay, maxinfected, totalNumInfected};
	}
}
