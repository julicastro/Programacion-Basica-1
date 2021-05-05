package Banco;

public class CuentaSueldo extends Cuenta {

    public CuentaSueldo(String titular) {
        super(titular);
    }

    @Override
    public void retirarDinero(Double monto) {
        if(saldo > 0 && saldo >= monto) {
            saldo-= monto;
        } else {
            throw new UnsupportedOperationException(String.format("Saldo Insuficiente para extracción de: %s", getTipoCuenta()));
        }
    }

    @Override
    public String getTipoCuenta() {
        return TipoCuenta.CUENTA_SUELDO.getNombre();
    }
}
