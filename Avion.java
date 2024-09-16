// Subclase Avión
public class Avion extends Vehiculo {
    public Avion(String nombre) {
        super(nombre);
    }

    @Override
    public void tipoDeVehiculo() {
        System.out.println("Este es un avión.");
    }

    @Override
    public void conducir() {
        System.out.println(nombre + " está volando.");
    }
}
