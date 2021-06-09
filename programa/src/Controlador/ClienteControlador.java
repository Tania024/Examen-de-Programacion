/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Factura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ClienteControlador {
    private List<Cliente> datos;
    private Cliente seleccionado;
    private Cliente Cliente;
    
    public ClienteControlador() {
        datos = new ArrayList<Cliente>();
        seleccionado = null;
    }
    
    public boolean crear(long id, String nombre, String apellido, String cedula,double pago) {
        Cliente cliente = new Cliente(id, nombre, apellido, cedula,pago);
        return datos.add(cliente);  
    }
    
    public boolean crear(long id, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean crear(long id, String nombre, String apellido, String cedula,double pago,Factura Factura) {
        Cliente Cliente = new Cliente(id, nombre, apellido, cedula, pago, Factura);
        Factura.getListaCliente().equals(Cliente); 
        return datos.add(Cliente); 
    }
    
    public Cliente buscar(String cedula){
        for (Cliente cliente : datos) {
            if(cliente.getCedula().equals(cedula) == true){ 
                return cliente;
            }
        }
        return null; 
    }
    
    public boolean actualizar(String cedula, String nombre, String apellido, double pago) {
        Cliente Cliente = this.buscar(cedula); // busco al cliente con la cedula
        if(Cliente != null) { // Comprobar que el cliente exista
            int posicion = datos.indexOf(Cliente); // obtengo la posición del cliente actual
            Cliente.setNombre(nombre); // Actualizo el nomnbre
            Cliente.setApellido(apellido); // Actualizo el apellido
            Cliente.setPago(pago);
            datos.set(posicion, Cliente); // actualizo en base a la posicion del cliente.
            return true;
        }
        return false;
    }

    public boolean eliminar(String cedula) {
        Cliente Cliente = this.buscar(cedula);
        if(Cliente != null){
            Cliente.getFactura().getListaCliente().equals(Cliente);
            return datos.remove(Cliente);
        }
        return false;
    }

    public void setSeleccionado(Cliente Cliente) {
     this.Cliente = Cliente;
    }


}
