import java.util.ArrayList;

import kr.inflearn.ObjectArray;
import kr.tpc.A;
import kr.tpc.B;

public class TPC35 {
	public static void main(String[] args) {
//		ObjectArray objectArray = new ObjectArray(5); //단점은 배열이기때문에 길이를 늘릴 수 없음. (고정길이)
		ArrayList<Object> objectArray = new ArrayList<>(); //Java에서 제공해주는 API
		objectArray.add(new A());
		objectArray.add(new B());
		objectArray.add(new A());
		objectArray.add(new A());
		objectArray.add(new B());
		objectArray.add(new A());
		objectArray.add(new A());
		objectArray.add(new B());
		
		for (int i = 0; i < objectArray.size(); i++) {
			Object object = objectArray.get(i);
			if(object instanceof A) {
				A a = (A) object;
				a.go();
			} else {
				B b = (B) object;
				b.go();
			}
		}
		
	}
}