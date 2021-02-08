package actividades;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/


public class Punto10 {
	
	
	/*10) Crea un array de n�meros de un tama�o pasado por teclado, el array contendr�
		n�meros aleatorios primos entre los n�meros deseados, por �ltimo nos indicara cual es el
		mayor de todos.
		Haz un m�todo para comprobar que el n�mero aleatorio es primo, puedes hacer todos lo
		m�todos que necesites.
	*/
	public static void arrayPrimos() {
		
		int tama�o=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tama�o del arreglo:"));
		int numMin=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero minimo para el rango: "));
		int numMax=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero m�ximo para el rango: "));
		crearArray(tama�o,numMin,numMax);
		
	}
	
	public static void crearArray(int numero,int numMin,int numMax) {//En este m�todo creamos el arreglo y va a recibir el tama�o del array y el rango
		
		int[] arrayPrimos=new int[numero];
		int num;
		int cont=0;
	
		
		for(int i=0;i<arrayPrimos.length;i++) {
			
			while(cont<=i) {
				num=ThreadLocalRandom.current().nextInt(numMin, numMax+1);//Usamos la clase ThreadLocalRandom para generar el n�mero random, vamos pasar
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
		JOptionPane.showMessageDialog(null, "N�meros primos del arreglo: \n"+cadena+"\n El n�mero mayor es: "+numTemp);
		
		System.out.println("Num mayor "+numTemp);
		
	}
	
	
	public static boolean esPrimo(int num) {//En este metodo voy a validar que el n�mero aleatorio que nos dio el random es primo


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
