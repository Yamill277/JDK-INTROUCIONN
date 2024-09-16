//Subclase Carro
public class Carro extends Vehiculo {
    public Carro(String nombre) {
        super(nombre);
    }

    @Override
    public void tipoDeVehiculo() {
        System.out.println("Este es un carro.");
    }

    @Override
    public void conducir() {
        System.out.println(nombre + " está siendo conducido.");
    }
}