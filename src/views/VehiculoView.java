package views;
import models.Vehiculo;

public class VehiculoView {
    public void mostrarVehiculo(Vehiculo vehiculo) {
        System.out.println("ID: " + vehiculo.getId());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Ubicación: " + vehiculo.getUbicacion());
        System.out.println("Velocidad: " + vehiculo.getVelocidad());
        System.out.println("Estado: " + vehiculo.getStatus());
    }
    /* Principio S (Responsabilidad Única):
   Esta clase cumple con el principio de responsabilidad única,
   ya que se encarga únicamente de mostrar los detalles del vehículo al usuario.*/
}
