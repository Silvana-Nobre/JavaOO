

public class _1_30_OperadoresLogicos_2 {

	public static void main(String[] args) {
		int a = 1;
		
		if(a == 1 && a == 2) {
			System.out.println("a == 1 e a == 2");
		}
		
		if(a == 1 || a == 2) {
			System.out.println("a == 1 ou a == 2");
		}
		
		if(a == 2 || (a == 1 && a == 3)) {
			System.out.println("a == 2 ou (a == 1 e a == 3)");
		}
	}
}
