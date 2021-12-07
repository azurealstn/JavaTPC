package kr.tpc;

public class Inflearn {
	//private 생성자 : 외부에서 생성불가
	private Inflearn() {
		
	}
	
	//인스턴스 메서드 (static 이 아닌 메서드)
	public static void tpc() {
		System.out.println("tpc 강의 시청중~");
	}
	
	//클래스 메서드
	public static void java() {
		System.out.println("java 강의 보는중~");
	}
}
