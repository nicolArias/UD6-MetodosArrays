package actividades;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto12 {
	/*12) Crea un array de n�meros de un tama�o pasado por teclado, el array contendr�
		n�meros aleatorios entre 1 y 300 y mostrar� aquellos n�meros que acaben en un d�gito que
		nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto),
		estos deben guardarse en un nuevo array.
		Por ejemplo, en un array de 10 posiciones le indicamos mostrar los n�meros acabados en 5,
		podr�a salir 155, 25, etc.*/
	
	public static void punto12() {
		
		
		int dimension=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tama�o del array:"));
		int ultimoDigito=Integer.parseInt(JOptionPane.showInputDialog("Indique el �ltimo digito que quiere para los n�meros:"));
		

		if(ultimoDigito>=0 && ultimoDigito<=9) {
			nuevoArray(crearArreglo(dimension),ultimoDigito);
		}else {
			JOptionPane.showMessageDialog(null, "El n�mero que ingreso no es correcto");
		}
	}
	
	public static int[] crearArreglo(int tama�o) {
		int[] arreglo=new int[tama�o];
		
		for(int i=0;i<arreglo.length;i++) {
			arreglo[i]=ThreadLocalRandom.current().nextInt(1-1,300+1);
			System.out.println("Arreglo: "+arreglo[i]);
		}
		
		return arreglo;
	}
	
	//Este m�todo va a crear el arreglo de n�meros terminados en el digito que indicamos
	public static void nuevoArray(int[] arreglo,int ultimoDigito) {
		//Variables
		int ultimoD=0;
		String cadena="";
		String numerosArreglo="";
		String[] ultimosDigitos;
		String cadena2="";
		
		//Este ciclo correra el arreglo que creamos primero para validar si el ultimo digito coincide con el que pasamos por teclado
		for(int j=0;j<arreglo.length;j++) {
			
			//En esta variable se almacenara el ultimo digito del numero que se encuentre en dicha posicion del arreglo
			ultimoD=arreglo[j]%10;
			
			System.out.println("Ultimo digito"+ultimoDigito);
			System.out.println("digito: "+ultimoDigito);
			
			//En esta variables se concatenan los numeros del arreglo para luego mostrarlos en pantalla
			numerosArreglo+=arreglo[j]+" | ";
			
			//Esta condicion har� una validacion donde concatenara los n�meros que terminen en el digito que se indico
			if(ultimoD==ultimoDigito) {
				
				cadena+=(arreglo[j])+"-";
				
				System.out.println("Nuevo arreglo"+cadena);
			}
		}
		 
		
		//En este arreglo se guardaran todos los n�meros terminados en el digito que indicamos
		ultimosDigitos=cadena.split("-");
		
		for(int x=0;x<ultimosDigitos.length;x++) {
			cadena2+=ultimosDigitos[x]+" | ";
			if(cadena2=="") {
				cadena2="No hay ningun numero que coincida";
			}
		}
		
		JOptionPane.showMessageDialog(null, "Arreglo: "+numerosArreglo+"\nArreglo de n�meros terminados en "+ultimoDigito+" : "+cadena2);
		
		
		
	}
}
