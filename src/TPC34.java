import kr.inflearn.IntArray;

public class TPC34 {
	public static void main(String[] args) {
		//IntArray�� �̿��� API Ȱ��
		IntArray intArray = new IntArray(); //10 size
		intArray.add(10);
		intArray.add(20);
		intArray.add(30);
		
		for (int i = 0; i < intArray.size(); i++) {
			System.out.println(intArray.get(i));
		}
		
	}
}