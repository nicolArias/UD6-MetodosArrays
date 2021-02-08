package actividades;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto2 {
	/*2) Crea una aplicaci�n que nos genere una cantidad de n�meros enteros aleatorios que
		nosotros le pasaremos por teclado. Crea un m�todo donde pasamos como par�metros entre
		que n�meros queremos que los genere, podemos pedirlas por teclado antes de generar los
		n�meros. Este m�todo devolver� un n�mero entero aleatorio. Muestra estos n�meros por
		pantalla.
	*/
	public static void numAleatorios() {
		int cantidadNum=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de n�mero aleatorios que quiere generar:"));
		int numMin=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero m�nimo para el rango:"));
		int numMax=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero m�ximo para el rango: "));
		
		int[] arrayEnteros=new int[cantidadNum];
		String cadenaNumeros="";
		
		
		for(int i=0;i<arrayEnteros.length;i++) {
			arrayEnteros[i]=numAleatorio(numMin,numMax);
			//System.out.println(arrayEnteros[i]);
			cadenaNumeros+=arrayEnteros[i]+"\n";//En una variable tipo String se van a concatenar los n�meros para despu�s imprimirlos en una ventana emergente.
	
		}
		
		JOptionPane.showMessageDialog(null, "N�meros enteros aleatorios: \n"+cadenaNumeros);
		
		
	}
	
	public static int numAleatorio(int numMin,int numMax) {
		
		int numAleatorio=ThreadLocalRandom.current().nextInt(numMin,numMax+1);//Use la clase de Random con el metodo nextInt
		
		return numAleatorio;
	}
	

}
