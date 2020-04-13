package lesson19;

 public class Analysesimulation(){

   public static void main(String[] args){
     RunSimulation simulation = new RunSimulation(args);
     int numOfDays = 0;
     int numOfInfected = 0;
     int peakInfectedLevel = 0;
     int NUM_SIMULATIONS = Integer.parseInt(args[7]);
     for(int i = 0; i < NUM_SIMULATIONS; i++){
       int[]results = simulation.OneSimulation();
       numOfDays = results[0] + numOfDays;
       numOfInfected = result[1] + numOfInfected;
       if(peakInfectedLevel < result[2]){
         peakInfectedLevel = result[2]
       }
     }
     numOfDays = numOfDays/NUM_SIMULATIONS;
     numOfInfected = numOfInfected/NUM_SIMULATIONS;

     System.out.println("the average number of days it takes until there are no new infections is " + numOfDays);
     System.out.println("the average number of people infected and finally recovered is " + numOfInfected);
     System.out.println("the maximum number of people infected is " + peakInfectedLevel);
   }

 }
