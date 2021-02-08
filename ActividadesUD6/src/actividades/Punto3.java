package actividades;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto3 {
	
	/*3) Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos
		por parámetro para que nos indique si es o no un número primo, debe devolver true si es
		primo sino false.
		Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
		primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
	 */
	public static void numeroPrimo() {
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero:"));//Solicitamos el número por teclado
		
		if(numero==0 || numero==1) {//Con esta condición válido que si el número que ingresa es 0 o 1 muestre un mensaje indicando que no es primo ni compuesto
			JOptionPane.showMessageDialog(null, "El número ingresado no es primo ni compuesto");
		}else {
			boolean esP=esPrimo(numero);//En esta variable se almacenara la respuesta que nos llegue del metodo 'esPrimo'
			
			if(esP==true) {
				JOptionPane.showMessageDialog(null,"El número "+numero+" es un número primo");
			}else if(esP==false) {
				JOptionPane.showMessageDialog(null,"El número "+numero+" no es un número primo");
			}
			
			
		}
		
	}
	
	public static boolean esPrimo(int numeroP) {
		int cont=0;
		boolean respuesta;
		
		
			for(int i=1;i<=numeroP;i++) {
				if(numeroP%i==0) {
					cont++;
				}
			}
		
		
		if(cont==2) {
			respuesta=true;
		}else {
			respuesta=false;
		}
		
		return respuesta;
		
	}
	
	

}
