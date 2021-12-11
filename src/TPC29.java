import kr.poly.A;

public class TPC29 {
	public static void main(String[] args) {
		A a = new A();
		a.display();
		String result = a.toString();
		System.out.println(result);
		
		System.out.println("===================");
		
		Object object = new A(); //UpCasting
		A a1 = (A) object;
		a1.display();
		String result1 = a.toString();
		System.out.println(result1);
	}
}