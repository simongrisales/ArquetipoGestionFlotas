import controllers.ConductorController;
import controllers.VehiculoController;
import models.Conductor;
import models.Vehiculo;
import views.ConductorView;
import views.VehiculoView;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de vehiculo y conductor
        Vehiculo vehiculo1 = new Vehiculo("V001", "Furgoneta", "Ford", "Zona Norte", 65.0, "Activo");
        Conductor conductor1 = new Conductor("1", "Juan Pérez", "ABC123", 30, "Activo");

        // Crear vistas y controladores
        VehiculoView vehiculoView = new VehiculoView();
        ConductorView conductorView = new ConductorView();

        VehiculoController vehiculoController = new VehiculoController(vehiculo1, vehiculoView);
        ConductorController conductorController = new ConductorController(conductor1, conductorView);

        // Mostrar información de vehículo y conductor
        vehiculoController.mostrarVehiculo();
        conductorController.mostrarConductor();
    }

    // **Principio SOLID:**
    // 5. **Interface Segregation Principle (ISP)**:
    // Aunque no estamos usando interfaces explícitas en este ejemplo, si más adelante se agregan interfaces para definir comportamientos
    // (como una interfaz para el controlador o la vista), estas deben ser específicas para evitar que las clases implementen métodos
    // que no necesitan, asegurando una mayor flexibilidad y menor acoplamiento.
}