import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {
	public static void main(String[] args) {
		//1. �������μ�
		Dog dog = new Dog();
		display(dog);
		Cat cat = new Cat();
		display(cat);
		
	}
	
	public static void display(Animal animal) { //�������μ�
		animal.eat();
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.night();
		}
	}
}