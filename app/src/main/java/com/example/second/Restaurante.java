package com.example.second;

public class Restaurante {
    private String direccion;
    private Boolean estacionamiento;
    private Boolean fumar;
    private String horarios;
    private String nombre;
    private String tarjetas;
    private String telefono;
    private String tipoComida;
    private Boolean wifi;
    private String email;
    private String resumen;
  //  private String imagen;

    public Restaurante (){}

    public Restaurante(String direccion, Boolean estacionamiento, Boolean fumar, String horarios, String nombre,
                       String tarjetas, String telefono, String tipoComida, Boolean wifi, String email, String resumen) {
        this.direccion = direccion;
        this.estacionamiento = estacionamiento;
        this.fumar = fumar;
        this.horarios = horarios;
        this.nombre = nombre;
        this.tarjetas = tarjetas;
        this.telefono = telefono;
        this.tipoComida = tipoComida;
        this.wifi = wifi;
        this.email = email;
        this.resumen = resumen;
       // this.imagen = imagen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Boolean estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public Boolean getFumar() {
        return fumar;
    }

    public void setFumar(Boolean fumar) {
        this.fumar = fumar;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(String tarjetas) {
        this.tarjetas = tarjetas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    /*public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }*/

}

