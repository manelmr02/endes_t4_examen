package javadoc;

/**
 * Clase CuentaBancaria.
 * Clase que crea objetos CuentaBancaria que representan una cuenta bancaria de un banco.
 * @author JoseManuel
 * @version 0.1, 2024/03/12
 */
public class CuentaBancaria {
    /**
     * Número de cuenta.
     * Número de cuenta de la cuenta bancaria.
     */
    private String numeroCuenta;
    /**
     * Saldo de la cuenta.
     * Saldo de la cuenta bancaria.
     */
    private double saldo;
    /**
     * Propietario de la cuenta.
     * Cliente propietario de la cuenta bancaria.
     */
    private Cliente propietario;

    /**
     * Constructor de objetos de la clase CuentaBancaria.
     * Crea un objeto CuentaBancaria con toda la informacion necesaria.
     * @param numeroCuenta número de cuenta
     * @param saldo saldo de la cuenta
     * @param propietario propietario de la cuenta
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    /**
     * Método getter para número de cuenta.
     * Método que devuelve el número de cuenta de la cuenta bancaria.
     * @return String con el número de la cuenta bancaria
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Método setter para el número de cuenta.
     * Método que permite establecer un nuevo valor para el atributo numeroCuenta del objeto CuentaBancaria.
     * @param numeroCuenta nuevo número de cuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Método getter para el saldo.
     * Método que devuelve el saldo de la cuenta bancaria.
     * @return double con el saldo de la cuenta bancaria
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setter para el saldo de la cuenta.
     * Método que permite establecer un nuevo valor para el atributo saldo del objeto CuentaBancaria.
     * @param saldo nuevo saldo de la cuenta bancaria
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método getter para propietario.
     * Método que devuelve el cliente propietario de la cuenta bancaria.
     * @return Cliente que posee la cuenta bancaria
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     * Método setter para propietario.
     * Método que permite establecer un nuevo cliente como propietario de la cuenta bancaria.
     * @param propietario nuevo cliente propietario de la cuenta bancaria
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     * Metodo depositar.
     * Método que permite añadir saldo a la cuenta bancaria.
     * @param cantidad cantidad a añadir al saldo de la cuenta.
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    /**
     * Método retirar.
     * Método que permite retirar saldo de la cuenta bancaria.
     * @param cantidad cantidad a retirar de la cuenta bancaria
     * @return boolean 'true' si se ha podido retirar ese saldo, 'false' si no se ha podido retirar ese saldo
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    /**
     * Método que convierte la estancia de un objeto CuentaBancaria en un String.
     * El metodo devuelve un string con toda la información necesaria sobre la cuenta bancaria.
     * @return String con toda la información necesaria sobre la cuenta bancaria
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}