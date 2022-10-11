package com.example.dgomfer_upv.peticionariorest;
//Clase para crear objetos de tipo coordenada, [X,Y]
//Con el objetivo de posicionar las medidas en un futuro

public class Coordenada {

    //Atributos
    private float longitud;
    private float latitud;

    //Constructor
    public Coordenada(float x, float y) {
        this.longitud = x;
        this.latitud = y;
    }


    //Empty constructor
    public Coordenada(){
    }

    //Getters and Setters
    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }
}
