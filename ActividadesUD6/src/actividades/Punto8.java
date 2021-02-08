package actividades;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto8 {
	
	public static void arreglo10(){
		/*8) Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
			consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y
			otro para mostrar.
		 */
		rellenar();
	
	}
	
	public static void rellenar() {
		double numero;
		double[] numeros=new double[10];
		
		for(int i=0;i<numeros.length;i++) {
			
			numero=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número"));
	
			numeros[i]=numero;
		}
		mostrar(numeros);	
	}
	
	public static void mostrar(double numeros[]) {
		
		for(int j=0;j<numeros.length;j++) {
			System.out.println("Indice: "+j+"\nValor: "+numeros[j]+"\n");
		}
		
	}

}
