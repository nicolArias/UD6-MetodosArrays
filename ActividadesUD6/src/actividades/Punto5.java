package actividades;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto5 {
	
	public static void conversion() {
		/*5) Crea una aplicaci�n que nos convierta un n�mero en base decimal a binario. Esto lo
		realizara un m�todo al que le pasaremos el numero como par�metro, devolver� un String
		con el numero convertido a binario. Para convertir un numero decimal a binario, debemos
		dividir entre 2 el numero y el resultado de esa divisi�n se divide entre 2 de nuevo hasta que
		no se pueda dividir mas, el resto que obtengamos de cada divisi�n formara el numero
		binario, de abajo a arriba.*/
		
		int numeroBase10=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero: "));
		conversionBinario(numeroBase10);
		
	}
	
	public static void conversionBinario(int numero) {
		
		
		int cociente=numero;
		int resto;
		int cont=1;
		
		int[] binarios;
		String numeroBinario="";
		int aux=0;
		
		for(int i=0;i<=cont;i++) {
			cociente=cociente/2;
			
			binarios=new int[cont];
			
			if(cociente!=0) {
				resto=numero-(2*cociente);
				binarios[i]=resto;
				System.out.println("posicion "+i+" :"+binarios[i]);
				numero=cociente;
				cont++;
			}
			if(cociente==1) {
					binarios[i]=cociente;
					System.out.println("Arreglo posicion "+i+" : "+binarios[i]);
				
			}
			
			
			numeroBinario+=binarios[i]+"-";
			System.out.println("Binario"+numeroBinario);
			
			
		}
		
		
		
			
			
	}
		
		
}

