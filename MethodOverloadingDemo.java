package oops;
//Method overloading is also knows as static,compile time Polymorphism
class Addition{
	public void add(int a) {
		System.out.println("Addition of one Parameter is "+(a+10));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition of three Parameters : "+(a+b+c));
	}
	public void add(int a,double b)
	{
		System.out.println("Addition of two Parameters : "+(a+b));
	}
	public void add(double a,int b)
	{
		System.out.println("Addition of two Parameters : "+(a+b));
	}
	public void add(double a,double b)
	{
		System.out.println("Addition of two Parameters : "+(a+b));
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Addition ad = new Addition();
		ad.add(13);
		ad.add(12, 6, 9);
		ad.add(15, 6.5);
		ad.add(7.89,83);
		ad.add(4.57, 8.45);
	}

}
