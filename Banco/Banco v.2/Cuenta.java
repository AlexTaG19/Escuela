

public class Cuenta {

	private String nombre;
	private String cuenta;
	public double saldo;

	public Cuenta() {

  }

	public Cuenta(String nombre, String cuenta, double saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

	@Override
    public String toString() {
    	return "Titular: " + nombre + "\nCuenta: " + cuenta;
    }

	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	public void retirar(double cantidad) throws Exception {

		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");

		if (saldo < cantidad)
			throw new Exception("No se hay suficiente saldo");

		saldo = saldo - cantidad;
	}
}
