public class Cuenta{

	private String titular;
	private double saldo;
		
	public Cuenta(String titular){
		this.titular=titular;
	}
	public Cuenta(String titular, double saldoInicial){
		this.titular=titular;
		this.saldo=saldoInicial;
	}
	public String getTitular(){
		return this.titular;
	}
	public void setTitular(String titular){
		this.titular=titular;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public String toString(){
		return "El titular es " + this.titular + ", Saldo: " + this.saldo;
	}
	public boolean depositar(double cantidad){
		boolean depositar = false;
		if(cantidad>0){
		depositar = true;
			if(depositar==true){
			this.saldo=this.saldo+cantidad;
			System.out.println("La operacion ha sido realizada con exito");
			}else{
		depositar = false;
		}}return depositar;
	}
	public boolean retirar(double cantidad){
		boolean retirar = false;
		if(this.saldo>=0){
			retirar = true;
			if(retirar==true && cantidad <= this.saldo){
				this.saldo = this.saldo-cantidad;
				System.out.println("La operacion ha sido realizada con exito");
			}else{
				retirar = false;
				System.out.println("Saldo Insuficiente");
			}
		}return retirar;
		}


	
}
