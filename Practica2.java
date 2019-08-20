/* Riaño Enriquez Donovan, Grupo 3 POO, Prof: M.I. Edgar Tista García, Practica 2, 17/febrero/2019 */	

import java.util.Scanner;
class Practica2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero para escoger la opciòn");
		System.out.println("\n1.Expresiòn Aritmètica\n2.Saludo\n3.Operador Ternario\n4.Calificaciones\n5.For each");
		System.out.print("\n>>> ");

		int opciones = sc.nextInt();
		switch (opciones) {
			
			case 1:
				Calculadora calcula1 = new Calculadora();
				System.out.println("\nLos resultados son: ");
				calcula1.primero();

				Calculadora calcula2 = new Calculadora();
				calcula2.segundo();

				Calculadora calcula3 = new Calculadora();
				calcula3.tercero();

				Calculadora calcula4 = new Calculadora();
				calcula4.cuarto();
				
				break;
			
			case 2:// para ahorrar el uso excesivo de case podemos utilizar una opcion especial de java para el manejo de formato de hora. 
				//a su vez llamando a una clase hija para que el programa del padre no quede tan lleno de còdigo. 
	
				System.out.println("\nIngrese un Horario en formato de 24 Hrs: ");
				System.out.print("> ");
				int opcion2 = sc.nextInt();
				switch (opcion2) {
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
					case 10:
					case 11:
					case 12:
						Manana saludo1 = new Manana();
						saludo1.Saludo();
						break;

					case 13:
					case 14:
					case 15:
					case 16:
					case 17:
					case 18:
						Tarde saludo2 = new Tarde();
						saludo2.Saludo();
						break;

					case 19:
					case 20:
					case 21:
					case 22:
					case 23:
					case 24:
						Noche saludo3 = new Noche();
						saludo3.Saludo();
						break;
					default:
						System.out.println("Horario Invàlido, no sea Payaso  y ya duermase :v");
				}	

				break;
			
			case 3:
				


				int x = 1,y= 1,z;
				System.out.println("Opciòn 1:");
				int u = (x<=10 && y<=10) ? (z = 200) : (z = 100);
				System.out.println("El valor de x es: " + x + " ,el valor de y es: " + y + " ,el valor de z es: " + z);
				
				System.out.println("Opciòn 2");
				int v = (x>2) ? ( (x<5) ? (y=10) : (y=8) ) : (y=7);
				System.out.println("El valor de x es: " + x + " Y el valor de y es :" + y);
				
				break;
			
			case 4:
				
				float tar,exam,proyec,lab;
				System.out.println("\nIngrese la Calificacion de Tareas :");
				System.out.print("> ");
				tar =  sc.nextFloat();
				System.out.println("Ingrese la Calificacion de Examénes:");
				System.out.print("> ");
				exam = sc.nextFloat();
				System.out.println("Ingrese la Calificacion de Proyectos:");
				System.out.print("> ");
				proyec = sc.nextFloat();
				System.out.println("Ingrese la Calificacion de Laboratorio:");
				System.out.print("> ");
				lab = sc.nextFloat(); 

				Promedio1 calif1 = new Promedio1();
				float resul1 = calif1.prom(tar,exam,proyec,lab);
				System.out.println("La Calificacion final es: " + resul1);

				Promedio2 calif2 = new Promedio2();
				float resul2 = calif2.prom(tar,exam,proyec,lab);
				System.out.println("La Calificacion sin redondeo es: " + resul2);
							
				break;
			
			case 5:

				int a[] = {1,2,3,4,5,6,7,8,9,10};
				int var = 0;
				int var2 = 10;

				System.out.println("\ncomparación del primer for vs for each");
				
				for (int i=0; i<10;i++){
					var+= a[i];
					System.out.println(var);
				}

				for (int valor : a){
					valor+= a[var2];
					System.out.println(valor);
				}

				
		        System.out.println("\ncomparación del segundo for vs for each");
				for (int i = 0; i<10;i++){
					System.out.println(a[i]*var2);
				}

				for (int valor2 : a){
					valor2 = a[var2];
					System.out.println(valor2);
				}

		
				System.out.println("\ncomparación del tercer for vs for each");
				for (int i = 0; i<10;i++){
					if(i%4==0)
						System.out.println(a[i]+ " es divisible entre 4");
				}

				System.out.println("for each 3r.");
				for (int valor2 : a){
					if (valor2%4==0)
						System.out.println(a[valor2] + "es divisible entre 4");

				}


				break;
			default:
				System.out.println("Opciòn Invàlida");
				break;
			
		}
	}
}




class Manana{
	public void Saludo(){
		System.out.println("Buenos Dìas");
	}
}

class Tarde{
	public void Saludo(){
		System.out.println("Buenas Tardes");
	}
}

class Noche{
	public void Saludo(){
		System.out.println("Buenas Noches");
	}
}
