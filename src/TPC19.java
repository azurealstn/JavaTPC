import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
	public static void main(String[] args) {
		//Dog, Cat (자식) -> Animal (부모)
		Dog dog = new Dog();
		dog.eat();
		
		Cat cat = new Cat();
		cat.eat();
		
		Animal animal = new Dog();
		animal.eat();
		
		animal = new Cat();
		animal.eat();
	}
}