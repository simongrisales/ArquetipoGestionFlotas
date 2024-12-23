package models;

public class Conductor {
    private String id;
    private String nombre;
    private String licencia;
    private int edad;
    private String estado;

    public Conductor(String id, String nombre, String licencia, int edad, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.licencia = licencia;
        this.edad = edad;
        this.estado = estado;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    /* Principio S (Responsabilidad Única):
    La clase Conductor tiene la única responsabilidad de almacenar los datos del conductor, sin involucrarse en
    lógica de negocio.*/
}
