/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ClienteControlador;
import Controlador.FacturaControlador;
import Modelo.Factura;
import Modelo.Producto;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class FacturaVista {

    private FacturaControlador FacturaControlador;
    private ClienteControlador ClienteControlador;
    private Scanner teclado;
    private SimpleDateFormat FormatoFecha;
    public static String Formato = "dd-MM-yyyy HH:mm";
    
    public FacturaVista(FacturaControlador FacturaControlador){
        this.teclado = new Scanner(System.in);
        this.FacturaControlador = new FacturaControlador();
        this.FacturaControlador = FacturaControlador;
    }

    public FacturaVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void menu(){
        int opcion = 0;
        do{
            System.out.println("\nGestión de Factura");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar/Leer");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar/Imprimir");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: 
                    this.crear(); 
                break;
                case 2: 
                    this.actualizar(); 
                break;
                case 3: 
                    this.buscar(); 
                break;
                case 4: 
                    this.eliminar(); 
                break;
                case 5: 
                    System.out.println("Listado de Factura: ");
                    FacturaControlador.imprimir(); 
                break;
            }
        }while(opcion<6);
    }

    public void crear() {
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Producto: ");
        String producto = teclado.next();
        System.out.println("Cantidad: ");
        String cantidad = teclado.next();
        System.out.println("Valor: ");
        String valor = teclado.next();
        boolean resultado = FacturaControlador.crear(producto, cantidad, valor );
        System.out.println("Factura creado: " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar");
        System.out.println("Producto: ");
        String producto = teclado.next();
        System.out.println("Cantidad: ");
        String cantidad = teclado.next();
        System.out.println("Valor: ");
        String valor = teclado.next();
        boolean resultado = FacturaControlador.actualizar(producto, cantidad, valor);
        System.out.println("Factura actualizado: " + resultado);
    }
    public void eliminar(){
        System.out.println("Eliminar Factura");
        System.out.println("Producto: ");
        String cedula = teclado.next();
        boolean resultado = FacturaControlador.eliminar(cedula);
        System.out.println("Factura eliminado: " + resultado);
    }
    public Factura buscar(){
        System.out.println("Buscar Factura");
        System.out.println("Cedula: ");
        String cedula = teclado.next();
        Factura Factura = FacturaControlador.buscar(cedula);
        System.out.println(Factura);
        return null;
    }
    public void imprimir(){ 
        for (Factura Factura: FacturaControlador.getListaFactura()) {
            System.out.println(Factura);
            this.imprimirCliente(Factura);
        }
    }
    
    public void asignarSeleccionado(Factura Factura) {
        FacturaControlador.setSeleccionado(Factura);
    }
    public FacturaControlador getFacturaControlador() {
        return FacturaControlador;
    }

    public void setFacturaControlador(FacturaControlador FacturaControlador) {
        this.FacturaControlador = FacturaControlador;
    }

    private void imprimirCliente(Factura Factura) {
        for (Producto Producto : Factura.getListaProducto()) {
            System.out.println(Producto);
        }
    }

    public void asignarSelecionado(Factura Factura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
