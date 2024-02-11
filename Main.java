/**
 * Clase Main que contiene el método principal para ejecutar la aplicación.
 */
public class Main {

    /**
     * Método principal de la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, 2300.0f);
    }

    /**
     * Método para realizar operaciones en la cuenta.
     * @param cuenta1 La cuenta en la que se realizarán las operaciones.
     * @param cantidad La cantidad a retirar de la cuenta.
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
