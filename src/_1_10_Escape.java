

/** 
 * Tabela Escape
 * 
 * \n  - pula linha
 * \t  - tab (tabula)
 * \b  - backspace (impressoras matriciais, o carro volta ao inicio)
 * \f  - form feed
 * \r  - carriage return (impressoras matriciais, o carro volta ao inicio, apos
 *                                                                         o \n)
 * \"  - para imprimir "
 * \\  - para imprimir \
*/
public class _1_10_Escape {

	public static void main(String[] args) {
		System.out.println("Pula Linha\n...");
		
		System.out.println("**********************");
		
		System.out.println("Tab\t...");
		
		System.out.println("**********************");
		
		System.out.println("texto \" texto \\");
	}
}
