package kr.tpc;

//å(Object) -> ����, ����, ���ǻ�, �������� ...
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	//�⺻������ �ʱ�ȭ
	public BookVO() {
		//�ʱ�ȭ �۾�
		this.title = "�ڹ�";
		this.price = 14000;
		this.company = "������";
		this.page = 392;
	}
	
	//������ �޼��� �ߺ����� -> Overloading
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
}
