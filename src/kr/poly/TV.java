package kr.poly;

public class TV implements RemoCon {
	
	int currCH = 70;

	@Override
	public void chUp() {
		if (currCH < RemoCon.MINCH) {
			currCH++;
			System.out.println("TV�� ä���� �ö󰣴�. currCH=" + currCH);
		} else {
			currCH = 1;
			System.out.println("���� ä���� " + currCH);
		}
	}

	@Override
	public void chDown() {
		System.out.println("TV�� ä���� ��������.");		
	}

	@Override
	public void internet() {
		System.out.println("���ͳ��� �ȴ�.");
	}

}
