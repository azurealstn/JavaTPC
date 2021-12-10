import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC27 {
	public static void main(String[] args) {
		RemoCon remoCon = new TV();
		for (int i = 0; i < 40; i++) {
			remoCon.chUp();
		}
		remoCon.chDown();
		remoCon.internet();
	}
}
