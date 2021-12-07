import kr.tpc.BookVO;

public class TPC11 {
	public static void main(String[] args) {
		//책 1권을 저장하기 위한 객체생성
		BookVO bookVO = new BookVO();
		bookVO.title= "파이썬";
		bookVO.price = 20000;
		bookVO.company = "에이콘";
		bookVO.page = 328;
		
		System.out.println(bookVO.title);
		System.out.println(bookVO.price);
		System.out.println(bookVO.company);
		System.out.println(bookVO.page);
	}
}