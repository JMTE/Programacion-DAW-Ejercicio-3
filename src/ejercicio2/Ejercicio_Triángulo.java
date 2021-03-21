package ejercicio2;

import java.util.InputMismatchException;//Importamos la clase para crear la excepcion
import java.util.Scanner;//Importamos la clase java.util.Scanner

public class Ejercicio_Triángulo {

	public static void main(String[] args) {
		
		Scanner lado=new Scanner(System.in); /*Aqui utilizamos el constructor de la
		clase scanner que en este caso nos lee los datos introducidos desde la entrada*/
		double a,b,c;/*Declaramos las variables que serán los lados del triángulo, las
		declaro como double por si a alguien se le ocurre introducir decimales.*/
		
		
	try{ /*Utilizamos un bloque try catch para capturar la excepcion producida
	por culpa de introducir un string en vez de un double, de esta manera, saldrá un
	mensaje en pantalla diciendo que hemos cometido un error al introducir texto
	y finalizará el programa*/
		
		/*A continuacion, hacemos tres bucles do-while,uno para cada lado, si introducimos
		 un numero menor o igual a cero, seguirá pidiendo el lado, no sale del bucle
		 hasta que introduzcamos un valor positivo mayor de cero.
		 */
		do{
		System.out.println("Introduce el PRIMER lado del triángulo (Cero no sirve,negativo tampoco)");
			a=lado.nextDouble();/* y en esta linea memorizamos  el lado del triángulo
			mediante el valor que le introducimos por teclado gracias a la clase Scanner*/
		}while(a<=0);
		do{
		System.out.println("Introduce el SEGUNDO lado del triángulo (Cero no sirve,negativo tampoco)");
			 b=lado.nextDouble();
		}while(b<=0);
		do{
		System.out.println("Introduce el TERCER lado del triángulo (Cero no sirve,negativo tampoco)");
			 c=lado.nextDouble();
		}while(c<=0);
		lado.close();//Cerramos el Scanner para no consumir recursos
		
		System.out.println("Lado A: "+a+" /// Lado B: "+b+" /// LADO C: "+c);
	
		//Ahora, realizamos las operaciones para distinguir si el triangulo existe o que tipo es
		
			if (a+b<=c || a+c<=b || b+c<=a){ /*En este bucle if le decimos
			que si la suma de dos de los lados es menor que el otro lado restante
			el triangulo no será valido y en la siguiente linea lo escribimos en 
			pantalla*/
				System.out.println("El triángulo NO es valido");
			}
			else {/*Si no se cumple la sentencia anterior entonces entramos en el
			siguiente bucle if anidado*/
				if (a==b && b==c){/*Aqui le indicamos que si todos los lados 
				son iguales el triángulo es equilatero*/
					System.out.println("El triángulo es EQUILATERO");
					
				}else if ((a==b && b!=c) || (b==c && c!=a) || (a==c && b!=c)) {/* 
				En este bucle le decimos que si no se cumple la anterior condicion, en el 
				caso de que un lado sea igual a otro y distinto del tercero, en este caso
				el triangulo será rectángulo*/
					
					System.out.println("El triángulo es ISÓSCELES");
					
					
				}else {/*Y como ya no quedan mas opciones que la de que todos los lados sean 
				de distinto valor, ya le decimos que imprima por pantalla que en este caso
				el triángulo es escaleno*/
					System.out.println("El triángulo es ESCALENO");
				}
			
			
			
			}
	}catch (InputMismatchException e){ /*Aqui, lanzamos la excepcion que nos resulta
	de introducir un String en los datos de los lados, la capturamos y escribimos en 
	pantalla que hemos introducido un valor no valido*/
		System.out.println("¿Quieres calcular un tipo de triangulo o escribir una novela? FIN DE PROGRAMA");
	}
	}
	
}
				
      
