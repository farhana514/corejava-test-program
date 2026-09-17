package javaconstructors;

public class Copyconstructor {
	int empid;
	String empname;
	double salary;
	
	Copyconstructor(Copyconstructor c){
		this.empid=empid;
	this.empname=empname;
	this.salary=salary;
	}
		
	void increment() {
		salary = 10000+salary;
		empname = "ramesh";
	}

	public Copyconstructor(int empid, String empname, double salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

void display() {
	System.out.println("employe id:"+empid);
	System.out.println("employe name:"+empname);
	System.out.println("salary:"+salary);
}

	public static void main(String[] args) {
		Copyconstructor c1 = new Copyconstructor(101,"ravi",50000);
		c1.display();
		
		Copyconstructor c2 = new Copyconstructor(c1);
		c2.increment();
		c2.display();
	
		
			
		

	}

}
