// Subclase Bicicleta
public class Bicicleta extends Vehiculo {
    public Bicicleta(String nombre) {
        super(nombre);
    }

    @Override
    public void tipoDeVehiculo() {
        System.out.println("Esta es una bicicleta.");
    }

    @Override
    public void conducir() {
        System.out.println(nombre + " está siendo pedaleada.");
    }
}