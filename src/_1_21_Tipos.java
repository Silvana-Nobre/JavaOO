

/**
 * Tabela Tipo Primitivo
 * 
 * Tipagem - Conjunto - Valor Minimo               - Valor Maximo              - Bits
 * byte    - inteiro  -                       -128 -                       127 -  8
 * short   - inteiro  -                    -32.768 -                    32.767 - 16
 * int     - inteiro  -             -2.147.483.648 -             2.147.483.647 - 32
 * long    - inteiro  - -9.223.372.036.854.775.808 - 9.223.372.036.854.775.807 - 64
 * float   - real     -                          _ -                         _ - 32
 * double  - real     -                          _ -                         _ - 64
 * boolean - true (verdadeiro) ou false (falso)                                -  8
 * char	   - letra                                                             - 16
*/

public class _1_21_Tipos {

	public static void main(String[] args) {
		
		byte inteiroMinusculo = 1;
		short inteiroPequeno = 22;
		int inteiro = 333;
		long inteiroLongo = 4444;

		float decimalPequeno = 5.5F; // F um float dever ser identificado com
		double decimal = 66.66;
		
		boolean verdadeiroFalso = true;
		
		char letra = 'a';
		
		System.out.print (inteiroMinusculo);
		System.out.print (inteiroPequeno);
		System.out.print (inteiro);
		System.out.print (inteiroLongo);
		
		System.out.print (decimalPequeno);
		System.out.print (decimal);
		
		System.out.print (verdadeiroFalso);
		
		System.out.print (letra);
	}
}
