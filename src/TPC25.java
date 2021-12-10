import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		animal1.eat();
		animal1.move();
		
		Animal animal2 = new Cat();
		animal2.eat();
		animal2.move();
		
		Cat cat = (Cat) animal2;
		cat.night();
	}
}