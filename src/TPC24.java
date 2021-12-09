import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {
	public static void main(String[] args) {
		//2. 다형성배열
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Cat();
		
		for (Animal animal : animals) {
			animal.eat();
			if (animal instanceof Cat) {
				Cat cat = (Cat) animal;
				cat.night();
			}
		}
	}
}