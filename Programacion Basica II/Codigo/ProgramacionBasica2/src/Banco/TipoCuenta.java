package Banco;

public enum TipoCuenta {
    CUENTA_SUELDO("cuenta_sueldo"),
    CUENTA_CORRIENTE("cuenta_corriente"),
    CAJA_DE_AHORRO("caja_de_ahorro");

    private String nombre;

    TipoCuenta(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
