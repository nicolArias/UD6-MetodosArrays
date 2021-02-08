package actividades;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/


public class Punto10 {
	
	
	/*10) Crea un array de números de un tamaño pasado por teclado, el array contendrá
		números aleatorios primos entre los números deseados, por último nos indicara cual es el
		mayor de todos.
		Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo
		métodos que necesites.
	*/
	public static void arrayPrimos() {
		
		int tamaño=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño del arreglo:"));
		int numMin=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número minimo para el rango: "));
		int numMax=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número máximo para el rango: "));
		crearArray(tamaño,numMin,numMax);
		
	}
	
	public static void crearArray(int numero,int numMin,int numMax) {//En este método creamos el arreglo y va a recibir el tamaño del array y el rango
		
		int[] arrayPrimos=new int[numero];
		int num;
		int cont=0;
	
		
		for(int i=0;i<arrayPrimos.length;i++) {
			
			while(cont<=i) {
				num=ThreadLocalRandom.current().nextInt(numMin, numMax+1);//Usamos la clase ThreadLocalRandom para generar el número random, vamos pasar
				//el rango como parametro(numMin y numMax)
				if(num!=0 && num!=1 && esPrimo(num)==true) {
					arrayPrimos[i]=num;
					//System.out.println("Es primo"+arrayPrimos[i]);
					cont++;
				}
				
			}
			
		}
		
		imprimirArray(arrayPrimos);
	}
	
	public static void imprimirArray(int arrayPrimos[]) {
		
		String cadena="";
		int numTemp=0;
		
		for(int j=0;j<arrayPrimos.length;j++) {
			cadena+=arrayPrimos[j]+"\n";
			
			if(arrayPrimos[j]>=numTemp) {
				numTemp=arrayPrimos[j];
			}
			
		}
		JOptionPane.showMessageDialog(null, "Números primos del arreglo: \n"+cadena+"\n El número mayor es: "+numTemp);
		
		System.out.println("Num mayor "+numTemp);
		
	}
	
	
	public static boolean esPrimo(int num) {//En este metodo voy a validar que el número aleatorio que nos dio el random es primo


		boolean respuesta=true;
				
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				respuesta=false;
			}
		}
		
		if(respuesta) {
			respuesta=true;
		}
		return respuesta;
	}
	
	
}
