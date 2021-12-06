public class TPC04 {
	public static void main(String[] args) {
		//4. 변수 VS 배열
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		hap(a, b, c);
		
		int[] arr;
		arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		hap1(arr);
		
	}
	
	public static void hap(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}
	
	public static void hap1(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}