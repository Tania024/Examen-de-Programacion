/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Cliente {
    private long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private double pago;
    private Factura Factura;

    public Cliente(long id, String nombre, String apellido, String cedula, double pago, Factura Factura) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.pago = pago;
        this.Factura = Factura;
    }

    public Cliente(long id, String nombre, String apellido, String cedula, double pago) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public void setFactura(Factura Factura) {
        this.Factura = Factura;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public double getPago() {
        return pago;
    }

    public Factura getFactura() {
        return Factura;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", pago=" + pago + ", Factura=" + Factura + '}';
    }

}
