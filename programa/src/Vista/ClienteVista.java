/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ClienteControlador;
import Controlador.FacturaControlador;
import Modelo.Cliente;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ClienteVista {
    
    private ClienteControlador ClienteControlador;
    private Scanner teclado;

    public ClienteVista() {
        ClienteControlador = new ClienteControlador();
        teclado = new Scanner(System.in);
    }

    public ClienteVista(FacturaControlador facturaControlador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n Gestion Cliente");
            System.out.println("1. Crear");
            System.out.println("2. Actaulizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.actualizar();break;
                case 3: this.buscar();break;
                case 4: this.eliminar();break; 
            }
        } while (opcion < 6);
    }

    private void crear() {
        System.out.println("Ingresar los siguientes datos:");
        System.out.println("Id");
        long id = teclado.nextLong();
        System.out.println("Nombre");
        String nombre = teclado.next();
        System.out.println("Apellido: ");
        String apellido = teclado.next();
        System.out.println("Cedula: ");
        String cedula = teclado.next();
        System.out.println("Pago: ");
        double pago = teclado.nextDouble();
        boolean resultado = ClienteControlador.crear(id, nombre);
        System.out.println("Creado = " + resultado);

    }

    private void actualizar() {
        System.out.println("Actualizar");
        System.out.println("Cedula: ");
        String cedula = teclado.next();
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        System.out.println("Apellido: ");
        String apellido = teclado.next();
        System.out.println("Pago: ");
        double pago = teclado.nextDouble();        
        boolean resultado = ClienteControlador.actualizar(cedula, nombre, apellido, pago );
        System.out.println("Cliente actualizado: " + resultado);
    
    }

    public Cliente buscar() {
        System.out.println("Buscar Cliente");
        System.out.println("Cedula: ");
        String cedula = teclado.next();
        Cliente Cliente = ClienteControlador.buscar(cedula);
        System.out.println(Cliente);
        return Cliente;
    }

    private Cliente eliminar() {
        System.out.println("Eliminar Cliente");
        System.out.println("Cedula: ");
        String cedula = teclado.next();
        boolean resultado = ClienteControlador.eliminar(cedula);
        System.out.println("Cliente eliminado: " + resultado);        
        return null;
    }
    public void asignarSeleccionado(Cliente Cliente) {
        ClienteControlador.setSeleccionado(Cliente);
    }
    public ClienteControlador getClienteControlador() {
        return ClienteControlador;
    }

    public void setClienteControlador(ClienteControlador ClienteControlador) {
        this.ClienteControlador = ClienteControlador;
    }
}
