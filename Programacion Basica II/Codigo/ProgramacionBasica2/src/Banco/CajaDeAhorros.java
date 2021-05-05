package Banco;

public class CajaDeAhorros extends Cuenta {

    private static final Double COSTO_EXTRACCION = 6.0;
    private static final Integer MAX_EXTRACCIONES_SIN_COSTO = 5;
    private Integer extracciones;

    public CajaDeAhorros(String titular) {
        super(titular);
        this.extracciones = 0;
    }

    @Override
    public void retirarDinero(Double monto) {

        if (extracciones >= MAX_EXTRACCIONES_SIN_COSTO ){
            monto+=COSTO_EXTRACCION;
        }

        if(saldo > 0 && saldo >= monto) {
            saldo-= monto;
            extracciones++;
        } else {
            throw new UnsupportedOperationException(String.format("Saldo Insuficiente para extracción de: %s", getTipoCuenta()));
        }
    }

    @Override
    public String getTipoCuenta() {
        return TipoCuenta.CAJA_DE_AHORRO.getNombre();
    }
}
