import kr.tpc.BookVO;

public class TPC11 {
	public static void main(String[] args) {
		//å 1���� �����ϱ� ���� ��ü����
		BookVO bookVO = new BookVO();
		bookVO.title= "���̽�";
		bookVO.price = 20000;
		bookVO.company = "������";
		bookVO.page = 328;
		
		System.out.println(bookVO.title);
		System.out.println(bookVO.price);
		System.out.println(bookVO.company);
		System.out.println(bookVO.page);
	}
}