// Clase padre
public abstract class Vehiculo implements Conducible {
    String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto
    public abstract void tipoDeVehiculo();

    // Método concreto
    public void frenar() {
        System.out.println(nombre + " está frenando.");
    }
}

