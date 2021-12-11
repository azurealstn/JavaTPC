//import java.lang.*; 생략가능

//Java에서 제공해주는 API 접근 및 활용
public class TPC32 {
	public static void main(String[] args) {
		//String Class
		String str = new String("APPLE");
		str.toLowerCase();
		System.out.println(str);
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL"));
		System.out.println(str.indexOf("PX"));
		System.out.println(str.replaceAll("P", "X"));
	}
}