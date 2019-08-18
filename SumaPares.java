/* Riaño Enriquez Donovan, Grupo 3 POO, Prof: M.I. Edgar Tista García, Practica 2, 17/febrero/2019 */	

import java.util.Scanner;
class SumaPares {
	public static void main(String[] args) {
		//Declaración de Variables		
		int n1,n2;
		int sum = 0;
		int suma;
		int mayor, menor;
		Scanner sc = new Scanner(System.in);
		//Pedir Datos al Usuario
		System.out.println("Por favor Introduzca un número entero");
		n1 = sc.nextInt();
		System.out.println("Introduzca otro numero entero");
		n2 = sc.nextInt();
		//Validar cual es el numero mayor y el menor
		if (n1>n2){
			mayor = n1;
			menor = n2;
		}else {
			mayor = n2;
			menor = n1;
		}
		//Hacer un ciclo desde el menor hasta el mayor 
		for (int i = menor; i <= mayor; i++){
			//validar si es par para el usuario 
			if (i %2 ==0){
				sum += i;
				}
			}
			//Imprimir el resultado
			suma = n1+n2;
			System.out.println("La suma de los pares entre " + n1 + " y " + n2 + " es: " + suma);
			System.out.println("Lo que no se que se hace con esto entre " + n1 + " y " + n2 + " es: " + sum);
			sc.close();
		}
	}
	