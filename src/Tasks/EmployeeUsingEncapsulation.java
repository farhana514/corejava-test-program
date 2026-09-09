package Tasks;

public class EmployeeUsingEncapsulation {

	private int id;
	private String name;
	private double salary;
	private String passward;
	
	public void setId(int id) {
		this.id = id;
		
	}
	public int getId() {
		return id;
		
	}
	public void setname(String name) {
		this.name = name;
		
	}
	public String getname() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getsalary() {
		return salary;
	}
	public void setpassward(String passward) {
		this.passward = passward;
	}
	public String getPassward() {
		return passward;
		
	}
	public static void main(String[]args) {
		EmployeeUsingEncapsulation e = new EmployeeUsingEncapsulation();
		e.setId(101);
		e.setname("Farhana");
		e.setSalary(50000);
		e.setpassward(" abc123");
		System.out.println("employee id:"+e.getId());
		
		System.out.println("employee name:"+e.getname());
		System.out.println("employee name:"+e.getsalary());
		System.out.println("employee passward:"+e.getPassward());
				
	}
      
}
