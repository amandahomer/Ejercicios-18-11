/**Este programa muetra la asignatura que toca segun el dia introducido.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce un dia de la semana: ");
		String dia = s.nextLine();
		
		String asignatura;
		switch (dia) {
			
			case "Lunes":
			case "Miercoles":
			asignatura = "Sistemas informaticos";
			break;
			
			case "Martes":
			case "Jueves":
			case "Viernes":
			asignatura = "Programacion";
			break;
			
			default:
			asignatura = "No hay clase";
		}
		
		if (asignatura == "No hay clase") {
		System.out.println(asignatura);
		} else {
		System.out.println("El "+ dia +" hay "+ asignatura);
		}
	}
}
