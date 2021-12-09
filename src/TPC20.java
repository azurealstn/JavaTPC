import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

/**
 * 상속관계에서 업캐스팅(자동형변환:Promotion)으로 객체를 생성하게 될 경우
 * 보통은 부모타입의 필드나 메소드만 사용이 가능합니다.
 * 하지만 부모의 메소드를 자식클래스에서 오버라이딩하면 동적바인딩이 되서
 * 자식클래스의 메소드를 실행할 수 있게됩니다.
 * 여기서 동적바인딩이란 실행시점에 메소드를 결정짓는것을 말합니다.
 * 전에 정적바인딩이란 컴파일시점에 메소드를 결정짓는다는것과 차이점이 있습니다.
 */
public class TPC20 {
	public static void main(String[] args) {
		//오버라이딩 실습
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		
		animal1.eat();
		animal2.eat();
	}
}