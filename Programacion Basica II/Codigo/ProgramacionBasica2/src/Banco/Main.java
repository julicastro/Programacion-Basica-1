package Banco;

public class Main {

    public static void main(String[] args) {

        Cuenta cuentaSueldo = new CuentaSueldo("Juan Perez");
        Cuenta cuentaCajaAhorro = new CajaDeAhorros("Cosme Fulanito");
        Cuenta cuentaCuentaCorriente = new CuentaCorriente("Leopoldo Lugones");

        cuentaSueldo.depositarDinero(300.0);
        System.out.println(cuentaSueldo.getSaldo());
        cuentaSueldo.retirarDinero(200.0);
        System.out.println(cuentaSueldo.getSaldo());
        //cuentaSueldo.retirarDinero(300.0);

        cuentaCajaAhorro.depositarDinero(1000.0);
        System.out.println(cuentaCajaAhorro.getSaldo());
        cuentaCajaAhorro.retirarDinero(200.0);
        cuentaCajaAhorro.retirarDinero(100.0);
        cuentaCajaAhorro.retirarDinero(100.0);
        cuentaCajaAhorro.retirarDinero(100.0);
        cuentaCajaAhorro.retirarDinero(100.0);
        cuentaCajaAhorro.retirarDinero(100.0);
        System.out.println(cuentaCajaAhorro.getSaldo());
        //cuentaCajaAhorro.retirarDinero(300.0);

        cuentaCuentaCorriente.depositarDinero(500.0);
        System.out.println(cuentaCuentaCorriente.getSaldo());
        cuentaCuentaCorriente.retirarDinero(600.0);
        System.out.println(cuentaCuentaCorriente.getSaldo());
    }
}
