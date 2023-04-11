package oops;
class Animal{
	public void display()
	{
		System.out.println("Animal Kingdom");
	}
}
class Mammal extends Animal{
	public void birth()
	{
		System.out.println("Mammals give birth to offsprings.");
	}
}
class Dog extends Mammal{
	public void puppy()
	{
	  System.out.println("Dog's offspring are called puppy");	
	}
}
public class Multileveldemo {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.puppy();
		dog.birth();
		dog.display();

	}

}
