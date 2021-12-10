package kr.poly;

public class TV implements RemoCon {
	
	int currCH = 70;

	@Override
	public void chUp() {
		if (currCH < RemoCon.MINCH) {
			currCH++;
			System.out.println("TV의 채널이 올라간다. currCH=" + currCH);
		} else {
			currCH = 1;
			System.out.println("현재 채널은 " + currCH);
		}
	}

	@Override
	public void chDown() {
		System.out.println("TV의 채널이 내려간다.");		
	}

	@Override
	public void internet() {
		System.out.println("인터넷이 된다.");
	}

}
