package edu.handong.csee.java.lab06;
import java.util.Scanner;
/**
 * This Class name is Cesco
 * this Class has main(),computeNumberOfBugKiller()
 * 
 * First, user input the houseVolume and bug's population at first
 * then program print out how many bug's populations and volume are needed to fill out the this houseVolume
 * Also, count and print out how many weeks have passed 
 * 
 * 
 * after every weeks bugs growing up and this growth rate is equal to 0.95 
 * every bug's volume is equal to 0.002 
 * @author Kweon
 *
 */

public class Cesco {
	   final double GROWTH_RATE = 0.95; //fix a one bug's Growth rate after the one week 
	   final double ONE_BUG_VOLUME = 0.002; //fix a one bug's bug_volume
	
/** 
 * This is main method 
 * In this method, Call the computeNumberOfBugKiller() method
 *
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cesco mycesco = new Cesco(); // Use Cesco class's method as mycesco 
	    mycesco.computeNumberOfBugKiller(); // use computeNumberofbugkiller function in main 
	}
	
/**
 *This is computeNumberOfBugKiller() method
 *First user is requested to input the houseVolume and the bug's population at first
 *then this code compute how many newbug's population and volume be needed and how many weeks have passed to fill out the houseVolum.
 *After that print out first bug's population , house volume, countweeks, needed population and Volume of bugs 
 */
	    public void computeNumberOfBugKiller() { //main function
	        
	        Scanner keepwork = new Scanner(System.in); // Creat scanner object keepwork and ready to input the contents
	        System.out.print("Enter the houseVolume"); // print the "Enter the houseVolume" 
	        
	        double houseVolume = keepwork.nextDouble(); // 	user input the house_Volume that limits to the totalbugVolume
	        System.out.print("Enter the bug's population at first");// print the "Enter the bug's population at first"
	        double startPopulation = keepwork.nextDouble(); // user input the bug's population at first
	        double population = startPopulation; // this variable be used counting the bug's numbers
	        double totalBugVolume = population * ONE_BUG_VOLUME; // This is used computing the total bug's volume that is population * One_bug_volume
	        
	        
	        int countWeeks =0; // This variable is used counting a week numbers
	        while(totalBugVolume<houseVolume) { // if total_bug_volume < house_volume loop this contents, until total_bug_volume >= house_volume
	           double newBugs = population * GROWTH_RATE; // a number of newbugs after every weeks
	           double newBugVolume = newBugs * ONE_BUG_VOLUME; //  new addition BugVolume after every weeks
	           population = population + newBugs; // This is total population of bugs after every weeks
	           totalBugVolume = totalBugVolume+newBugVolume; //This is total bug's volume after every weeks
	           countWeeks+=1; // this is computing how many weeks have passed
	        }
	        
	        System.out.println("stortPop is" + startPopulation); // print out bug population inputed by user at first
	        System.out.println("housevolume is " + houseVolume); // print out user's house_volume
	        System.out.println("countWeeks is " + countWeeks); // print out Weeks that show how many weeks have passed during growing the bugs
	        System.out.println("currentpopulation is " + (int)population); // print out total population of bugs 
	        System.out.println("total bug is " + (int)totalBugVolume); // print out total bugs volume
	     
	     }
	  }

	