package cuentas.clientes;

/**
 * Clase Cuenta
 * 
 * Información sobre los atributos y métodos de cuenta
 * 
 * @author caldo
 * @version 2.0
 * @since 1.0
 * 
 */
public class Cuenta {

/**
 * Nombre del cliente
 */
    private String nombre;
/**
 * Número de cuenta
 */
    private String cuenta;

/**
 * Saldo de la cuenta
 */
    private double saldo;
    
/**
 * Tipo de interés que se aplica a la cuenta
 */
    private double tipoInteres;

    
/**
 * Constructor por defecto
 */
    public Cuenta()
    {
        nombre ="";
        cuenta="";
        saldo=0;
        tipoInteres=0;
    }

/**
 * Constructor con 4 parámetros
 * @param nom nombre del cliente
 * @param cue número de la cuenta
 * @param sal saldo restante en cuenta
 * @param tipo tipo de interés aplicado
 */
    public Cuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }

/**
 * Constructor con 3 parámetros
 * @param nombre nombre del cliente
 * @param cuenta número de la cuenta
 * @param saldo saldo restante en cuenta
 */    
    public Cuenta(String nombre, String cuenta, double saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }
    
    
/**
 * Método para comprobar el saldo de la cuenta
 * @return saldo
 */
    public double estado()
    {
        return saldo;
    }

/**
 * Añade al saldo la cantidad indicada 
 * @param cantidad
 * @throws Exception Si la cantidad ingresada en 0 o negativa
 */    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

/**
 * Detrae del saldo la cantidad indicada 
 * @param cantidad
 * @throws Exception Si la cantidad es 0 o negativa o no hay suficiente saldo
 */    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

/**
 * Obtiene el nombre del cliente
 * @return nombre
 */    
    public String getNombre() {
        return nombre;
    }
    
/**
 * Establece el nombre del cliente
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
/**
 * Obtiene el número de la cuenta
 * @return cuenta
 */
    public String getCuenta() {
        return cuenta;
    }
    
/**
 * Establece el número de cuenta
 * @param cuenta 
 */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
/**
 * Obtiene el saldo
 * @return saldo
 */
    public double getSaldo() {
        return saldo;
    }
    
/**
 * Establece el saldo
 * @param saldo 
 */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
/**
 * Obtiene el tipo de interés de la cuenta
 * @return tipoInteres
 */
    public double getTipoInteres() {
        return tipoInteres;
    }
    
/**
 * Establece el tipo de interés de la cuenta
 * @param tipoInteres 
 */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
