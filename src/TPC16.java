import kr.tpc.Overload;

public class TPC16 {
	public static void main(String[] args) {
		Overload overload = new Overload();
		overload.hap(20, 30); //hap_int_int()
		overload.hap(23.4f, 45); //hap_float_int()
		overload.hap(43.2f, 82.1f); //hap_float_float()
	}
}