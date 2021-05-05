package Banco;

public abstract class Cuenta {

    protected String titular;
    protected Double saldo;

    Cuenta(String titular){
        this.saldo = 0.0;
        this.titular = titular;
    }

    protected Double getSaldo() {
        return saldo;
    }

    protected void depositarDinero(Double monto) {
        this.saldo+=monto;
    }

    public abstract void retirarDinero(Double monto);
    public abstract String getTipoCuenta();
}
