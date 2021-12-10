package kr.poly;

/**
 * 인터페이스는 100% 다형성을 보장한다.
 * 추상클래스는 비숫한 기능이 있으면 사용했을떄 좋지만,
 * 인터페이스는 서로 다른 기능일 때 사용하면 좋다.
 * 왜냐하면 인터페이스는 구현메소드를 정의할 수 없다.
 */
public interface RemoCon {
	
	//static final 생략가능
	//이러한 것을 '상수' 라고 한다.
	public static final int MINCH = 100;
	public int MAXCH = 300;
	
	public void chUp();
	public void chDown();
	public void internet();
}
