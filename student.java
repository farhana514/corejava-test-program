package javamyfirstproject;

public class student {
//	instance classloader or nonstatic class
	int sid=522;
	String sname="Swathi";
//	stastic data
	
	static int collegeid;
	static String collegename;

	public static void main(String[] args) {
		collegeid = 23456789;
		collegename = "abcd";
		System.out.println(" College ID :"+ collegeid);
		System.out.println( "college Name: "+collegename);
		
		
		student swathi = new student();
		swathi.sid = 234567890;
		swathi.sname = "xyz";
		System.out.println( "StudentID:" +swathi.sid);
		System.out.println( "Studentname:"+swathi.sname);
	
		
		
		
	
		

	}

}
