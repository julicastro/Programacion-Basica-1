package ar.edu.unlam;

public class Cuenta{

	private String cuenta;
	private double saldo;
	private double depositoMensual;
	private double saldoActual;
	private double dineroARobar;
	
	public Cuenta() {
	}
	
	public void setDineroARobar(double plataRobada) {
		this.dineroARobar=plataRobada;
	}
	
	public double getRobada() {
		return this.dineroARobar;
	}
	
	public void setTitular(String titular) {
		this.cuenta=titular;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public void setDepositoMensual(double deposito) {
		this.depositoMensual=deposito;
	}
	
	public String getTitular() {
		return this.cuenta;
	}
	public double getSaldoInicial() {
		return this.saldo;
	}
	public double getDeposito() {
		return this.depositoMensual;
	}
	public double saldoActual() {
		this.saldoActual=this.saldo+this.depositoMensual;
		return this.saldoActual;
	}

	
}