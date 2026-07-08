package javamyfirstproject;

public class Employegc {
	@Override
	protected void finalize() throws Throwable {
		System.out.println(" main method start");
		
	}		
		

	public static void main(String[] args) {
		Employe f = new Employe();
		f.salary = 20000;
		f.name = "Ram";
		
		
		  
		System.out.println( " employe salary:"+ f.salary);
		System.out.println(" employe name:"+f.name );
		Employegc g = new Employegc();
		System.out.println(g);
		g = null;
		System.out.println(g);
		
		
		

	}

}
