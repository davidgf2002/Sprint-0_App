package com.example.dgomfer_upv.peticionariorest;

public class Medida {

    //Atributos
    private float valorMedida;
    private String fechaMedida;
    private String nombreSensor;
    private Coordenada coordenada;

    //Constructor
    public Medida(float valorMedida, String fechaMedida, String nombreSensor, Coordenada coordenada) {
        this.valorMedida = valorMedida;
        this.fechaMedida = fechaMedida;
        this.nombreSensor = nombreSensor;
        this.coordenada = coordenada;
    }

    //Empty Constructor
    public Medida(){
    }



    //Getters and Setters
    public float getValorMedida() {
        return valorMedida;
    }

    public void setValorMedida(float valorMedida) {
        this.valorMedida = valorMedida;
    }

    public String getFechaMedida() {
        return fechaMedida;
    }

    public void setFechaMedida(String fechaMedida) {
        this.fechaMedida = fechaMedida;
    }

    public String getNombreSensor() {
        return nombreSensor;
    }

    public void setNombreSensor(String nombreSensor) {
        this.nombreSensor = nombreSensor;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }
}
