

public class _1_28_Boolean {

	public static void main(String[] args) {
		int a = 1;
		boolean teste = a == 2;
		
		if(teste) {
			System.out.println("teste 1");
		}

		teste = a == 1;
		if(teste)  {
			System.out.println("teste 2");
		}
		
		System.out.println(teste);
		teste = false;
		System.out.println(teste);
		
		if(teste)  {
			System.out.println("teste 3");
		}
		
		teste = true;
		if(teste)  {
			System.out.println("teste 4");
		}
	}
}
