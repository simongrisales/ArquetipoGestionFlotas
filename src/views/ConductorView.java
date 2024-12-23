package views;
import models.Conductor;

public class ConductorView {
    public void mostrarConductor(Conductor conductor) {
        System.out.println("ID: " + conductor.getId());
        System.out.println("Nombre: " + conductor.getNombre());
        System.out.println("Licencia: " + conductor.getLicencia());
        System.out.println("Edad: " + conductor.getEdad());
        System.out.println("Estado: " + conductor.getEstado());
    }

    /* Principio S (Responsabilidad Única):
   La clase ConductorView tiene la única responsabilidad de mostrar los detalles del conductor,
   sin involucrarse en la lógica para gestionar o modificar los datos del conductor.*/
}
