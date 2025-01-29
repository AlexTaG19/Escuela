package tienda.src;

import tienda.src.Guitarra.Marca;

public class Main {
    public static void main(String[] args) {

        Guitarra guitarra = new Guitarra();
        guitarra.getinfo();
        guitarra.tocar();
        System.out.println("Stock: " + guitarra.getStock());

        Guitarra guitarras2 = new Guitarra(true, Marca.Stratocaster, "Stratocaster", 2, 1000.0);
        guitarras2.getinfo();
        guitarras2.tocar();
        System.out.println("Stock: " + guitarras2.getStock());

    }
}
