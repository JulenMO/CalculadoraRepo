package EntornosDeDesarrolloVideo.CalculadoraED;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner leer = new Scanner(System.in);
		String respuestaOperacion = "", respuestaNum = "";
		int num1, num2;
		System.out.print("¿Suma, resta, multiplicacion o division(s/r/m/d)?: ");
		respuestaOperacion = leer.nextLine().toLowerCase();
		System.out.print("Primer numero de la operacion: ");
		respuestaNum = leer.nextLine();
		num1 = Integer.parseInt(respuestaNum);
		System.out.print("Segundo numero de la operacion: ");
		respuestaNum = leer.nextLine();
		num2 = Integer.parseInt(respuestaNum);
		switch (respuestaOperacion) {
		case "s":
			System.out.println("La suma entre " + num1 + " y " + num2 + " es " + (num1 + num2));
			break;
		case "r":
			System.out.println("La resta de " + num1 + " menos " + num2 + " es " + (num1 - num2));
			break;
		case "m":
			System.out.println("La multiplicacion entre " + num1 + " y " + num2 + " es " + (num1 * num2));
			break;
		case "d":
			System.out.println("La division de " + num1 + " entre " + num2 + " es " + (num1 / num2));
			break;
		default:
			System.out.println("Algo salio mal en los datos introducidos");
		}
		leer.close();
    }
}
