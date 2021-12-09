import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		
		Cat cat = new Cat();
		cat.eat();
		cat.night();
		
		System.out.println("================");
		
		//UpCasting(�θ�-�ڽ�)
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		animal1.eat();
		animal2.eat();
		
		//DownCasting(�ڽ�-�θ�)
		Cat cat2 = (Cat) animal2;
		cat2.night();
		
		//������ AnimalŸ���� eat()�޼ҵ带 ����ϴµ� ���� �ٸ�
		//����� ���´ٴ� ���� Ȯ���� �� �ִ�. �̰��� '������' �̶�� �Ѵ�.
	}
}