package javamyfirstproject;

public class Hello {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method start !!");
//		bootstrap classloader
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
//		application classloader
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("main method ending  !!");
	

	}

}
