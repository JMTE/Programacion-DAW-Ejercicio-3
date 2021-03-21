package ejercicio4;

import java.util.InputMismatchException; //Importamos el paquete para la excepcion creada
import java.util.Random;//Importamos el paquete para la clase Random
import java.util.Scanner;//Importamos el paquete para la clase Scanner

public class Ejercicio_Operaciones {

	public static void main(String[] args) {
		
		Random numero=new Random();/*Instanciamos la clase Random y utilizamos 
		el constructor sin parametros.*/
		Scanner sc=new Scanner(System.in);/*Instanciamos la clase Scanner y utilizamos
		el constructor pasandole por parametro lo que introduzcamos por teclado.*/
		int num1=numero.nextInt(10)+1;/*Creamos el primer numero entero aleatorio entre 1 y 10,
		hacemos el + 1 porque sino serian numeros de 0 a 9*/
		int num2=numero.nextInt(10)+1;//Creamos el segundo numero entero aleatorio
		System.out.println("NUMERO 1 GENERADO ALEATORIAMENTE: "+num1+" /// NUMERO 2 GENERADO ALEATORIAMENTE: "+num2+"\n");
		
		//Creamos el menu en la consola para escoger la opcion de operacion
		System.out.println(" 1.SUMAR \n 2.RESTAR \n 3.MULTIPLICAR \n 4.DIVIDIR \n 5.RESTO DE LA DIVISIÓN \n 6.TERMINAR \n       Opcion:  X");
		
		boolean i=false;/*Creamos esta variable booleana para entrar en el if de
		imprimir los resultados*/
		boolean j;/*Creamos esta variable booleana para cuando sea necesario salir
		del bucle do-while*/
		
		double resultado=0;/*Creamos la variable double resultado para almacenar el 
		valor que traemos de los metodos de las operaciones creados*/
		
		try{/*Creamos el bloque try catch para capturar la excepcion de cuando 
		introducimos un String por teclado en vez de un numero*/
		do{
			/*Creamos un bucle do-while del cual no vamos a salir hasta que introduzcamos
			 por teclado el numero 6
			 */
			i=false;/*Aqui reinicializamos estas variables para cuando volvemos a 
			empezar el bucle, esto es debido a que con la opcion,6 y una opcion 
			incorrecta no queremos que nos imprima el mensaje del resultado
			*/ 
			j=true;/*Con esta variable manejamos la salida del bucle do-while
			solo se pondrá en false cuando seleccionemos el 6 en el menu*/
			
		int  opcion=sc.nextInt();/*Definimos la variable opcion, que es el numero
		que introducimos por teclado para seleccionar la opcion de operacion, utilizamos
		el metodo de la clase scanner nextInt()*/
		
		switch (opcion){/*Con la variable opcion creada anteriormente, hacemos un
		switch case en donde segun el numero introducido seleccionaremos un case*/
		case 1:
			/*En el caso de introducir un 1 en el teclado, seleccionamos el case 1 y
			decimos que el resultado es igual al metodoSuma que hemos calculado
			mas abajo pasándole por parametros los dos numeros obtenidos aleatoriamente
			*/
			resultado=metodoSuma(num1,num2);
			
			break;
		case 2:
			//Lo mismo que el anterior texto pero para las demas operaciones.
			resultado=metodoResta(num1,num2);
		
			break;
		case 3:
			resultado=metodoMultiplicacion(num1,num2);
		
			break;
		case 4:
			resultado=metodoDivision(num1,num2);
			
			break;
		case 5:
			resultado=metodoResto(num1,num2);
			
			break;
		case 6:
			/*En este caso, tenemos que salir del bucle para acabar el programa
			por lo tanto ponemos la j=false y la i=true para que no imprima el mensaje 
			de resultado que tenemos guardado anteriormente
			 */
			j=false;
			i=true;
			break;
		default :
			/*El default nos sirve para indicar que si se introduce otro numero 
			 entero diferencite de la lista, imprimamos los siguientes mensajes 
			 */
		    System.out.println("OPCION INCORRECTA");
			System.out.println("Dame el número de una opcion correcta");
			
			i=true;/*Para no imprimir el resultado, aqui no se cambia la j porque
			queremos seguir en el bucle*/
			break;
		}
		
			if (i==false){ //si se cumple la condicion pues imprimimos el resultado
				System.out.println("Los numeros son "+ num1 + " y "+num2 +" y el resultado segun la opcion elegida es "+resultado);	
			}
			}while (j==true);//Salimos del bucle cuando j=true
		
		sc.close();//Cerramos el Scanner para la optimizacion de recursos
		}catch(InputMismatchException e){/*Aqui capturamos la excepcion de 
		introducir un String por teclado en la opcion */
			System.out.println("Has introducido por teclado un String. FIN DEL PROGRAMA");
		}
	
	}
		
		
	public static double metodoSuma (double x,double y){
		/*Este es el metodo de la suma, un metodo static, el cual debe de devolver
		 siempre un valor, es un metodo en el cual recibimos dos valores double, en
		 este caso nos sirve para recibir los numeros aleatorios y calcular
		 la operacion suma
		 */
			
			return x+y;
			
	}
	public static double metodoResta(double x, double y){
		//Lo mismo que la suma pero para la resta
		return x-y;
		
	}
	public static double metodoMultiplicacion(double x, double y){
		//Lo mismo para la multiplicacion
		return x*y;
		
	}
	public static double metodoDivision(double x, double y){
		/*Lo mismo para la division, al ser dos numeros entre 1 y 10
		ya no tenemos el problema de la division entre cero
		 */
		
		return x/y;
		
	}
	public static double metodoResto(double x, double y){
		//Lo mismo para el resto
		return x%y;
	}
	
		
			
	
	
	}


