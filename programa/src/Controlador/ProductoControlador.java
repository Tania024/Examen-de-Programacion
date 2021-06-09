/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ProductoControlador {
    private List<Producto> listaProducto;
    private Producto seleccionado;
    
    public ProductoControlador(){
        listaProducto = new ArrayList();
        seleccionado = null;
    }
    public long generarId(){
        if(listaProducto.size() > 0) { 
            return listaProducto.get(listaProducto.size() -1 ).getId() + 1; 
        }else {
            return 1; 
        }
    }
    
    public boolean crear(String descripcion, String precio_unitario, String nombre) {
        Producto Producto= new Producto( descripcion, precio_unitario, nombre);
        return this.listaProducto.add(Producto);
    }   
    
    public boolean actualizar(String descripcion, String precio_unitario, String nombre) {
        Producto Producto = this.buscar(descripcion);
        if(Producto != null){
            int posicion = listaProducto.indexOf(Producto);
            Producto.setprecio_unitario(precio_unitario);
            Producto.setnombre(nombre);
            listaProducto.set(posicion, Producto);
            return true;
        }
        return false;
    }
        
    public Producto buscar(String descripcion) {
        for (Producto Producto : listaProducto) {
            if(Producto.getdescripcion().equals(descripcion)){
                return Producto;
            }
        }
        return null;
    }

    public boolean eliminar(String descripcion) {
        Producto Producto= this.buscar(descripcion);
        if(Producto != null) {
            Producto.getPropietario().getListaProducto().remove(Producto);
            return listaProducto.remove(Producto);
        }
        return false;
    }

    public Iterable<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setSeleccionado(Producto Producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
