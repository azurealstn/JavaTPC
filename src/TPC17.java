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
		
		MovieVO movieVO = new MovieVO("비트", 12000, "연기자", 12, 1.3f);
		System.out.println(movieVO.toString());
		
		System.out.println("============");
		
		//객체배열 생성
		MovieVO[] movieVOs = new MovieVO[3];
		movieVOs[0] = new MovieVO("비트1", 12000, "연기자1", 12, 1.3f);
		movieVOs[1] = new MovieVO("비트2", 13000, "연기자2", 13, 1.4f);
		movieVOs[2] = new MovieVO("비트3", 14000, "연기자3", 14, 1.5f);
		
		System.out.println(movieVOs[0]);
		System.out.println(movieVOs[1]);
		System.out.println(movieVOs[2]);
		
		System.out.println("============");
	}
}