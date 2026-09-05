package accessmodifier;

public class AllClassLinked {

	public static void main(String[] args) {
		///the  constructed AllClassused () is not visible if no-arg constructor is private 
		// AllClassUsed t1= new AllClassUsed();
		
		AllclassUsed t1 = new AllclassUsed();
		//// we can not access private data members outside the class
        //System.out.println(t1.a1);
		//System.out.println(t1.name1);	 
		//t1.method();
		
		////Acessing the default data accesing outside the class same package 
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();
		
		System.out.println("------------------");
		////accesing the public data accessing outside the class but same package
	    System.out.println(t1.a3);
	    System.out.println(t1.name3);
	    t1.method3();
		
	    System.out.println("------------------");
		///Accesing the protected data accesing outside the class but same package 
	    System.out.println(t1.a4);
	    System.out.println(t1.name4);
	    t1.method4();
		
		
	}

	
	}


	


