package actividades;

import javax.swing.JOptionPane;

public class ActividadesApp {

	public static void main(String[] args) {
		/*En la clase main tendré com una especie de menú donde podre pedir que ejercicio se quiere probar
		 * los ejercicios se encontraran divididos en clases para que exista un orden*/
		int numActividad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca # de la actividad:"));
		
		
	
		switch(numActividad) {//Dependiendo de la actividad que el usuario escriba, esta instruccion me permite tener acceso a las clases del proyecto.
		case(1):
			Punto1.areaFigura();//aqui me esta indicando que debe llamar la clase punto1 y usar el metodo areaFigura()
			break;
		case(2):
			Punto2.numAleatorios();
			break;
		
		case(3):
			Punto3.numeroPrimo();
			break;
		
		case(4):
			Punto4.factorial();
			
			break;
		
		case(5):
			Punto5.conversion();
			break;
		
		case(6):
			Punto6.cifras();
			break;
		
		case(7):
			Punto7.cambioMoneda();
			break;
		
		case(8):
			Punto8.arreglo10();
			break;
		
		case(9):
			Punto9.punto9();
			break;
		
		case(10):
			Punto10.arrayPrimos();
			break;
		
		case(11):
			Punto11.punto11();
			break;
		
		case(12):
			Punto12.punto12();
			break;
		
		default:
			JOptionPane.showMessageDialog(null, "El número ingresado no coincide con ninguna actividad");
			break;
		}
		

	}

}
