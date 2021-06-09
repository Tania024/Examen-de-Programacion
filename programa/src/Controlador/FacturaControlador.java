/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Factura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class FacturaControlador {
    private List<Factura> listaFactura;
    private Factura seleccionado; // Guardar el Objeto que selecciona de la empresa
    
    public FacturaControlador(){
        listaFactura = new ArrayList();
        seleccionado = null;
    }
    
public boolean crear(String producto, String cantidad, String valor) {
        Factura Factura = new Factura(producto, cantidad, valor);
        return listaFactura.add(Factura);
    }

    public Factura buscar(String cedula) {
        for (Factura Factura : listaFactura) {
            if(Factura.getCedula().equals(cedula)){
                return Factura;
            }
        }
        return null;
    }
    
    public boolean actualizar(String cedula, String nombre, String apellido) {
        Factura Factura = this.cedula();
        if(Factura != null) {
            int posicion = listaFactura.indexOf(Factura);
            Factura.setNombre(nombre);
            listaFactura.set(posicion, Factura);
            Factura.setApellido(apellido);
            listaFactura.set(posicion, Factura);
            return true;
        }
        return false;
    }
    public boolean eliminar(String cedula) {
        Factura Factura = this.buscar(cedula);
        if(Factura != null) {
            return listaFactura.remove(Factura);
        }
        return false;
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura= listaFactura;
    }

    public Factura getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Factura seleccionado) {
        this.seleccionado = seleccionado;
    }

    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Factura cedula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
