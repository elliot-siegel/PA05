// Github: https://github.com/elliot-siegel/PA05
/**
* Runs the simulation.
*/

package lesson19;

 public class Analysesimulation{

   /**
   * @param args takes the country width, height, number of number of people
   * to stay at home, stay at home if sick, move normally, fly frequently,
   * and who are immunocompromised.
   * The last number inputed should be the number of times to run the simulation.
   */
   public static void main(String[] args){
     RunSimulation simulation = new RunSimulation(args);
     int numOfDays = 0;
     int numOfInfected = 0;
     int peakInfectedLevel = 0;
     int num_simulations = Integer.parseInt(args[7]);

     for(int i = 0; i < num_simulations; i++){
       int[] results = simulation.OneSimulation();
       numOfDays = results[0] + numOfDays;
       numOfInfected = results[1] + numOfInfected;

       if(peakInfectedLevel < results[2]){
         peakInfectedLevel = results[2];
       }
     }
     if(num_simulations > 0) {
       numOfDays = numOfDays/num_simulations;
       numOfInfected = numOfInfected/num_simulations;
     }

     System.out.println("the average number of days it takes until there are no new infections is " + numOfDays);
     System.out.println("the average number of people infected and finally recovered is " + numOfInfected);
     System.out.println("the maximum number of people infected is " + peakInfectedLevel);
   }

 }
