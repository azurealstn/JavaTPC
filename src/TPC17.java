import java.util.Arrays;

import kr.tpc.MovieVO;

public class TPC17 {
	public static void main(String[] args) {
		
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		int[] b = {10, 20, 30, 40, 50};
		
		int[] c = new int[] {10, 20, 30, 40, 50};
		
		System.out.println("============");
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		MovieVO movieVO = new MovieVO("��Ʈ", 12000, "������", 12, 1.3f);
		System.out.println(movieVO.toString());
		
		System.out.println("============");
		
		//��ü�迭 ����
		MovieVO[] movieVOs = new MovieVO[3];
		movieVOs[0] = new MovieVO("��Ʈ1", 12000, "������1", 12, 1.3f);
		movieVOs[1] = new MovieVO("��Ʈ2", 13000, "������2", 13, 1.4f);
		movieVOs[2] = new MovieVO("��Ʈ3", 14000, "������3", 14, 1.5f);
		
		System.out.println(movieVOs[0]);
		System.out.println(movieVOs[1]);
		System.out.println(movieVOs[2]);
		
		System.out.println("============");
	}
}