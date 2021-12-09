import kr.tpc.Animal;
import kr.tpc.Cat;

public class TPC22 {
	public static void main(String[] args) {
//		Cat cat = new Cat();
//		Object object = new Cat();
		Animal animal = new Cat(); //UpCasting
		animal.eat(); //컴파일타임->Animal, 런타임->Dog
		
		Cat cat = (Cat) animal; //DownCasting
		cat.night();
		
	}
}