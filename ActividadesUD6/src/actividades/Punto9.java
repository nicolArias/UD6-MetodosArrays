package actividades;

import java.util.Random;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto9 {
	
	public static void punto9() {
		/*9) Crea un array de números donde le indicamos por teclado el tamaño del array,
		rellenaremos el array con números aleatorios entre 0 y 9. Al final muestra por pantalla el
		valor de cada posición y la suma de todos los valores.
		Tareas a realizar: Haz un método para rellenar el array(que tenga como parámetros los
		números entre los que tenga que generar) y otro para mostrar el contenido y la suma del
		array.
	 */
		int tamaño=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo:"));
		int min=1;
		int max=9;
		rellenarArray(tamaño,min,max);
		

	}
	
	
	public static void rellenarArray(int tamaño,int min,int max) {
		Random random=new Random();
		//int numRandom;
		int[] numeros=new int[tamaño];
		
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
			cadena+="Posición "+j+" :"+numeros[j]+"\n";
		}
		JOptionPane.showMessageDialog(null, cadena);
		JOptionPane.showMessageDialog(null, "La suma del arreglo es: "+suma);
		
	}
}
