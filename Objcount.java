package javamyfirstproject;

public class Objcount {
	static int Objectcount;
	{
		Objectcount++;
		
		
		
	}

	public static void main(String[] args) {
		
		Objcount t1 = new Objcount();
		Objcount t2 = new Objcount();
		Objcount t3 = new Objcount();
		
		System.out.println(" object count:" +Objectcount); 
		
	
		

	}

}
