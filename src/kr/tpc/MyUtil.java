package kr.tpc;

public class MyUtil {
	//1 ~ 10까지의 합
	public int hap() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i + 1;
		}
		return sum;
	}
}
