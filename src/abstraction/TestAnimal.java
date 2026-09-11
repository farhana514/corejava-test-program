package abstraction;

public class TestAnimal {

	public static void main(String[] args)  {
		System.out.println("welcome to animal park!!");
		System.out.println("Organization name:"+AnimalAbstact.ORG_NAME);

		
		// cannot instantiate the type animal
		//animal a = new animal();
		
		System.out.println("-------------------Dog info----------------");
		//dog object can store it into animal interface will consider as abstarction with
		AnimalAbstact d = new Dog();
		d.sound();
		d.eat();
		d.walk();
		d.run();
		
		System.out.println("------------------------");
       
		System.out.println("****************cat info*************");
		AnimalAbstact c = new Cat();
		c.sound();
		c.eat();
		c.walk();
		c.run();
		 System.out.println("---------------------------------");
		 System.out.println("*******************monkey info ************");
		AnimalAbstact m= new Monkey();
		m.sound();
		m.eat();
		m.walk();
		m.run();
	}  
}	


	

