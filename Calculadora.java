/* Riaño Enriquez Donovan, Grupo 3 POO, Prof: M.I. Edgar Tista García, Practica 2, 17/febrero/2019 */	

class Calculadora{
	public void primero(){
		int x = 10; int y = 20; int z = 5;
		z+= 10 + --x * y - 30 / z % 4;
		System.out.println("El valor de la primer expresión es: " + z );
	}

	public void segundo(){
		int x = 5; int y = 10; int z = 15;
		z+= 5 + --x * y++ -10 * 2+ ++y;
		System.out.println("El valor de la segunda expresión es: " + z );
	}
	
	public void tercero(){
		int x =5; int y = 8; int z;
		z = x + y * y + x * y + --x;
		System.out.println("El valor de la tercera expresión es: " + z );
	}

	public void cuarto(){
		int x = 3; int y = ++x *5 / x-- + --x;
		System.out.println("El valor X de la cuarta expresión es: " + x );
		System.out.println("El valor Y de la cuarta expresión es: " + y );
	}

}
