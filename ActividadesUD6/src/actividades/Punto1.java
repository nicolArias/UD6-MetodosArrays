package actividades;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto1 {
	public static void areaFigura() {
		/*1) Crea una aplicaci�n que nos calcule el �rea de un circulo, cuadrado o triangulo. Pediremos
			que figura queremos calcular su �rea y seg�n lo introducido pedir� los valores necesarios
			para calcular el �rea. Crea un m�todo por cada figura para calcular cada �rea, este devolver�
			un n�mero real. Muestra el resultado por pantalla.
			Aqu� te mostramos que necesita cada figura:

			Circulo: (radio^2)*PI
			Triangulo: (base * altura) / 2
			Cuadrado: lado * lado
		 */
		
		String figura=JOptionPane.showInputDialog("Introduce la figura (Circulo-Cuadrado-Triangulo): ");//Solicito el nombre de la figura
		double resultado=0;//en esta variable almacenar� el valor que me devuelve cada metodo
		
		switch(figura) {
		case("Circulo"):
			double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio:"));
			resultado=areaCirculo(radio);
			
			JOptionPane.showMessageDialog(null, resultado);
			break;
		case("Cuadrado"):
			double lado=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del lado:"));
			resultado=areaCuadrado(lado);
			JOptionPane.showMessageDialog(null, resultado);
			break;
		case("Triangulo"):
			double base=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la base:"));
			double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la altura"));
			resultado=areaTriangulo(base,altura);
			JOptionPane.showMessageDialog(null, resultado);
			break;
		}
	}
	
	//M�todos de operaciones para hallar el �rea de cada figura
	public static double areaCirculo(double radio) {
			double pi=3.1415;
			double areaC=(Math.pow(radio, 2))*pi;
		return areaC;
	}
	
	public static double areaTriangulo(double base, double altura) {
		double areaT=(base*altura)/2;
		return areaT;
	}
	
	public static double areaCuadrado(double lado) {
		double areaC=lado*lado;
		return areaC;
	}
}
