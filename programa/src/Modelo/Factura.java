/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Factura {
    private String producto;
    private String cantidad;
    private String valor;
    private Date fecha;
    private List<Producto> listaProducto;

    public Factura(String producto, String cantidad, String valor, Date fecha, List<Producto> listaProducto) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.valor = valor;
        this.fecha = fecha;
        this.listaProducto = listaProducto;
    }

    public Factura(String producto, String cantidad, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public String getProducto() {
        return producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getValor() {
        return valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    @Override
    public String toString() {
        return "Factura{" + "producto=" + producto + ", cantidad=" + cantidad + ", valor=" + valor + ", fecha=" + fecha + ", listaProducto=" + listaProducto + '}';
    }

    public Object getListaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getCedula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setApellido(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
