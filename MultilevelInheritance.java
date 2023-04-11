package oops;
class User1{
	int id;
	String name;
	public void setdata(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}
}
//child class
class Employee2 extends User1
{
	String address;
	String state;
	
	public void setdata(int id,String name,String address,String state)
	{
		super.setdata(id, name);
		this.address=address;
		this.state=state;
	}
	public void display() {
		super.display();
		System.out.println("Address :"+this.address);
		System.out.println("State :"+this.state);
	}
}
class Employee3 extends Employee2{
	double salary;
     String designation;
     public void setdata(int id,String name,String address,String state,double salary,String designation)
 	{
 		super.setdata(id, name, address, state);
 		this.salary=salary;
 		this.designation=designation;
 	}
 	public void display() {
 		super.display();
 		System.out.println("Salary :"+this.salary);
 		System.out.println("Designation :"+this.designation);
 	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Employee3 emp = new Employee3();
		emp.setdata(101, "Sumaiyya","Solapur","Maharashtra",50000,"Java Developer");
		emp.display();
		
		

	}

}
