public class TPC06 {
	public static void main(String[] args) {
		//메서드 -> 동작(method), 기능(function)
		int a = 65;
		int b = 43;
		int result = sum(a, b);
		System.out.println("sum() = " + result);
		
		int[] arr = makeArr();
		int hap = 0;
		for (int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		System.out.println("makeArr() = " + hap);
	}
	
	//정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메서드
	public static int sum(int x, int y) {
		int v = x + y;
		return v;
	}
	
	//배열 파라미터
	public static int[] makeArr() {
		int x = 10;
		int y = 20;
		int z = 30;
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		
		return arr;
	}
}