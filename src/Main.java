import controllers.ConductorController;
import controllers.VehiculoController;
import models.Conductor;
import models.Vehiculo;
import views.ConductorView;
import views.VehiculoView;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("MNV-218", "2008", "Renault", "Poblado", 180.0, "Activo");
        Conductor conductor1 = new Conductor("1234567890", "Simón Grisales", "B1", 17, "Activo");

        VehiculoView vehiculoView = new VehiculoView();
        ConductorView conductorView = new ConductorView();

        VehiculoController vehiculoController = new VehiculoController(vehiculo1, vehiculoView);
        ConductorController conductorController = new ConductorController(conductor1, conductorView);

        vehiculoController.mostrarVehiculo();
        conductorController.mostrarConductor();
    }

    /* Principio I (Segregación de Interfaces):
   Aunque no se utilizan interfaces explícitas en este ejemplo, si en el futuro se agregan, estas deben ser específicas
   para evitar que las clases implementen métodos innecesarios, promoviendo flexibilidad y menor acoplamiento.*/
}