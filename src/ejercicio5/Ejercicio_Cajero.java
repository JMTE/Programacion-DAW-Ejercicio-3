package ejercicio5;

//import java.util.Scanner;

import javax.swing.JOptionPane;/*Importo el paquete javax.swing.Joptionpane para los cuadros donde 
introduzco los datos del importe de venta y el importe del billete.*/

public class Ejercicio_Cajero {

	public static void main(String[] args) {
		try{ /*Creamos un bloque try catch para que nos capture el mensaje de error
		que producimos al introducir un String en los valores pedidos. Al menos, si
		el programa se cae, se cae con un mensaje de informacion.*/
		
				int precio_venta,importe_billete,poco_dinero = 0;
				/*Defino las variables del importe de venta y del importe del billete 
				 entregado, ademas, una variable para el bucle en el que entramos
				 al entregar un billete menor del importe de venta
				 */
				
				do{
					/*Introducimos el importe en un objeto de la clase JOptionPane
					 el cual esta dentro de un bucle do-while porque mientras el 
					 numero introducido sea igual o menor que cero (no existen precios
					 negativos o valor cero, se sigue pidiendo el valor de venta
					 */
				precio_venta=Integer.parseInt(JOptionPane.showInputDialog(null, " No introducir números negativos \n Cero tampoco (No existen ventas gratuitas)","------------€€€€€>PRECIO DE VENTA<€€€€€-------", 3));
				
				}while(precio_venta<=0);
				System.out.println("----->EL PRECIO DE VENTA ES: "+ precio_venta + " EUROS.");
				
				do{
					/*Lo mismo que lo anterior pero para el importe del billete 
					 entregado. Cada vez que entremos en el bucle ponemos la 
					 variable poco_dinero a cero por si ya introducimos un valor 
					 menor que el billete de venta anteriormente.
					 */
					poco_dinero=0;
				importe_billete=Integer.parseInt(JOptionPane.showInputDialog(null," No introducir números negativos ","------€€€€>IMPORTE DEL BILLETE<€€€€--------",3));
					if (importe_billete<precio_venta){
						/*si el importe de billete menor que importe de venta, se
						 * lanza un mensaje y se pone la variable poco_dinero a uno.
						 Esta variable la analizamos para salir del bucle.*/
						JOptionPane.showMessageDialog(null, "Busca un billete mas grande, te falta dinero",null, 0);
						poco_dinero=1;
					}
					/*La condicion, para salir del bucle es con la variable poco_dinero
					 si es menor que el importe de venta, vuelve a repetir el mensaje
					 de introducir el importe del billete.
					 */
				}while (poco_dinero==1);
				System.out.println("----->EL IMPORTE DEL BILLETE/S ES DE: "+ importe_billete + " EUROS.");
				
				
				/*Escribimos en consola mensajes informativos para tener toda
				 la informacion en pantalla.
				*/
				System.out.println("PRECIO A PAGAR = " + precio_venta+ "  /////   DINERO ENTREGADO = " + importe_billete);
				
				System.out.println("LA DEVOLUCIÓN CORRESPONDIENTE SERÁ :");
				
				/*El calculo de como gestionar la vuelta en billetes
				lo hacemos mediante un procedimiento que recibe dos enteros
				por parametros, en este caso los que son necesarios, precio_venta
				y importe_billete
				 */
				devuelveBilletes(precio_venta,importe_billete);
				
				
		}catch(NumberFormatException e){/*Aqui gestionamos el error cometido por introducir String
		y presentamos un mensaje en la consola.*/
			System.out.println("Has introducido un error en los datos. FIN DEL PROGRAMA");
		}
		
	}
	public static void devuelveBilletes(int p_venta,int i_billete){
		/*Aqui empezamos el procecimiento, el cual al ser void no devuelve nada,
		 declaramos las variables de los billetes que tenemos para hacer la devolucion
		 y los inicializamos a cero, los usaremos como contadores para contar el 
		 numero de billetes de cada tipo
		 */
		int billete5 = 0, billete10 = 0, billete20 = 0, billete50 = 0;
					
		int vuelta=i_billete-p_venta; //Calculamos el valor total del dinero a devolver
		if (vuelta==0){
			/*Si el total del dinero a devolver es cero, eso es que el dinero entregado
			 es igual al importe de la venta, por lo tanto no hay devolucion de dinero
			 */
			JOptionPane.showMessageDialog(null, "El importe entregado es exacto \n   NO EXISTE DEVOLUCIÓN");
			System.out.println("EL DINERO ENTREGADO ES EXACTO, NO EXISTE DEVOLUCIÓN DE BILLETES");
		}else if (vuelta<5){
			/*Si el importe entregado es mayor que el precio de venta pero menor
			 que un billete de 5 euros, informaremos que la devolucion es de 
			 unas monedas.
			 */
			JOptionPane.showMessageDialog(null, "TE CORRESPONDEN UNAS MONEDAS");
			
			System.out.println("UNAS MONEDAS");
		}else{
			/*Si el importe entregado es mayor que el importe de la venta, entonces
			 realizamos un bucle while en donde la condicion para salir, es que
			 nos quede un importe de la vuelta menor de 5, en este bucle vamos 
			 saltando de else if en else if segun el importe que nos vaya quedando
			 hasta quedar reducido a 5 exactos. Vamos almacenando en contadores
			 de los billetes el numero de cada uno.
			 */
						
			while (vuelta>=5){
				if (vuelta>=50){
					vuelta=vuelta-50;
					billete50++;
				}else if (vuelta>=20){
					vuelta=vuelta-20;
					billete20++;
				}else if (vuelta>=10){
					vuelta=vuelta-10;
					billete10++;
				}else if (vuelta>=5){
					vuelta=vuelta-5;
					billete5++;
				}
					
			}
			/*en este momento ya tenemos los contadores de los billetes con sus
			 determinados valores. Almacenamos esos valores en un array de enteros
			 y en otro array de enteros almacenamos el valor de los billetes para 
			 presentarlos en mensaje y pantalla.
			 */
					
			int[] Array= new int[]{ billete50,billete20,billete10,billete5 }; 
			int[] Array2=new int[]{50,20,10,5};
			//con este bucle for, recorremos los array		 		
			 for ( int i=0 ;i<Array.length; i++ ){
				 
				 if (Array[i]==0){
					 /*Con el bucle if, le decimos que si el valor de la posicion 
					   donde almacenamos los contadores de los billetes es igual a cero
					  no escriba nada 
					  */	 					
				}else if(Array[i]!=0){
					/*Con este else if, le decimos que cuando en las posiciones del array, hay valores
					 nos informe de que valor tiene(numero de billetes de cada uno) 
					 y con array2 informamos del valor de esos billetes.
					 */
						 					
				System.out.println("----------> "+Array[i]+ " BILLETE/S DE : " +Array2[i]+" EUROS");	
				JOptionPane.showMessageDialog(null, "          "+ Array[i]+ " BILLETE/S","€€€€€€>BILLETES DE "+Array2[i]+" EUROS<€€€€€€",1) ;
				}
			}		
							 
							 									
		}
					 
	}
					 
}



