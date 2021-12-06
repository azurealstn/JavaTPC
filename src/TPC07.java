public class TPC07 {
	public static void main(String[] args) {
		int a = 20;
		float b = 56.4f;
		float v = sum(a, b);
		System.out.println(v);
		
		int[] arr = {1, 2, 3, 4, 5};
		int vv = arrSum(arr);
		System.out.println(vv);
	}
	
	//call by value -> �� ����
	public static float sum(int a, float b) {
		float v = a + b;
		return v;
	}
	
	//call by reference -> ���� ����
	public static int arrSum(int[] arr) {
		int hap = 0;
		for (int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		return hap;
	}
}