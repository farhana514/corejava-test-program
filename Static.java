package javamyfirstproject;

public class Static {
	static {
		System.out.println("static method loaded");
		Static D = new Static();
		
	}

	public static void main(String[] args) {
		System.out.println(" main method started !!");
		Static D = new Static();
		
	}
	{
		
		System.out.println("Instance block1 loaded");
	}
	{
		System.out.println("Instance block2 loaded");
	}
	
		static {
			
			System.out.println("static method loade");
		
	}

}
