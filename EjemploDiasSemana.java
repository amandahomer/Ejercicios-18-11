/**Este programa muestra los dias de la semana segun el numero que
*se introduzca.
*AmandaNR*/

import java.util.Scanner;

public class EjemploDiasSemana {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("Introduzca un numero del 1 al 7: ");
		int dia = s.nextInt();
		
		String nombreDiaSemana;
		switch (dia) {
			
			case 1: 
			nombreDiaSemana = "Lunes";
			break;
			
			case 2: 
			nombreDiaSemana = "Martes";
			break;
			
			case 3: 
			nombreDiaSemana = "Miercoles";
			break;
			
			case 4: 
			nombreDiaSemana = "Jueves";
			break;
			
			case 5: 
			nombreDiaSemana = "Viernes";
			break;
			
			case 6: 
			nombreDiaSemana = "Sabado";
			break;
			
			case 7: 
			nombreDiaSemana = "Domingo";
			break;
			
			default:
			nombreDiaSemana = "No existe ese dia de la semana.";
		}
				
		System.out.println("Dia "+ dia +": "+ nombreDiaSemana +".");
		
	}
}
