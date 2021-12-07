package kr.tpc;

//책(Object) -> 제목, 가격, 출판사, 페이지수 ...
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	//기본생성자 초기화
	public BookVO() {
		//초기화 작업
		this.title = "자바";
		this.price = 14000;
		this.company = "이지스";
		this.page = 392;
	}
	
	//생성자 메서드 중복정의 -> Overloading
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
}
