package Banco;

public class CuentaCorriente extends Cuenta {

    private static final Double RECARGO_GIRO_DESCUBIERTO = 0.05;
    private static final Double MAX_GIRO_DESCUBIERTO = -150.0;

    CuentaCorriente(String titular) {
        super(titular);
    }

    @Override
    public void retirarDinero(Double monto) {

        if(saldo - monto < 0) {
            Double diferencia = Math.abs(saldo - monto);
            monto += diferencia * RECARGO_GIRO_DESCUBIERTO;
        }
        if (saldo > MAX_GIRO_DESCUBIERTO && saldo - monto >= MAX_GIRO_DESCUBIERTO) {
            saldo-= monto;
        } else {
            throw new UnsupportedOperationException(String.format("Saldo Insuficiente para extracción de: %s", getTipoCuenta()));
        }
    }

    @Override
    public String getTipoCuenta() {
        return TipoCuenta.CUENTA_CORRIENTE.getNombre();
    }
}

