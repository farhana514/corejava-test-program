package javaliterals;

public class Floatingliterals {
	//binary 
	float  f = 10;
	float f1 = 11f;
	
	
	//octal to float 
	//for float points octal does not work
	float f2 = 10.5f;
	float f3 = 0123;
	float f4 = 0123.5f;
	float f5 = 0123.f;
	float f6 = 0x123;
    float f8 = 0x123f;	 
    
    //binary 
    float f7 = 0b01000;

	public static void main(String[] args) {
		Floatingliterals f = new Floatingliterals ();
		System.out.println(f.f1);
		System.out.println(f.f2);
		System.out.println(f.f3);
		System.out.println(f.f4);
		System.out.println(f.f5);
		System.out.println(f.f6);
		System.out.println(f.f7);
		System.out.println(f.f8);
		
	}

}
