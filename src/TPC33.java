public class TPC33 {
	public static void main(String[] args) {
		String str1 = new String("APPLE"); //Heap 영역에 저장
		String str2 = new String("APPLE");
		
		//번지수를 비교
		System.out.println("번지수 비교");
		if (str1 == str2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		System.out.println("문자열값 비교");
		if (str1.equals(str2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		String str3 = "APPLE"; //리터럴 풀 영역에 저장
		String str4 = "APPLE";
		
		System.out.println("문자열 리터럴 번지수 비교");
		if (str3 == str4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		System.out.println("문자열 리터럴값 비교");
		if (str3.equals(str4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
