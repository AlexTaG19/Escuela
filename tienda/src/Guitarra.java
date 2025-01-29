package tienda.src;

public class Guitarra {

    public enum Marca {
        Gibson, Stratocaster, Ibanez, Yamaha;

    }

    private Marca marca;
    private String modelo;
    private double precio;
    private int numeroSerie;
    private boolean disponible;
    private int stock;

    public static int stock(int numeroSerie) {
        return numeroSerie++;
    }

    public Guitarra() {
        this.marca = Marca.Gibson;
        this.modelo = "Gibson Les Paul";
        this.precio = 1000.0;
        this.numeroSerie = 1;
        this.disponible = true;
        stock++;
    }

    public Guitarra(boolean disponible, Marca marca, String modelo, int numeroSerie, double precio) {
        this.disponible = true;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.precio = precio;
        stock++;
    }

    public Enum getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void getinfo() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("Número de serie: " + numeroSerie);
        System.out.println("Disponible: " + disponible);

    }

    public boolean disponible() {
        return disponible;
    }

    public void tocar() {
        System.out.println("Soy una " + marca + " " + modelo + " y sueno así de guay");
    }

    public int getStock() {
        return stock;
    }

}
