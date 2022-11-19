/**Este programa muestra las estaciones del año segun el
*mes introducido.
*AmandaNR*/

import java.util.Scanner;

public class EjemploEstaciones {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un mes del año, en numeros: ");
		int mes = s.nextInt();
		
		String mesAño;
		switch (mes) {
			
			case 12:
			mesAño = "Diciembre";
			case 1:
			mesAño = "Enero";
			case 2:
			mesAño = "Febrero";
				System.out.println("Es invierno");
			break;
			
			case 3:
			mesAño = "Marzo";
			case 4:
			mesAño = "Abril";
			case 5:
			mesAño = "Mayo";
				System.out.println("Es primavera");
			break;
			
			case 6:
			mesAño = "Junio";
			case 7:
			mesAño = "Julio";
			case 8:
			mesAño = "Agosto";
				System.out.println("Es verano");
			break;
			
			case 9:
			mesAño = "Septiembre";
			case 10:
			mesAño = "Octubre";
			case 11:
			mesAño = "Noviembre";
				System.out.println("Es otoño");
			
			default:
			mesAño = "No existe ese mes.";
		}
		
	}
}
