/**Este programa muestra un menu para calcular las areas de los
*distintos poligonos.
*AmandaNR*/

import java.util.Scanner;

public class EjemploMenu {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println(" CÁLCULO DE ÁREAS: "); 
		System.out.println("-------------------");
		System.out.println("1. Triangulo");
		System.out.println("2. Rombo");
		System.out.println("3. Romboide");
		System.out.println("4. Trapecio");
		System.out.print("\n Elija una opcion (1- 4): ");
		int opcion = s.nextInt();
		
		double base;
		double base2;
		double altura;
		double diametro1;
		double diametro2;
		double total;
		
		switch (opcion) {
			
			case 1:
			System.out.println("1. Area de un triangulo:");
			System.out.print("Introduce la base y la altura separados por un espacio: ");
			base = s.nextDouble();
			altura = s.nextDouble();
			total = (base * altura) / 2;
			System.out.println("El area del triangulo es: "+ total);
			break;
			
			case 2:
			System.out.println("2. Area de un rombo:");
			System.out.print("Introduce el diametro mayor y el diametro menor separados por un espacio: ");
			diametro1 = s.nextDouble();
			diametro2 = s.nextDouble();
			total = (diametro1 * diametro2) / 2;
			System.out.println("El area del rombo es: "+ total);
			break;
			
			case 3:
			System.out.println("3. Area de un romboide:");
			System.out.print("Introduce la base y la altura separados por un espacio: ");
			base = s.nextDouble();
			altura = s.nextDouble();
			total = base * altura;
			System.out.println("El area del romboide es: "+ total);
			break;
			
			case 4:
			System.out.println("4. Area de un trapecio:");
			System.out.print("Introduce la  base mayor, la base menor y la altura separados por un espacio: ");
			base = s.nextDouble();
			base2 = s.nextDouble();
			altura = s.nextDouble();
			total = ((base + base2) * altura) / 2;
			System.out.println("El area del trapecio es: "+ total);
			break;
			
		}	
	}
}
