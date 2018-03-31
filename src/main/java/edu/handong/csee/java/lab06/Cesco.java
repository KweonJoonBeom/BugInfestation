package edu.handong.csee.java.lab06;
import java.util.Scanner;

public class Cesco {
	   final double GROWTH_RATE = 0.95; 
	   final double ONE_BUG_VOLUME = 0.002; 
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cesco mycesco = new Cesco(); // instantiate Cesco class to use mycesco
	    mycesco.computeNumberOfBugKiller();
	}
	    public void computeNumberOfBugKiller() {
	        
	        Scanner keepwork = new Scanner(System.in); // instantiate Scanner class to use keepwork
	        System.out.print("Enter the houseVolume"); // call print 
	        
	        double houseVolume = keepwork.nextDouble(); // put value that user input to houseVolume
	        System.out.print("Enter the bug's population at first");// call print method to print-out string
	        double startPopulation = keepwork.nextDouble(); // put value that user input to startPopulation, that use roach's population at first
	        double population = startPopulation; // this is used counting roach's number
	        double totalBugVolume = population * ONE_BUG_VOLUME; // This is used comparing with house_volum
	        
	        
	        int countWeeks =0; // This is used counting weeks
	        while(totalBugVolume<houseVolume) { // if that is true
	           double newBugs = population * GROWTH_RATE; // This is number of new bugs every weeks
	           double newBugVolume = newBugs * ONE_BUG_VOLUME; // This is volume of new bugs every weeks
	           population = population + newBugs; // This is total population of bugs after generating new bugs
	           totalBugVolume = totalBugVolume+newBugVolume; //This is total bug's volume after generating new bugs
	           countWeeks+=1; // After generating new bugs, Week are increased.
	        }
	        
	        System.out.println("stortPop is" + startPopulation); // print-out bug's population at first
	        System.out.println("housevolume is " + houseVolume); // print-out house's volume
	        System.out.println("countWeeks is " + countWeeks); // print-out Weeks that show how many weeks take bugs to covering house
	        System.out.println("currentpopulation is " + (int)population); // print-out total population of bugs when bugs to covering house
	        System.out.println("total bug is " + (int)totalBugVolume); // print-out total bugs' volume
	     
	     }
	  }

	