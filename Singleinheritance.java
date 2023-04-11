package oops;

class user{
	int id;
	String name,address;
	public void setdata(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Address : "+this.address);
	}
}
//child class
class Employee1 extends user
{
	double salary;
	String designation;
	
	public void setdata(int id,String name,String address,double salary,String designation)
	{
		super.setdata(id, name, address);
		this.salary=salary;
		this.designation=designation;
	}
	public void display() {
		super.display();
		System.out.println("Salary "+this.salary);
		System.out.println("Designation "+this.designation);
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		emp.setdata(101, "Sumaiyya","Solapur", 50000, "Java Developer");
		emp.display();
	}
}


