

public class _1_38_WhileContinue {

	public static void main(String[] args) {
		int i = 0;
		
		while(i < 20) {
			if(i == 10) {
				i++;
				continue;
			}
				
			System.out.println(i);
			i++;
		}
	}

}
