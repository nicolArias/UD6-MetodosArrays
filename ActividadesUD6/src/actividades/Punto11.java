package actividades;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto11 {
	/*11) Crea dos arrays de números con la dimensión pasada por teclado.
		Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior,
		reasigna los valores del segundo array con valores aleatorios.
		Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo
		con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente.
		Por último, muestra el contenido de cada array.
	*/
	
	public static void punto11() {
		int dimension=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimensión del arreglo:"));
		
		//VARIABLES
		int[] primerArray=new int[dimension];
		int[] copiaPrimerArray=new  int[dimension];
		int[] segundoArray=new int[dimension];
		
		String primerCadena=""; 
		String segundaCadena="";
		String tercerCadena="";
		String cuartaCadena="";
		
		
		
		//Ciclo donde se llenara el primer arreglo con números aleatorios
		for(int i=0;i<primerArray.length;i++) {
			int numAleatorio=ThreadLocalRandom.current().nextInt(1,1000);
			primerArray[i]=numAleatorio;
			System.out.println("Primer array"+primerArray[i]);
		}
		
		//Reasignación de variables
		copiaPrimerArray=copiaArreglo(primerArray);
		segundoArray=reasignarValores(copiaArreglo(primerArray));
		
		//Ciclo que recorrerÁ los 3 arreglos para mostrarlos en pantalla
		for(int x=0;x<dimension;x++) {
			primerCadena+=primerArray[x]+"\n";//En esta variable tipo String se concatenan los números de cada posicion, para luego poder mostrarlos en pantalla
			segundaCadena+=copiaPrimerArray[x]+"\n";
			tercerCadena+=reasignarValores(segundoArray)[x]+"\n";
			cuartaCadena+=multiplicacion(primerArray,segundoArray)[x]+"\n";
		}
		
		JOptionPane.showMessageDialog(null,"Primer arreglo: \n"+primerCadena
				+"Segundo arreglo (igual al primero): \n"+segundaCadena
				+"Segundo array nuevos valores: \n"+tercerCadena
				+"Resultado multiplicación: \n"+cuartaCadena);
		
	}
	
	
	//Este metodo recibira el primer arreglo con numeros aleatorios y devolvera otro arreglo "copia"
	public static int[] copiaArreglo(int[] arreglo){
		
		int[] segundoArray=new int[arreglo.length];
		
		for(int j=0;j<arreglo.length;j++) {
			segundoArray[j]=arreglo[j];
			System.out.println("Segundo arreglo copia: "+segundoArray[j]);
		}
		
		return segundoArray;
	}
	
	//Reasignar valores del segundo array
	public static int[] reasignarValores(int[] segundoArray){
		
		for(int x=0;x<segundoArray.length;x++) {
			segundoArray[x]=ThreadLocalRandom.current().nextInt(1,1000);
			System.out.println("Segundo arreglo reasignado: "+segundoArray[x]);
		}
		
		return segundoArray;
	}
	
	
	//Este metodo realizara la multiplicacion del arreglo 1 y 2 respecto a la posicion de cada uno y devolvera el nuevo arreglo con los resultados de dicha operacion
	public static int[] multiplicacion(int[] arrayPrimero,int[] arraySegundo) {
		
		int[] resultMult=new int[arrayPrimero.length];
		
		for(int j=0;j<arrayPrimero.length;j++) {
			resultMult[j]=(arrayPrimero[j]*arraySegundo[j]);
			System.out.println(arraySegundo[j]);
		}
		
		System.out.println("Multiplicacion Arrays: "+resultMult[0]);
		return resultMult;
	}
	

}
