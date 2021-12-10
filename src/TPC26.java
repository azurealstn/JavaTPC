import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {
	public static void main(String[] args) {
		RemoCon remoCon1 = new TV();
		remoCon1.chUp();
		remoCon1.chDown();
		remoCon1.internet();
		
		RemoCon remoCon2 = new Radio();
		remoCon2.chUp();
		remoCon2.chDown();
		remoCon2.internet();
	}
}