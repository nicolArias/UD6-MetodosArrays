 package actividades;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto6 {
	
	/*6) Crea una aplicaci�n que nos cuente el n�mero de cifras de un n�mero entero positivo
		(hay que controlarlo) pedido por teclado. Crea un m�todo que realice esta acci�n, pasando
		el n�mero por par�metro, devolver� el n�mero de cifras.
	 */
	
	public static void cifras() {
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero entero:"));
		
		if(numero>0) {
			JOptionPane.showMessageDialog(null, "La cantidad de cifras del n�mero "+numero+" es: "+numeroCifras(numero));
		}else {
			JOptionPane.showMessageDialog(null, "El n�mero que ingreso no es correcto");
		}
		
	}
	
	
	public static int numeroCifras(int numero){
		//Para saber la cantidad de cifras de un n�mero, basta con saber el log base 10 y luego sumar 1
		int respuesta=(int)(Math.log10(numero))+1;
		return respuesta;
	}
}
