package ejercicio1;

import java.util.Random;//Importamos el paquete java.util.Random

public class SumaNumeros {

	public static void main(String[] args) {
		Random numero=new Random(); /*Aqui invocamos al constructor sin parametros
		de la clase Random(aleatorio) y lo definimos como numero*/
		int num1 =numero.nextInt(20)+1;/*Declaración y asignacion de valor
		  al mismo tiempo .Aqui decimos que num1 es igual a un numero aleatorio 
		 entre 0 y 19 +1 y utilizamos el metodo nextInt de la clase Random,
		 ponemos el +1 porque sino, nos daria numeros del 0 al 19 y queremos
		 del 1 al 20 */
		
		int num2;//declaramos el num2
		
			if (num1>=5 && num1<=15) { /*Con este bucle if estamos diciendo que 
				si el número esta entre 5 y 15 ambos incluidos pues hay que hacer la
				operacion que se encuentra despues de la llave.*/
				num2=num1+15;
			}else{ /*Y sino se encuentra en los valores descritos anteriormente
				pues hacer la operacion que se encuentra despues de la llave del else*/
					num2=num1+5;
					
				}
			/*A continuación imprimimos en la consola el valor de cada numero mediante 
			el metodo de concatenacion de string y variable.*/
			System.out.println("El valor de la variable num1 es " +num1);
			System.out.println("El valor de la variable num2 es "+num2);
			
			
			}
		
		
	}


