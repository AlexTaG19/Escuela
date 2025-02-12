package tiendaInstrumentos.src;

import java.time.LocalDate;

/**
 * Clase principal que demuestra el funcionamiento de la tienda de instrumentos.
 */
public class Tienda {
    public static void main(String[] args) {
        // Crear una guitarra usando el constructor por defecto
        Guitarra guitarraDefault = new Guitarra();

        // Crear una batería usando el constructor sin datos de compra
        Bateria bateriaSinCompra = new Bateria(500, "Ibanez", "Session Studio", 
                                               LocalDate.of(2020, 1, 1), 5, 3);

        // Mostrar la cantidad de stock
        System.out.println("Stock actual: " + Instrumento.getStock());

        // Intentar comprar un instrumento con DNI válido e inválido
        System.out.println("\nIntentando comprar con DNI válido:");
        guitarraDefault.comprar("12345678Z", "Juan Pérez", LocalDate.now());

        System.out.println("\nIntentando comprar con DNI inválido:");
        bateriaSinCompra.comprar("12345678A", "María García", LocalDate.now());

        // Mostrar la información de cada instrumento usando getInfo()
        System.out.println("\nInformación de la guitarra:");
        System.out.println(guitarraDefault.getInfo());

        System.out.println("\nInformación de la batería:");
        System.out.println(bateriaSinCompra.getInfo());

        // Calcular cuántos años tiene cada instrumento
        System.out.println("\nEdad de la guitarra: " + guitarraDefault.getAnyos() + " años");
        System.out.println("Edad de la batería: " + bateriaSinCompra.getAnyos() + " años");

        // Comprobar si los instrumentos están disponibles
        System.out.println("\nDisponibilidad de la guitarra: " + 
                           (guitarraDefault.estaDisponible() ? "Disponible" : "No disponible"));
        System.out.println("Disponibilidad de la batería: " + 
                           (bateriaSinCompra.estaDisponible() ? "Disponible" : "No disponible"));

        // Simular el sonido de cada instrumento
        System.out.println("\nSonido de la guitarra:");
        guitarraDefault.sonar();

        System.out.println("\nSonido de la batería:");
        bateriaSinCompra.sonar();

    }
}