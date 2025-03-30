package week1_Tasks;

public class AbstractClassImpl {
	 public static void main(String[] args) {
		 Animal dog = new Dog();
	     dog.makeSound();
	 }
}
// Abstract method to be implemented by concrete subclass
abstract class Animal{
	abstract void makeSound();
}
// Concrete subclass Dog overrides the method in abstract class Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
    	System.out.println("The dog is barking.");
    }
}


