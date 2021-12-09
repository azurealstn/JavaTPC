import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {
	public static void main(String[] args) {
		//1. 다형성인수
		Dog dog = new Dog();
		display(dog);
		Cat cat = new Cat();
		display(cat);
		
	}
	
	public static void display(Animal animal) { //다형성인수
		animal.eat();
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.night();
		}
	}
}