

public class _1_27_IfEncadeado {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		if(a == b) {
			if(a == c - 1) {
				System.out.println("a == b & a == c + 1");
			}
		}
		
		if(a == b - 1) {
			if(a == c - 2) {
				System.out.println("a == b - 1 & a == c - 2");
			}
		}
	}
}
