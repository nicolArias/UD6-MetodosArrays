 package actividades;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto6 {
	
	/*6) Crea una aplicación que nos cuente el número de cifras de un número entero positivo
		(hay que controlarlo) pedido por teclado. Crea un método que realice esta acción, pasando
		el número por parámetro, devolverá el número de cifras.
	 */
	
	public static void cifras() {
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));
		
		if(numero>0) {
			JOptionPane.showMessageDialog(null, "La cantidad de cifras del número "+numero+" es: "+numeroCifras(numero));
		}else {
			JOptionPane.showMessageDialog(null, "El número que ingreso no es correcto");
		}
		
	}
	
	
	public static int numeroCifras(int numero){
		//Para saber la cantidad de cifras de un número, basta con saber el log base 10 y luego sumar 1
		int respuesta=(int)(Math.log10(numero))+1;
		return respuesta;
	}
}
