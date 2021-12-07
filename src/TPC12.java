import kr.tpc.BookVO;

public class TPC12 {
	public static void main(String[] args) {
		//积己磊 -> 按眉(积己 + 檬扁拳)
		BookVO bookVO1 = new BookVO();
		System.out.println(bookVO1.title);
		System.out.println(bookVO1.price);
		System.out.println(bookVO1.company);
		System.out.println(bookVO1.page);
		
		System.out.println("==============");
		
		BookVO bookVO2 = new BookVO("Python", 19000, "Media", 870);
		System.out.println(bookVO2.title);
		System.out.println(bookVO2.price);
		System.out.println(bookVO2.company);
		System.out.println(bookVO2.page);
		
	}
}