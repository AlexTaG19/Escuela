package TiendaInstrumentos.src;

import java.time.LocalDate;

public abstract class Instrumento {

    private double precio;
    private String marca;
    private String modelo;
    private String dniComprador;
    private String nombreComprador;
    private LocalDate fechaCompra;
    private LocalDate fechaFabricacion;

    static int sock = 0;

    public Instrumento(double precio, String marca, String modelo, String dniComprador, String nombreComprador,
            LocalDate fechaCompra, LocalDate fechaFabricacion) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.dniComprador = dniComprador;
        this.nombreComprador = nombreComprador;
        this.fechaCompra = fechaCompra;
        this.fechaFabricacion = fechaFabricacion;
        sock++;
    }

    public Instrumentodefault(double precio, String marca, String modelo, String dniComprador, String nombreComprador,
     LocalDate fechaCompra, LocalDate fechaFabricacion) {
 this.precio = 100;
this.marca = "royal";
this.modelo = "royal-23";
this.dniComprador = "12345678q";
this.nombreComprador = "Pedro";
this.fechaCompra = 2022-01-01;
this.fechaFabricacion = 2021-03-21;
sock++;
}

    public void getInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("Dni comprador: " + dniComprador);
        System.out.println("Nombre comprador: " + nombreComprador);
        System.out.println("Fecha compra: " + fechaCompra);
        System.out.println("Fecha fabricacion: " + fechaFabricacion);
        System.out.println("Cantidad: " + sock);
        System.out.print(estaDisponible(fechaCompra));

    };

    public void getAnyos() {
        int anyos = LocalDate.now().getYear() - fechaFabricacion.getYear();
        System.out.println("El instrumento se fabrico: " + anyos + " años atrás");

    };

    public void estaDisponible(LocalDate fechaCompra) {
        if (fechaCompra == null) {
            System.out.println("El instrumento no esta disponible");
        } else {
            System.out.println("El instrumento esta disponible");
        }
    };

    public void sonar() {
        System.out.println("Estoy sonando");
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDniComprador() {
        return dniComprador;
    }

    public void setDniComprador(String dniComprador) {
        this.dniComprador = dniComprador;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public class guitarra extends Instrumento {

        private int cuerdas;
        private int tipo;

        public guitarra(double precio, String marca, String modelo, String dniComprador, String nombreComprador,
                LocalDate fechaCompra, LocalDate fechaFabricacion, int cuerdas, int tipo) {
            super(precio, marca, modelo, dniComprador, nombreComprador, fechaCompra, fechaFabricacion);
            this.cuerdas = cuerdas;
            this.tipo = tipo;
        }

        @Override
        public void sonar() {
            System.out.println("Estoy sonando una guitarra");
        }

    }

    public class bateria extends Instrumento {

        private int numeroTambores;
        private int numeroPlatos;

        public bateria(double precio, String marca, String modelo, String dniComprador, String nombreComprador,
                LocalDate fechaCompra, LocalDate fechaFabricacion, int numeroTambores, int numeroPlatos) {
            super(precio, marca, modelo, dniComprador, nombreComprador, fechaCompra, fechaFabricacion);
            this.numeroTambores = numeroTambores;
            this.numeroPlatos = numeroPlatos;
        }

        @Override
        public void sonar() {
            System.out.println("Estoy sonando una bateria");
        }

    }
}