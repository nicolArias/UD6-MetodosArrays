package actividades;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto4 {
	public static void factorial(){
		/*4) Crea una aplicación que nos calcule el factorial de un número pedido por teclado, lo
			realizara mediante un método al que le pasamos el número como parámetro. Para calcular
			el factorial, se multiplica los números anteriores hasta llegar a uno. Por ejemplo, si
			introducimos un 5, realizara esta operación 5*4*3*2*1=120.
		 */
		
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
		int resultado=calculoFactorial(numero);
		
		
		JOptionPane.showMessageDialog(null,"El factorial del número "+numero+" es: "+resultado);
	}
	
	public static int calculoFactorial(int numero) {
		
		int operacion=1;
		for(int i=numero;i>=1;i--) {
			operacion*=i;
			
		}
		
		return operacion;
	}

}
