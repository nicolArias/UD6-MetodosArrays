package actividades;

import javax.swing.JOptionPane;
/*NICOL DAYANA ARIAS LEBRO
 * 08/02/2021*/
public class Punto7 {

	public static void cambioMoneda(){
	/*7) Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra
		moneda, estas pueden ser a dolares, yenes o libras. El método tendrá como parámetros, la
		cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor,
		mostrara un mensaje indicando el cambio (void).
		
		El cambio de divisas son:

		0.86 libras es un 1 €
		1.28611 $ es un 1 €
		129.852 yenes es un 1 €
	*/
		
		double valor=Double.parseDouble(JOptionPane.showInputDialog("Cantidad euros:"));
		String moneda=JOptionPane.showInputDialog("Moneda que desea convertir (dolares/yenes/libras:");
		
		conversionMoneda(valor,moneda);
		
	}
	
	public static void conversionMoneda(double valor, String moneda) {
		double operacion;
		switch(moneda) {
		case("dolares"):
			operacion=(valor*1.28611);
			JOptionPane.showMessageDialog(null, "El cambio del "+valor+" euros a "+moneda+" es: "+operacion );
			break;
		case("yenes"):
			operacion=(valor*129.852);
			JOptionPane.showMessageDialog(null, "El cambio del "+valor+" euros a "+moneda+" es: "+operacion );
			break;
		case("libras"):
			operacion=(valor*0.86);
			JOptionPane.showMessageDialog(null, "El cambio del "+valor+" euros a "+moneda+" es: "+operacion );
			break;
		default:
			JOptionPane.showMessageDialog(null, "La moneda que ingreso no corresponde a ninguna de las opciones");
			break;
		
		}
	}
	
}
