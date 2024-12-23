package controllers;
import models.Vehiculo;
import views.VehiculoView;

public class VehiculoController {
    private Vehiculo vehiculo;
    private VehiculoView vehiculoView;

    public VehiculoController(Vehiculo vehiculo, VehiculoView vehiculoView) {
        this.vehiculo = vehiculo;
        this.vehiculoView = vehiculoView;
    }

    public void mostrarVehiculo() {
        vehiculoView.mostrarVehiculo(vehiculo);
    }

    /* Principio S (Responsabilidad Única):
    Esta clase cumple con el principio de responsabilidad única,
    ya que su responsabilidad es gestionar la lógica de interacción entre el modelo y la vista.*/

    /* Principio L (Inversión de Dependencias):
    El controlador depende de abstracciones como `Vehículo` y `VehiculoView`, en lugar de clases concretas.
    Esto permite una mayor flexibilidad y escalabilidad, ya que facilita la modificación y expansión del sistema
    sin depender de implementaciones específicas.*/

}
