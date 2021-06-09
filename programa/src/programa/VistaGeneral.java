/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import Modelo.Cliente;
import Modelo.Factura;
import Vista.ClienteVista;
import Vista.FacturaVista;
import Vista.ProductoVista;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
class VistaGeneral {
    
    private ClienteVista ClienteVista;
    private FacturaVista FacturaVista;
    private ProductoVista ProductoVista;
    private Scanner teclado;

    public VistaGeneral() {
        FacturaVista = new FacturaVista();
        ClienteVista = new ClienteVista(FacturaVista.getFacturaControlador()); 
        ProductoVista = new ProductoVista(FacturaVista.getFacturaControlador());
        teclado = new Scanner(System.in);
    }

    void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            int opcion = 0;
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Factura");
            System.out.println("2. Cliente");
            System.out.println("3. Producto");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: FacturaVista.menu(); break;
                case 2: this.Cliente(); break;
                case 3: this.Producto(); break;
            }
        } while (opcion < 4);
    }
    public void Cliente() {
        System.out.println("Seleccione una factura para gestionar los Clientes");
        Factura Factura = FacturaVista.buscar();
        if(Factura != null){ 
            FacturaVista.asignarSelecionado(Factura);
            ClienteVista.menu();
        }else {
            System.out.println("No exite la factura");
            this.Cliente();
        }
    }
    public void Producto(){
        System.out.println("Seleccione una propietario para gestionar los productos");
        Cliente Cliente = ClienteVista.buscar();
        if(Cliente != null){ 
            ClienteVista.asignarSeleccionado(Cliente);
            ProductoVista.menu();
        }else {
            System.out.println("No exite la factura");
            this.Producto();
        }
    }
}
