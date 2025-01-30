import java.util.InputMismatchException;
import java.util.Scanner;
//hola

public class App {

    /**
     * Método principal de la aplicación.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scan = new Scanner(System.in);

        // Variable booleana para controlar la salida del programa
        boolean salir = false;

        try {
            // Pedir al usuario que ingrese un número
            System.out.println("Introduzca un numero");
            int numero = scan.nextInt();

            // Bucle que se repite hasta que el usuario elija salir
            while (!salir) {

                // Mostrar el menú de opciones
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Elevar el numero a la potencia de 10");
                System.out.println("2. Calcular el valor absoluto del numero");
                System.out.println("3. Calcular la raiz cuadrada del numero");
                System.out.println("4. Calcular el exponencial del numero");
                System.out.println("5. Calcular el area de un circulo usando el numero como radio");
                System.out.println("6. Redondear el número al entero más cercano");
                System.out.println("7. Salir");

                // Leer la opción seleccionada por el usuario
                int seleccion = scan.nextInt();

                // Llamar al método menu para procesar la opción seleccionada
                menu(numero, seleccion, scan, salir);

            }
        } catch (InputMismatchException e) {
            // Manejar la excepción si el usuario ingresa algo que no es un número
            System.out.println("Introduzca un número válido");

        }

    }

    /**
     * Método que procesa la opción seleccionada por el usuario.
     * 
     * @param numero
     * @param seleccion
     * @param scan
     * @param salir
     */
    public static void menu(int numero, int seleccion, Scanner scan, boolean salir) {

        try {
            // Verificar si la opción seleccionada es válida
            if (seleccion < 1 || seleccion > 7) {
                throw new IllegalArgumentException("Opción inválida");
            }

            // Procesar la opción seleccionada
            switch (seleccion) {
                case 1:
                    // Elevar el número a la potencia de 10
                    System.out.println("Elevar el numero a la potencia de 10");
                    double resultado = Math.pow(numero, 10);
                    System.out.println(resultado);
                    break;
                case 2:
                    // Calcular el valor absoluto del número
                    System.out.println("Calcular el valor absoluto del numero");
                    int valorAbsoluto = Math.abs(numero);
                    System.out.println(valorAbsoluto);
                    break;
                case 3:
                    // Calcular la raíz cuadrada del número
                    System.out.println("Calcular la raiz cuadrada del numero");
                    if (numero < 0) {
                        throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
                    }
                    double raizCuadrada = Math.sqrt(numero);
                    System.out.println(raizCuadrada);
                    break;
                case 4:
                    // Calcular el exponencial del número
                    System.out.println("Calcular el exponencial del numero");
                    double exponencial = Math.exp(numero);
                    System.out.println(exponencial);
                    break;
                case 5:
                    // Calcular el área de un círculo usando el número como radio
                    System.out.println("Calcular el area de un circulo usando el numero como radio");
                    double areaCirculo = Math.PI * Math.pow(numero, 2);
                    System.out.println("El area del circulo es: " + areaCirculo);
                    break;
                case 6:
                    // Redondear el número al entero más cercano
                    System.out.println("Redondear el número al entero más cercano");
                    int enteroCercano = Math.round(numero);
                    System.out.println(enteroCercano);
                    break;

                case 7:
                    // Salir del programa
                    salir = true;
                    System.out.println("Adios");
                    scan.close();
                    break;

            }
        } catch (IllegalArgumentException e) {
            // Manejar la excepción si la opción seleccionada es inválida
            System.out.println("Error: " + e.getMessage());
        }

    }
}
