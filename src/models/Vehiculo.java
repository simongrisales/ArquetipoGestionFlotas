package models;

public class Vehiculo {
    private String id;
    private String modelo;
    private String marca;
    private String ubicacion;
    private double velocidad;
    private String status;

    public Vehiculo(String id, String modelo, String marca, String ubicacion, double velocidad, String
            status) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ubicacion = ubicacion;
        this.velocidad = velocidad;
        this.status = status;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /* Principio S (Responsabilidad Única):
    Esta clase cumple con el principio de responsabilidad única, ya que se encarga únicamente de modelar
    los datos de un vehículo.*/

}
