package javaconstructors;

import java.util.Scanner;

public class Cricketplayer {
	String playername;
	int matchesplayed;
	int  totalruns;
	// parameterized constructor
	 Cricketplayer( String player_name,int matchesplayed, int totalruns ){
		this.playername = player_name;
		this.matchesplayed = matchesplayed;
		this.totalruns = totalruns;
		
	 }
	//method to display player details and average runs
	 void playinfo() { 
		 double averageruns = (double)totalruns / matchesplayed;

		System.out.println("name of the player:"+playername);
		System.out.println("number of the matches:"+matchesplayed);
		System.out.println("number of the totalruns:"+totalruns);
		System.out.println("Avearge runs :"+averageruns);
	 }
	 
	

	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("name of the player:");
	 	String player_name = sc.nextLine();
	 	System.out.println("number of the matches:");
	 	int matchesplayed = sc.nextInt();
	 	System.out.println("number of the runs:");
	 	int runs = sc.nextInt();
	 	 
	 
	 	Cricketplayer cp =new Cricketplayer(player_name,matchesplayed,runs);
	 	 cp.playinfo();
	 	sc.close();
	 }
	   
	
	   
}
		
		
		
		
	


