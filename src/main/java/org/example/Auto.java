package org.example;

public class Auto {

    private String Marca;
    private String Modelo;
    private int Anio;
    private Double Kilometraje;
    private String Estado;
    private double consumoKm;
    private String Placa;

    public Auto(String marca, String modelo, int anio, Double kilometraje, String estado, double consumoKm, String placa) {
        Marca = marca;
        Modelo = modelo;
        Anio = anio;
        Kilometraje = kilometraje;
        Estado = estado;
        this.consumoKm = consumoKm;
        Placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public Double getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        Kilometraje = kilometraje;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public double getConsumoKm() {
        return consumoKm;
    }

    public void setConsumoKm(double consumoKm) {
        this.consumoKm = consumoKm;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Anio=" + Anio +
                ", Kilometraje=" + Kilometraje +
                ", Estado='" + Estado + '\'' +
                ", consumoKm=" + consumoKm +
                ", Placa='" + Placa + '\'' +
                '}';
    }

    public void mostrardetalles(){
        System.out.println("Marca:" + Marca);
        System.out.println("Modelo:" + Modelo);
        System.out.println("Año:" +  Anio);
        System.out.println("Kilometraje:" + Kilometraje);
        System.out.println("Estado:" + Estado);
        System.out.println("Placa:" + Placa);
    }

    public void actualizarkm(double kmrecorridos){
        if (kmrecorridos > 0){
            Kilometraje += kmrecorridos;
            System.out.println("KM actualizado:" + Kilometraje);
        } else {
            System.out.println("KM invalido");
        }
    }

    public boolean antiguedad(){
        int anioActual = 2025;
        return (anioActual - Anio) > 15;
    }

    public boolean mantenimiento(){
        return Kilometraje > 100000;
    }

    public double consumoCombustible (double distanciakm){
        double consumo = distanciakm * consumoKm;
        System.out.println("El auto consume:" + consumo + distanciakm);
        return consumo;
    }

    public double combustibleRest(double distanciaKm, double combustibleAct){
        double consumo = consumoCombustible(distanciaKm);
        if (combustibleAct >= consumo){
            combustibleAct -= consumo;
            System.out.println("Cantidad Combustible:" + combustibleAct);
        } else {
            System.out.println("No hay suficiente combustible");
        }
        return combustibleAct;
    }

}
