

public class _1_32_SwitchBreak {

	public static void main(String[] args) {
		int a = 2;
		
		System.out.println("*****************************");
		
		switch (a) {
			case 1: System.out.println("a == 1");
			case 2: System.out.println("a == 2");
		}
		
		System.out.println("*****************************");
		
		switch (a) {
			case 3: System.out.println("a == 3");
			case 2: System.out.println("a == 2");
			case 1: System.out.println("a == 1");
		}
		
		System.out.println("*****************************");
		
		switch (a) {
			case 3: System.out.println("a == 3");
			break;
			case 2: System.out.println("a == 2");
			break;
			case 1: System.out.println("a == 1");
			break;
		}
	}
}
