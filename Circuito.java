/**Este programa es un circuito que informa de las localidades y las cuidades
*por las que pasas si vas de Malaga a Valencia.
*AmandaNR*/

import java.util.Scanner;

public class Circuito {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce una localidad por pantalla: ");
		String localidad = s.nextLine();
		
		String c1 = "Málaga";
		String c2 = "Granada";
		String c3 = "Murcia";
		String c4 = "Valencia";
		
		String l1 = "Casabermeja";
		String l2 = "Villanueva del Trabuco";
		String l3 = "Loja";
		String l4 = "Guadix";
		String l5 = "Baza";
		String l6 = "Librilla";
		String l7 = "Elche";
		String l8 = "Villena";
		String l9 = "Masalavés";
		
		String resultado;
		switch (localidad) {
			
			case "casabermeja":
			System.out.println("Estas en "+ c1 +", para llegar a Valencia tienes");
			System.out.println("que pasar por las ciudades "+ c2 +" y "+ c3);
			System.out.println("y por las localidades "+ l2 +", "+ l3 +", "+ l4 +", "+ l5 +", "+ l6 +", "+ l7 +", "+ l8 +" y "+ l9 +".");
			break;
			
			case "villanueva del trabuco":
			System.out.println("Estas en "+ c1 +", para llegar a Valencia tienes");
			System.out.println("que pasar por las ciudades "+ c2 +" y "+ c3);
			System.out.println("y por las localidades "+ l3 +", "+ l4 +", "+ l5 +", "+ l6 +", "+ l7 +", "+ l8 +" y "+ l9 +".");			
			break;
			
			case "loja":
			System.out.println("Estas en "+ c1 +", para llegar a Valencia tienes");
			System.out.println("que pasar por las ciudades "+ c2 +" y "+ c3);
			System.out.println("y por las localidades "+ l4 +", "+ l5 +", "+ l6 +", "+ l7 +", "+ l8 +" y "+ l9 +".");
			break;
			
			case "guadix":
			System.out.println("Estas en "+ c2 +", para llegar a Valencia tienes");
			System.out.println("que pasar por la ciudad de "+ c3);
			System.out.println("y por las localidades "+ l5 +", "+ l6 +", "+ l7 +", "+ l8 +" y "+ l9 +".");
			break;
			
			case "baza":
			System.out.println("Estas en "+ c2 +", para llegar a Valencia tienes");
			System.out.println("que pasar por las ciudad de "+ c3);
			System.out.println("y por las localidades "+ l6 +", "+ l7 +", "+ l8 +" y "+ l9 +".");
			break;
			
			case "librilla":
			System.out.println("Estas en "+ c2 +", para llegar a Valencia tienes");
			System.out.println("que pasar por las ciudad de "+ c3);
			System.out.println("y por las localidades "+ l7 +", "+ l8 +" y "+ l9 +".");
			break;
			
			case "elche":
			System.out.println("Estas en "+ c3 +", para llegar a Valencia tienes");
			System.out.println("que pasar por las localidades "+ l8 +" y "+ l9 +".");
			break;
			
			case "villena":
			System.out.println("Estas en "+ c3 +", para llegar a Valencia tienes");
			System.out.println("que pasar por la localidad "+ l9 +".");
			break;
			
			case "masalaves":
			System.out.println("Estas en "+ c3 +", ya estás muy cerca de "+ c4 +".");
			break;
			
			default:
			System.out.print("No es una localidad válida.");
		}
	}
}
