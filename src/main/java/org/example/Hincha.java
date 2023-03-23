package org.example;

public abstract class Hincha {

    private String cedula;
    private String nombre;
    private String correo;
    private final double iva = 0.19;

    public abstract double calcularValorNeto(Integer cantidad);
    public abstract double calcularDescuentoTribuna();

    public double obtenerDescuentoFecha(Integer dia){
        if(dia == 1){
            return 0.05;
        }
        else if (dia == 2){
            return 0.02;
        }
        else if (dia ==3){
            return 0.015;
        }
        else {
            return 0.01;
        }
    }

    public double getIva() {
        return iva;
    }
}
