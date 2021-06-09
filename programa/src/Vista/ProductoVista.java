/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.FacturaControlador;
import Controlador.ProductoControlador;
import Modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ProductoVista {
        private ProductoControlador ProductoControlador;
    private FacturaControlador FacturaControlador;
    private Scanner teclado;

    public ProductoVista(FacturaControlador FacturaControlador) {
        this.FacturaControlador = FacturaControlador;
            ProductoControlador ProductoControlador = new ProductoControlador();
        teclado = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Gestión de Producto");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Imprimir");
            System.out.println("6. Salir");
            opcion  = teclado.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.actualizar(); break;
                case 3: this.buscar(); break;
                case 4: this.eliminar(); break;
                case 5: this.imprimir(); break;
            }
        } while (opcion < 6);
    }
    public void crear(){
        System.out.println("Crear - Ingrese los datos:");
        System.out.println("Descripcion");
        String descripcion = teclado.next();
        System.out.println("Precio_unitario ");
        String precio_unitario = teclado.next();
        System.out.println("Nombre");
        String nombre = teclado.next();
        boolean resultado = ProductoControlador.crear(descripcion, precio_unitario, nombre);
        System.out.println("Creado = " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar - Ingrese los datos: ");
        System.out.println("Descripcion");
        String descripcion = teclado.next();
        System.out.println("Precio_unitario ");
        String precio_unitario = teclado.next();
        System.out.println("Nombre");
        String nombre = teclado.next();
        boolean resultado = ProductoControlador.actualizar(descripcion, precio_unitario, nombre);
        System.out.println("Actualizado = " + resultado);
    }
    public Producto buscar(){
        System.out.println("Ingresar la descripcion");
        String descripcion = teclado.next();
        Producto Producto = ProductoControlador.buscar(descripcion);
        System.out.println(Producto);
        return Producto;
    }
    public void eliminar(){
        System.out.println("Ingresar la descripcion");
        String descripcion = teclado.next();
        boolean resultado = ProductoControlador.eliminar(descripcion);
    }
    public void imprimir(){
        for (Producto Producto: ProductoControlador.getListaProducto()) {
            System.out.println(Producto);
        }
    }
    public void asignarSeleccionado(Producto Producto){
        ProductoControlador.setSeleccionado(Producto);
    }

    public ProductoControlador getProductoControlador() {
        return ProductoControlador;
    }

    public void setProductoControlador(ProductoControlador ProductoControlador) {
        this.ProductoControlador = ProductoControlador;
    }

    public FacturaControlador getFacturaControlador() {
        return FacturaControlador;
    }

    public void setFacturaControlador(FacturaControlador FacturaControlador) {
        this.FacturaControlador = FacturaControlador;
    }
}
