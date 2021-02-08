package actividades;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto3 {
	
	/*3) Crea una aplicaci�n que nos pida un n�mero por teclado y con un m�todo se lo pasamos
		por par�metro para que nos indique si es o no un n�mero primo, debe devolver true si es
		primo sino false.
		Un n�mero primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
		primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
	 */
	public static void numeroPrimo() {
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero entero:"));//Solicitamos el n�mero por teclado
		
		if(numero==0 || numero==1) {//Con esta condici�n v�lido que si el n�mero que ingresa es 0 o 1 muestre un mensaje indicando que no es primo ni compuesto
			JOptionPane.showMessageDialog(null, "El n�mero ingresado no es primo ni compuesto");
		}else {
			boolean esP=esPrimo(numero);//En esta variable se almacenara la respuesta que nos llegue del metodo 'esPrimo'
			
			if(esP==true) {
				JOptionPane.showMessageDialog(null,"El n�mero "+numero+" es un n�mero primo");
			}else if(esP==false) {
				JOptionPane.showMessageDialog(null,"El n�mero "+numero+" no es un n�mero primo");
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
