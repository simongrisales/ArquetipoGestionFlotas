package controllers;
import models.Conductor;
import views.ConductorView;

public class ConductorController {
    private Conductor conductor;
    private ConductorView conductorView;

    public ConductorController(Conductor conductor, ConductorView conductorView) {
        this.conductor = conductor;
        this.conductorView = conductorView;
    }

    public void mostrarConductor() {
        conductorView.mostrarConductor(conductor);
    }

    /* Principio L (Inversión de Dependencias):
    El controlador no depende de clases concretas, sino de abstracciones como 'Conductor' y 'ConductorView'. Esto
    permite que el controlador sea más flexible y pueda trabajar con cualquier clase que implemente los comportamientos
    necesarios, sin estar atado a una implementación específica.*/

    /* Principio O (Abierto/Cerrado):
    La clase 'ConductorController' está diseñada para ser extendida, permitiendo agregar nuevas funcionalidades sin
    necesidad de modificar el código existente. Esto asegura que se puedan agregar nuevas características sin afectar
    lo que ya está funcionando.*/
}
