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
		
		//UpCasting(부모-자식)
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		animal1.eat();
		animal2.eat();
		
		//DownCasting(자식-부모)
		Cat cat2 = (Cat) animal2;
		cat2.night();
		
		//위에서 Animal타입의 eat()메소드를 사용하는데 각각 다른
		//결과가 나온다는 것을 확인할 수 있다. 이것을 '다형성' 이라고 한다.
	}
}