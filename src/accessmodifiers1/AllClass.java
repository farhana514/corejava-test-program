package accessmodifiers1;


import accessmodifier.AllclassUsed;

public class AllClass extends AllclassUsed{

	

		public static void main(String[] args) {
			AllclassUsed t1 = new AllclassUsed();
			//accessing the private data members outside the package is not possible
			      //System.out.println(t1.a1);
			       //System.out.println(t1.name1);
			//t1.method1();
	///    accessing the default data members outside the package is not possible
	///    even through,class is public,constructor is public,you imported class
	/// but your class members are default so we can't access outside the packages
	     //  System.out.println(t1.a2);	
			//System.out.println(t1.name2);
	        //t1.method2();
			System.out.println("----------------------------------------");
			//accessing the public data members outside the package
			System.out.println(t1.a3);
			System.out.println(t1.name3);
			t1.method3();
			
			///acessing the protected data memebers outside the package is not possible
//			System.out.println(t1.a4);
//			System.out.println(t1.name4);
//			t1.method4();
			
			System.out.println("--------- ------------------------");
			
			AllClass t2 = new AllClass();
			
			System.out.println("--------------------------------");
			//accessing the protected data outside the package but creating the object for and use that object reference variables
			System.out.println(t2.a4);
			System.out.println(t2.name4);
			t2.method4();
	}

}
