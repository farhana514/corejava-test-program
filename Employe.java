package javamyfirstproject;

public class Employe {
	int salary;
	String name;
	
	static String officename =" VSS";
	static String location =" HYD";
	
	
	public static void main(String[] args) {
	System.out.println( " Employe details");
	
	Employe f = new Employe();
	f.salary = 20000;
	f.name = "Ram"; 
	  
	System.out.println( " employe salary:"+ f.salary);
	System.out.println(" employe name:"+f.name );
	System.out.println(" employe office name: "+officename);
	System.out.println("employe location:"+ location);
	System.out.println("--------------------------");
	
	Employe t = new Employe();
	t.salary = 30000;
	t.name = "farru"; 
	  
	System.out.println( " employe salary:"+ t.salary);
	System.out.println(" employe name:"+t.name );
	System.out.println(" employe office name: "+officename);
	System.out.println("employe location:"+ location);
	System.out.println("--------------------------");
	
	

	}

}
