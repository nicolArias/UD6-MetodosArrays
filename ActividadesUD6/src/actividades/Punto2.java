package actividades;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto2 {
	/*2) Crea una aplicación que nos genere una cantidad de números enteros aleatorios que
		nosotros le pasaremos por teclado. Crea un método donde pasamos como parámetros entre
		que números queremos que los genere, podemos pedirlas por teclado antes de generar los
		números. Este método devolverá un número entero aleatorio. Muestra estos números por
		pantalla.
	*/
	public static void numAleatorios() {
		int cantidadNum=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de número aleatorios que quiere generar:"));
		int numMin=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número mínimo para el rango:"));
		int numMax=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número máximo para el rango: "));
		
		int[] arrayEnteros=new int[cantidadNum];
		String cadenaNumeros="";
		
		
		for(int i=0;i<arrayEnteros.length;i++) {
			arrayEnteros[i]=numAleatorio(numMin,numMax);
			//System.out.println(arrayEnteros[i]);
			cadenaNumeros+=arrayEnteros[i]+"\n";//En una variable tipo String se van a concatenar los números para después imprimirlos en una ventana emergente.
	
		}
		
		JOptionPane.showMessageDialog(null, "Números enteros aleatorios: \n"+cadenaNumeros);
		
		
	}
	
	public static int numAleatorio(int numMin,int numMax) {
		
		int numAleatorio=ThreadLocalRandom.current().nextInt(numMin,numMax+1);//Use la clase de Random con el metodo nextInt
		
		return numAleatorio;
	}
	

}
