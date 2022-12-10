package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringMenu {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		/*
		 * 1. Hacer un menú que permita al usuario conocer el uso de 10 métodos de la
		 * clase String. El programa debe dar la opción 11 para poder salir del mismo.
		 */

		boolean salir = false;
		Scanner scm = new Scanner(System.in);

		do {

			System.out.println("Escoja un numero del 1 al 7 para conocer los diferentes ejercicios de la clase String."
					+ "\n1: Menú de los diferentes métodos de la clase String"
					+ "\n2: Menú sobre 5 métodos de la clase StringBuilder"
					+ "\n3: Menú del 1º ejercicio, pero con datos introducidos por el usuario"
					+ "\n4: Comprobar si la palabra introducida es un palíndromo"
					+ "\n5: Conversor de minúsculas a mayúsculas" + "\n6: Extraer varios caracteres de una frase"
					+ "\n7: Programa que ordena por orden alfabético varias palabras" + "\n8: Salir del menú");

			int opcion;
			opcion = scm.nextInt();

			switch (opcion) {
			case 1:
				Ejer1(args);
				break;
			case 2:
				Ejer2(args);
				break;
			case 3:
				Ejer3(args);
				break;
			case 4:
				Ejer4(args);
				break;
			case 5:
				Ejer5(args);
				break;
			case 6:
				Ejer6(args);
				break;
			case 7:
				Ejer7(args);
				break;
			case 8:
				System.out.println("Ha escogido salir del menú principal, Adiós.");
				salir = true;
				break;

			default:
				System.out.println("El número introducido no es válido, deben ser del 1 al 11.");
			}
		} while (salir != true);
		scm.close();
	}

	public static void Ejer1(String[] args) {
		// TODO Auto-generated method stub
		int opcion1 = 0;
		boolean sal = false;
		Scanner sc1 = new Scanner(System.in);

		do {

			System.out.println(
					"Escoja un numero del 1 al 10 para conocer los diferentes métodos de la clase String. Pulse 11 para salir:"
							+ "\n1. Método length()" + "\n2. Método indexOf('char')" + "\n3. Método lastindexOf('char')"
							+ "\n4. Método charAt(n)" + "\n5. Método substring(n1,n2)" + "\n6. Método toUpperCase()"
							+ "\n7. Método toLowerCase(cad)" + "\n8. Método equalsIgnoreCase(cad)"
							+ "\n9. Método compareTo(OtroString)" + "\n10. Método valueOf(N)" + "\n11. Salir");

			opcion1 = sc1.nextInt();
			String st1 = "Ejemplo";
			String st2 = "Papeleria Amiga azul ajAm";

			switch (opcion1) {
			case 1:
				System.out.println(
						"El método length(), nos permite conocer la longitud de la cadena introducida. Veamos un ejemplo:"
								+ "\nDeclaramos la String o usamos alguna ya creada, en este caso st1 con la palabra: Ejemplo"
								+ "\nLa longitud de st1 es de: " + st1.length() + " caracteres.");
				break;

			case 2:
				System.out.println(
						"El método indexOf('char'), nos permite obtener la ubicación, el índice de la primera aparición del caracter introducido."
								+ "\nVeamos un ejemplo:"
								+ "\nPrimera posición de una palabra que contiene el char 'a' en st2 es: "
								+ st2.indexOf('a'));
				break;

			case 3:

				System.out.println(
						"El método lastindexOf('char'), nos permite obtener la ubicación, el índice de la última aparición del caracter introducido."
								+ "\nVeamos un ejemplo:"
								+ "\nÚltima posición de una palabra que contiene el char 'a' en st2 es: "
								+ st2.lastIndexOf('a'));
				break;

			case 4:
				System.out.println(
						"El método charAt(n), nos permite obtener el caracter en el índice definido entre paréntesis"
								+ "\nVeamos un ejemplo:" + "\nEl 12vo caracter en el string st2 es: " + st2.charAt(12));
				break;

			case 5:
				System.out.println(
						"El método substring(n1,n2), nos permite obtener los caracteres que se encuentran desde n2(fin) hasta n1(comienzo)"
								+ "\nCaracteres entre el índice 2-13: " + st2.substring(2, 13));
				break;

			case 6:
				System.out.println(
						"El método toUpperCase() nos permite convertir a mayúsculas los caracteres que hayamos introducido en el string"
								+ "\nString2 convertido a mayus: " + st2.toUpperCase());
				break;

			case 7:
				System.out.println(
						"El método toUpperCase() nos permite convertir a minúsculas los caracteres que hayamos introducido en el string"
								+ "\nString2 convertido a minus: " + st2.toLowerCase());
				break;

			case 8:

				System.out.println(
						"El método equalsIgnoreCase(cad), nos permite comparar entre cadenas, si son iguales o distintas, ignorando las mayúsculas"
								+ "\nVeamos un ejemplo:");
				System.out.println("String 1: " + st1);
				System.out.println("String 2:" + st2);
				if (st1.equalsIgnoreCase(st2)) {
					System.out.println("Las cadenas st1 y st2 son iguales");
				} else {
					System.out.println("Las cadenas st1 y st2 son diferentes");
				}

				break;

			case 9:
				System.out.println(
						"El método compareTo(OtroString), nos permite comparar alfabéticamente los caracteres de los strings"
								+ "\nVeamos un ejemplo: " + "\nComparamos String1 con String2: " + st1.compareTo(st2)
								+ "\nComo vemos, nos devuelve un -11, esto indica que st1 (que comienza por E) está 11 posiciones antes que st2 (comienza por P) sin contar la ñ");
				break;

			case 10:
				char arr1[] = { 'E', 'S', 'O' };
				System.out.println(
						"El método valueOf(N), nos permite devolver el valor primitivo de un objeto String como un tipo de dato cadena. Este valor es equivalente a String.toString"
								+ "\nVeamos un ejemplo: " + "\nArray1 convertido a String: " + st2.valueOf(arr1));
				break;

			case 11:
				System.out.println("Ha escogido salir del menú del Ejercicio 1");
				sal = true;
				break;

			default:
				System.out.println("El número introducido no es válido, deben ser del 1 al 11.");
				break;
			}
		} while (sal != true);
		return;
	}

	public static void Ejer2(String[] args) {
		int opcion2 = 0;
		boolean salga = false;
		Scanner sc2 = new Scanner(System.in);

		do {
			System.out.println(
					"Escoja un numero del 1 al 5 para conocer los diferentes métodos de la clase String. Pulse 6 para salir:"
							+ "\n1. Método length()" + "\n2. Método capacity()" + "\n3. Método append()"
							+ "\n4. Método setCharAt(n)" + "\n5. Método reverse()" + "\n6. Salir");

			opcion2 = sc2.nextInt();
			StringBuilder st3 = new StringBuilder("Hola mi gente de yutu");

			switch (opcion2) {
			case 1:
				System.out.println("El método length, devuelve el número de caracteres que se encuentran en el String"
						+ "\nNumero de caracteres en el String3 son: " + st3.length());
				break;

			case 2:
				System.out
						.println("El método capacity(), devuelve el número de caracteres que se almacenar en el String"
								+ "\nNumero de capacidad del String3 es: " + st3.capacity()
								+ "\nAl total de caracteres en st3(21) se le suma el predeterminado del método capacity(16) y nos da 37");
				break;

			case 3:
				String s1 = "Que";
				String s2 = "ES";
				int numero = 105;

				System.out.println(
						"El método append(), nos sirve para operar con diferentes variables en el String, comentadas al final de este"
								+ "\nVeamos un ejemplo: " + "\nLa suma de las variables son: "
								+ new StringBuilder().append(s1).append(s2).append(numero));
				break;

			case 4:
				System.out.println(
						"El método setCharAt(n), recibe un entero y un carácter como parámetros y asigna el carácter en la posición especificada"
								+ "\n");
				break;

			case 5:
				System.out
						.println("El método reverse(), como su nombre indica, invierte el contenido del objeto indicado"
								+ "\nString dado la vuelta: " + st3.reverse());
				break;

			case 6:
				System.out.println("Ha decidido salir del menú del Ejercicio 2");
				break;

			default:
				System.out.println("Debe introducir un numero del 1 al 6.");
			}
		} while (salga != true);
		return;
	}

	public static void Ejer3(String[] args) throws NumberFormatException, IOException {

		boolean salir = false;
		do {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			StringBuilder sb = new StringBuilder(
					"Escoja un numero del 1 al 7 para conocer los diferentes ejercicios de la clase String."
							+ "\n1: Menú de los diferentes métodos de la clase String"
							+ "\n2: Menú sobre 5 métodos de la clase StringBuilder"
							+ "\n3: Menú del 1º ejercicio, pero con datos introducidos por el usuario"
							+ "\n4: Comprobar si la palabra introducida es un palíndromo"
							+ "\n5: Conversor de minúsculas a mayúsculas"
							+ "\n6: Extraer varios caracteres de una frase"
							+ "\n7: Programa que ordena por orden alfabético varias palabras" + "\n8: Salir del menú");
			System.out.println(sb);

			int opcion = Integer.parseInt(br.readLine());

			switch (opcion) {
			case 1:
				Ejer1(args);
				break;
			case 2:
				Ejer2(args);
				break;
			case 3:
				Ejer3(args);
				break;
			case 4:
				Ejer4(args);
				break;
			case 5:
				Ejer5(args);
				break;
			case 6:
				Ejer6(args);
				break;
			case 7:
				Ejer7(args);
				break;
			case 8:
				System.out.println("Ha escogido salir del menú del Ejercicio 3");
				salir = true;
				break;

			default:
				System.out.println("El número introducido no es válido, deben ser del 1 al 11.");
			}
		} while (salir != true);
		return;

	}

	public static void Ejer4(String[] args) {
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Introduzca una palabra para comprobar si es un palídromo o no.");
		String s4 = sc4.nextLine();

		s4 = s4.replace(" ", ""); // En caso de espacios en blanco, los quitamos de esta manera
		StringBuilder sb2 = new StringBuilder(s4);

		String invertir = sb2.reverse().toString(); // invertimos el contenido del StringBuilder

		if (s4.equalsIgnoreCase(invertir)) {
			System.out.println("Su palabra " + s4 + " es un palíndromo");
		} else {
			System.out.println("Su palabra " + s4 + " no es un palíndromo");
		}

	}

	public static void Ejer5(String[] args) {

		String oracion = "";
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Introduzca una palabra para convertirla a mayúsculas");
		oracion = sc5.nextLine();

		System.out.println("Su frase en mayúsculas es: " + oracion.toUpperCase());

	}

	public static void Ejer6(String[] args) {
		
		int numero = 0;
		String s6 = "HOLA MUNDO";
		String oracion = "";
		Scanner sc6 = new Scanner(System.in);
		
		System.out.println("Introduzca la frase");
		oracion = sc6.nextLine();
		
		System.out.println("Introduzca el numero de caracteres que desea obtener: ");
		numero = sc6.nextInt();
		
		System.out.println("Estos son los "+numero+ " primeros caracteres :"+oracion.substring(0, numero));

		System.out.println("\nExtraemos los 7 primeros caracteres del string: "+s6);
		System.out.println(s6.substring(0, 7));
		return;
	}

	public static void Ejer7(String[] args) {
		
		int contador;
        String aux = "";
        Scanner sc7 = new Scanner(System.in);
        
        System.out.print("Introduzca el numero de cadenas:");
        contador = sc7.nextInt();
        
        
        String s7[] = new String[contador];
        Scanner scan2 = new Scanner(System.in);
        
   
        System.out.println("Introduzca las cadenas:");
        for(int i = 0; i < contador; i++)
        {
            s7[i] = scan2.nextLine();
        }
        
        
        for (int i = 0; i < contador; i++) 
        {
            for (int j = i + 1; j < contador; j++) { 
                if (s7[i].compareTo(s7[j])>0) 
                {
                    aux = s7[i];
                    s7[i] = s7[j];
                    s7[j] = aux;
                }
            }
        }
        
        System.out.print("Ordenadas alfabéticamente serían: \n");
        for (int i = 0; i <= contador - 1; i++) 
        {
            System.out.println(s7[i]);
        }
        return;
    
	}

}
