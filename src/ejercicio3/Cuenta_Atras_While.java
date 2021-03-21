package ejercicio3;

public class Cuenta_Atras_While {

	public static void main(String[] args) {
		int i=100;   /*En este programa realizamos la cuenta atras con un bucle 
		do-while, y le ponemos la condicion de que haga la cuenta hasta que i sea mayor 
		o igual que 10 para que pare en 10*/
		do{
			System.out.println(i);
			i=i-10;
			
		}while(i>=10);

	}

}
