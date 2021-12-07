public class TPC09 {
	public static void main(String[] args) {
		int a = 54;
		int b = 30;
		TPC09 tpc09 = new TPC09(); //Heap 康开俊 按眉 积己
		int result = tpc09.sum(a, b);
		System.out.println(result);
	}
	
	public int sum(int a, int b) {
		int v = a + b;
		return v;
	}
}