package tiendaInstrumentos.src;

import java.time.LocalDate;

import tienda.src.Guitarra.Marca;

/**
 * Clase que representa una batería.
 */
public class Bateria extends Instrumento {
    private int numeroTambores;
    private int numeroPlatos;

    /**
     * Constructor por defecto.
     */
    public Bateria() {
        super();
        this.numeroTambores = 4;
        this.numeroPlatos = 3;
    }

    /**
     * Constructor con todos los atributos.
     */
    public Bateria(double precio, String marca, String modelo, String dniComprador, 
                   String nombreComprador, LocalDate fechaCompra, LocalDate fechaFabricacion,
                   int numeroTambores, int numeroPlatos) {
        super(precio, marca, modelo, dniComprador, nombreComprador, fechaCompra, fechaFabricacion);
        this.numeroTambores = numeroTambores;
        this.numeroPlatos = numeroPlatos;
    }

    /**
     * Constructor sin datos de compra.
     */
    public Bateria(double precio, String marca, String modelo, LocalDate fechaFabricacion,
                   int numeroTambores, int numeroPlatos) {
        super(precio, marca, modelo, fechaFabricacion);
        this.numeroTambores = numeroTambores;
        this.numeroPlatos = numeroPlatos;
    }

    /**
     * Simula el sonido de la batería.
     */
    @Override
    public void sonar() {
        System.out.println("Soy una batería con " + numeroTambores + " tambores y " + 
                           numeroPlatos + " platos y sueno así de chachi");
    }

    // Getters y setters específicos de Bateria

    /**
     * @return int return the numeroTambores
     */
    public int getNumeroTambores() {
        return numeroTambores;
    }

    /**
     * @param numeroTambores the numeroTambores to set
     */
    public void setNumeroTambores(int numeroTambores) {
        this.numeroTambores = numeroTambores;
    }

    /**
     * @return int return the numeroPlatos
     */
    public int getNumeroPlatos() {
        return numeroPlatos;
    }

    /**
     * @param numeroPlatos the numeroPlatos to set
     */
    public void setNumeroPlatos(int numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }

}
