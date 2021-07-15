public class PruebaCuenta{

	public static void main(String args[]){
		
		Cuenta julian =	new Cuenta("Julian Castro", 0.0);
		
		System.out.println("Su saldo actual es: $" + julian.getSaldo() + " Pesos");
		
		julian.depositar(1570.0);
		System.out.println("Su saldo actual es de : " + julian.getSaldo());
		
		System.out.println("");
		
		julian.retirar(2000.0);
		julian.retirar(1570.0);
		System.out.println("Su saldo actual es de : " + julian.getSaldo());
	}



}