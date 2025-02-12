package tiendaInstrumentos.src;

import java.time.LocalDate;

import tienda.src.Guitarra.Marca;

/**
 * Clase que representa una guitarra.
 */
public class Guitarra extends Instrumento {
    private String tipo;
    private int numeroCuerdas;

    /**
     * Constructor por defecto.
     */
    public Guitarra() {
        super();
        this.tipo = "acústica";
        this.numeroCuerdas = 6;
    }

    /**
     * Constructor con todos los atributos.
     */
    public Guitarra(double precio, String marca, String modelo, String dniComprador, 
                    String nombreComprador, LocalDate fechaCompra, LocalDate fechaFabricacion,
                    String tipo, int numeroCuerdas) {
        super(precio, marca, modelo, dniComprador, nombreComprador, fechaCompra, fechaFabricacion);
        this.tipo = tipo;
        this.numeroCuerdas = numeroCuerdas;
    }

    /**
     * Constructor sin datos de compra.
     */
    public Guitarra(double precio, String marca, String modelo, LocalDate fechaFabricacion,
                    String tipo, int numeroCuerdas) {
        super(precio, marca, modelo, fechaFabricacion);
        this.tipo = tipo;
        this.numeroCuerdas = numeroCuerdas;
    }

    /**
     * Simula el sonido de la guitarra.
     */
    @Override
    public void sonar() {
        System.out.println("Soy una guitarra " + tipo + " con " + numeroCuerdas + 
                           " cuerdas y sueno así de guay");
    }

    /**
     * @return String return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return int return the numeroCuerdas
     */
    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    /**
     * @param numeroCuerdas the numeroCuerdas to set
     */
    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

}