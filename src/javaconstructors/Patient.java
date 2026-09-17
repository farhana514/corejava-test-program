package javaconstructors;
import java.util.Scanner; 
public class Patient {
	String patientname;
	int age;
	int numberofdaysadmitted;
	double roomchargeperday;
	
	Patient(){
		
	}
	//parameritized constructor
	Patient(String patient_name, int age, int numberofdaysadmitted ,double roomchargeperday){
		this.patientname = patient_name;
		this. age = age;
		this.numberofdaysadmitted = numberofdaysadmitted;
		this.roomchargeperday = roomchargeperday;
		
	}
	void displayDetails() {
		
		double totalbill = (double)roomchargeperday *  numberofdaysadmitted;
		System.out.println("patientname:"+patientname);
		System.out.println("patientage:"+age);
		System.out.println("number of days admitted:"+numberofdaysadmitted);
		System.out.println("roomchargeperday:"+roomchargeperday);
		System.out.println("totalbill:"+totalbill);
		
		
		
	}
	
	
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name of the patient:");
		String patient_name = sc.nextLine();
		System.out.println("age");
		int age = sc.nextInt();
		System.out.println("number of days admitted");
		int numberofdaysadmitted = sc.nextInt();
		System.out.println("roomchargeperday");
		double roomchargeperday = sc.nextInt();
		
		
		Patient p = new Patient(patientname,age,numberofdaysadmitted,roomchargeperday );
		p.displayDetails();
		sc.close();
		
		
	}

}
