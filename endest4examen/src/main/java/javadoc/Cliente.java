package javadoc;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Cliente.
 * Clase que crea objetos Cliente que representan a clientes de un banco.
 * @author JoseManuel
 * @version 0.1, 2024/03/12
 */
public class Cliente {
    /**
     * Nombre del cliente.
     * Nombre del cliente del banco.
     */
    private String nombre;
    /**
     * Apellido del cliente.
     * Apellido del cliente del banco.
     */
    private String apellido;
    /**
     * Identificación del cliente.
     * Identificación del cliente del banco (en España se utilizaria probablemente el DNI o valores establecidos por el banco).
     */
    private String id;
    /**
     * Lista de cuentas.
     * Lista de cuentas bancarias que posee el cliente del banco.
     */
    private List<CuentaBancaria> cuentas;

    /**
     * Constructor de objetos de la clase Cliente.
     * El constructor contiene todos los atributos necesarios para crear un nuevo cliente para el banco.
     * @param nombre nombre del cliente
     * @param apellido apellido del cliente
     * @param id identificación del cliente
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    /**
     * Método getter para nombre.
     * Método que devuelve el nombre del cliente del banco.
     * @return String con el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para nombre.
     * Método que permite establecer un nuevo valor para el atributo nombre del objeto Cliente.
     * @param nombre nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para apellido.
     * Método que devuelve el apellido del cliente del banco.
     * @return String con el apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método setter para apellido.
     * Método que permite establecer un nuevo valor para el atributo apellido del objeto Cliente.
     * @param apellido nuevo apellido del cliente
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método getter para id.
     * Método que devuelve la identificación del cliente del banco.
     * @return String con la identificación del cliente
     */
    public String getId() {
        return id;
    }

    /**
     * Método setter para apellido.
     * Método que permite establecer un nuevo valor para el atributo apellido del objeto Cliente.
     * @param id nueva identificación del cliente
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método getter para cuentas.
     * Método que devuelve la lista de cuentas del cliente del banco.
     * @return ArrayList (una lista) con las cuentas del cliente
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     * Método agregarCuenta.
     * Método que añade la cuenta pasada por parámetro a la lista de cuentas del cliente.
     * @param cuenta cuenta a añadir a la lista de cuentas del cliente
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * Método cerrarCuenta.
     * Método que elimina una cuenta de la lista de cuentas del cliente en caso de que el número de cuenta pasado por parámetro coincida con una cuenta que el cliente posea.
     * @param numeroCuenta numero de la cuenta que se desea cerrar
     * @return booleano 'true' si el cliente tenia esa cuenta en el listado de cuentas y se ha cerrado(eliminado de la lista), 'false' si no
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    /**
     * Método que convierte la estancia de un objeto Cliente en un String.
     * El metodo devuelve un string con toda la información necesaria sobre el cliente.
     * @return String con toda la información necesaria sobre el cliente
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}