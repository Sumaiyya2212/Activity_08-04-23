package oops;
//Method overriding is also knows as Run time Polymorphism or dynamic Binding
class ParentBank{
	public void loanInterest()
	{
		System.out.println("Parent Bank method is called");
		System.out.println("7% Loan Interest");
	}
}
class childsbi extends ParentBank
{
	public void loanInterest()
	{
		System.out.println("Child SBI method is called");
		System.out.println("6.5% Loan Interest");
	}	
}
class childAxis extends ParentBank
{
	public void loanInterest()
	{
		System.out.println("Child Axis method is called");
		System.out.println("9.5% Loan Interest");
	}	
}
public class OverridingDemo {

	public static void main(String[] args) {
		ParentBank pbank;
		pbank = new childsbi();//Upcasting 
		pbank.loanInterest();
		System.out.println("--------");
		pbank = new childAxis();
		pbank.loanInterest();
		System.out.println("--------");
		pbank = new ParentBank();
		pbank.loanInterest();
	}

}
