package actividades;

import java.util.Random;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto9 {
	
	public static void punto9() {
		/*9) Crea un array de n�meros donde le indicamos por teclado el tama�o del array,
		rellenaremos el array con n�meros aleatorios entre 0 y 9. Al final muestra por pantalla el
		valor de cada posici�n y la suma de todos los valores.
		Tareas a realizar: Haz un m�todo para rellenar el array(que tenga como par�metros los
		n�meros entre los que tenga que generar) y otro para mostrar el contenido y la suma del
		array.
	 */
		int tama�o=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tama�o del arreglo:"));
		int min=1;
		int max=9;
		rellenarArray(tama�o,min,max);
		

	}
	
	
	public static void rellenarArray(int tama�o,int min,int max) {
		Random random=new Random();
		//int numRandom;
		int[] numeros=new int[tama�o];
		
		for(int i=0;i<numeros.length;i++) {
			int numRandom=random.nextInt(max-min+1);
			numeros[i]=numRandom;
		}
		
		mostrarSumar(numeros);
		
	}
	
	public static void mostrarSumar(int numeros[]) {
		
		int suma=0;
		String cadena="";
		
		for(int j=0;j<numeros.length;j++) {
			suma+=numeros[j];
			cadena+="Posici�n "+j+" :"+numeros[j]+"\n";
		}
		JOptionPane.showMessageDialog(null, cadena);
		JOptionPane.showMessageDialog(null, "La suma del arreglo es: "+suma);
		
	}
}
