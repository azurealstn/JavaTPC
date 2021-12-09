import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
	public static void main(String[] args) {
		//Dog, Cat (�ڽ�) -> Animal (�θ�)
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