package exceptionhandling;

public class Testdemo2 {

	public static void main(String[] args) {
		String s = null;
		String s1 = "null";
		String s2 = "";
		
		System.out.println(s2.length());//0
		System.out.println(s1.length());//4
		try {
			
		System.out.println(s.length());//NPE" null dot anything is nullprinter
		
		}catch(NullPointerException ne) {
			//ne.printStackTrace();
			System.out.println(ne.getMessage());
		}
		System.out.println("main method started");
		System.out.println("main method started");
		System.out.println("main method started");

}
}