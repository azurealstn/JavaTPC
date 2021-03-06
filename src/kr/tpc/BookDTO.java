package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	//기본생성자 메서드 생략가능
	public BookDTO() {
		//기본생성자 메서드는 내부적으로 객체를 생성하는 작업을한다. (기계어코드)
	}
	
	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}

	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", price=" + price + ", company=" + company + ", page=" + page + "]";
	}
	
}
