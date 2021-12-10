package kr.poly;

/**
 * 추상클래스는 일부다형성을 보장
 * 상속받은 클래스는 반드시 추상메소드를 재정의해야하기 때문
 */
public abstract class Animal {
	//Dog, Cat의 공통 메소드 eat()
	public abstract void eat();
	
	//구현된 메소드
	public void move() {
		System.out.println("무리를 지어서 이동한다.");
	}
}