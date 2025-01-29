

public class Main {

    public static void main(String[] args) {
        Cuenta miCuenta;
        miCuenta = new Cuenta("Antonio López", "1000-2365-85-1230456789", 2500);
        System.out.println(miCuenta.toString());
        System.out.println("\nEl saldo actual es: "+ miCuenta.saldo);

        try {
        	System.out.println("Retiramos " + 2000 + " en cuenta");
            miCuenta.retirar(2000);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingresamos " + 600 + " en cuenta");
            miCuenta.ingresar(600);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        System.out.println("El saldo actual es: "+ miCuenta.saldo);
    }
}
