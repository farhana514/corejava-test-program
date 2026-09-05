package accessmodifier;

public class AllclassUsed {
	
	static {
		System.out.println("static block called for accessmodifiers1");	
	}
	{
		System.out.println(" instance block called for accessmodifiers1");
	}
	// protected data members
	protected int a4=31;
	protected String name4 = "ruturaj";
	protected void method4() {
		System.out.println("method called");
	} 
	//public data members
	public int a3 =7;
	public String name3 = "dhoni";
	
	public void method3() {
		System.out.println("method3 called");
	}
	//default data members
	int a2=45;
	String name2 =" rohit";
	
	void method2() {
		System.out.println("method2 called");
		
	}
	//private data members
	private int a1 =18;
	private String name1 = "virat";
	
	//private called method
	private void method() {
		System.out.println("method1 called");
	}
	//no arg constructor
	public void AllClassUsed() {
	System.out.println("no arg constructor called");	
	}
			

	public static void main(String[] args) {
		AllclassUsed t1 = new AllclassUsed();
		
		System.out.println("------------------------------");
		//accessing the private data accessing with in class
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method();
		
		System.out.println("-------------------------------");
		//accessing the default data accessing with in the class
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();
		
		System.out.println("----------------------------------");
		//accessing the public data accessing with in the class
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();
		
		System.out.println("----------------------------");
		//accessing the protected data accessing with in the class
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method();
		
		
		
	}

}
