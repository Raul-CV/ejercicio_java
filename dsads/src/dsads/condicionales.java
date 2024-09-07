package dsads;

import java.util.Scanner;

public class condicionales {

	public static void main(String[] args) {
		Scanner operador = new Scanner(System.in);
		
		/*
		int num1, num2, num3;
		
		
		System.out.println("ingresa el primer numero");
		num1 = operador.nextInt();
		
		System.out.println("ingresa el primer numero");
		num2 = operador.nextInt();
		
		System.out.println("ingresa el primer numero");
		num3 = operador.nextInt();
		
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " " + num3 + " " + num1);
		} else if (num3 > num2 && num3 > num1) {
			System.out.println(num3 + " " + num2 + " " + num1);
		} else {
			
		}
		*/
		
		/*
		int numero;
		System.out.println("ingresa un numero y te dire cuanta cifras tiene");
		numero = operador.nextInt();
		String cifras = Integer.toString(numero);
		
		if (numero >= 0 && numero <= 99999) {
			System.out.println("tu numero tiene una cifra de :" + cifras.length());
		} else {
			System.out.println("lo siento, el limite es de 0 hasta 99999");
		}
		*/
		
		/*
		int dias, mes, year;
		
		System.out.println("ingresa el dia");
		dias = operador.nextInt();
		
		System.out.println("ingresa el mes");
		mes = operador.nextInt();
		
		System.out.println("ingresa el año");
		year = operador.nextInt();
		
		
		if (dias <= 30 && (mes <=12 && mes > 0) && year != 0) {
			System.out.println("la fecha es correcta en digitar :" + dias + "/" + mes + "/" + year);
		} else {
			System.out.println("la fecha es incorrecta");
		}
		*/
		
		// Ejercicio 11
		
		int num1, num2, resultado;
		String calculadora;
		
		System.out.println("ingresa el primer numero");
		num1 = operador.nextInt();
		
		System.out.println("ingresa el segundo numero");
		num2 = operador.nextInt();
		
		System.out.println("Que operatoria quieres hacer?");
		System.out.println("debes digitar asi:");
		System.out.println("S = suma");
		System.out.println("R = resta");
		System.out.println("D = division");
		System.out.println("M = multiplicacion");
		calculadora = operador.next();
		
		switch (calculadora.toLowerCase()) {
		case "s":
				resultado = num1 + num2;
				System.out.println("el resultado de la suma es : " +resultado);
			break;
			
		case "m":
			resultado = num1 * num2;
			System.out.println("el resultado de la multiplicacion es : " +resultado);
		break;
		
		case "d":
			resultado = num1 / num2;
			System.out.println("el resultado de la division es : " +resultado);
		break;
		
		case "r":
			resultado = num1 - num2;
			System.out.println("el resultado de la resta es : " +resultado);
		break;

		default:
			System.out.println("lo siento, la operatoria tiene que ser: suma, resta, multiplicacion y division");
			break;
		}
		
		
		
	}

}
