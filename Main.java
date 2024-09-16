// Clase principal
public class Main {
    public static void main(String[] args) {
        Vehiculo miCarro = new Carro("Toyota");
        Vehiculo miBicicleta = new Bicicleta("BMX");
        Vehiculo miAvion = new Avion("Boeing");

        miCarro.conducir();
        miCarro.tipoDeVehiculo();
        miCarro.frenar();

        miBicicleta.conducir();
        miBicicleta.tipoDeVehiculo();
        miBicicleta.frenar();

        miAvion.conducir();
        miAvion.tipoDeVehiculo();
        miAvion.frenar();
    }
}
