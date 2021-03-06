package lesson19;

public class MixedPopulation extends Population{
  int numShelterInPlace;
  int numEssential;
  int numSkeptic;
  int numFrequentFliers;
  int numCompromised;

  public MixedPopulation(int numShelterInPlace, int numEssential, int numSkeptic, int numFrequentFliers, int numCompromised){
    super(numShelterInPlace + numEssential + numSkeptic + numFrequentFliers + numCompromised);
    this.numShelterInPlace = numShelterInPlace;
    this.numEssential = numEssential;
    this.numSkeptic = numSkeptic;
    this.numFrequentFliers = numFrequentFliers;
    this.numCompromised = numCompromised;

  }

  public void createPeople(){
    for(int i=0; i<this.numShelterInPlace; i++){
      this.addPerson(new StayAtHome());
    }
    for(int i=0; i<this.numEssential; i++){
      this.addPerson(new StayAtHomeIfSick());
    }
    for(int i=0; i<this.numSkeptic; i++){
      this.addPerson(new Skeptic());
    }
    for(int i=0; i<this.numFrequentFliers; i++) {
    	this.addPerson(new FrequentFlier());
    }
    for(int i=0; i<this.numCompromised; i++) {
    	this.addPerson(new Compromised());
    }
  }
}
