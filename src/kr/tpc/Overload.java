package kr.tpc;

/**
 * 오버로딩을 사용해도 속도에 지장이 없는 이유는
 * 정적바인딩을 하기 때문
 * 정적바인딩이란, 컴파일시에 미리 메소드를 네이밍규칙을 가지고
 * 만들기 때문에 바로 메소드를 찾을 수 있다.
 */
public class Overload {
	//동작(method)으로만 이루어진 객체
	public void hap(int a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, float b) {
		System.out.println(a + b);
	}
}
