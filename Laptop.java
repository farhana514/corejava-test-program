package javamyfirstproject;

public class Laptop {
	@Override
	protected void finalize() throws Throwable {
		System.out.println(" main method start");
		
		
	}
	
	

	public static void main(String[] args) {
		Laptop len = new Laptop();
		
		System.out.println( len);
		Laptop dell = new Laptop();
		System.out.println(dell);
		Laptop aucess = new Laptop();
		System.out.println( aucess);
		int a = 0x1dbd16a6;
		System.out.println(a);
	
		
		
	    len = null;
		dell = null;
		System.gc();
		System.out.println(dell);
		System.out.println(len);
		System.out.println( aucess);
		
 		

	}

}
