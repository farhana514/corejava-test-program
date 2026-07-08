package javamyfirstproject;

public class Movie {
	int seatnum;
	String customername;
	
	static int totalseats = 50;
	static String moviename ="rebal";
	

	public static void main(String[] args) {
		System.out.println( " theatre details.....");
		
		Movie name = new Movie();
		name.seatnum = 25;
		name.customername = "farru";
		
		
		
		System.out.println( " seatnumber:"+ name.seatnum);
		System.out.println( "customername:"+  name.customername);
		System.out.println( " totalseats:"+ totalseats);
		System.out.println(" moviename:"+ moviename);
		System.out.println("------------------------------");
		 
		Movie name2 = new Movie();
		name2.seatnum = 26;
		name2.customername = "farju";
		
		System.out.println( "seatnumber:"+ name2.seatnum);
		System.out.println( " customername:"+ name2.customername);
		
		System.out.println( " totalseats:"+ totalseats);
		System.out.println(" moviename:"+ moviename);
		
		

	}

}
