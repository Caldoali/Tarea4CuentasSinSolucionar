package cuentas.clientes;

public class Main {

    public static void main(String[] args, float cantidad) {
        operativa_cuenta();
    }

    private static void operativa_cuenta() {
        Cuenta cuenta2;
        double saldoActual;

        cuenta2 = new Cuenta("Roger Federer","2100-2635-15-1230456789",4500,0);
        
        System.out.println("El saldo actual es:"+ cuenta2.estado() );

        try {
            cuenta2.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta2.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta2.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta2.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
