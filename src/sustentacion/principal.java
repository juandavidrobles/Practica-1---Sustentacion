/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

import java.util.Scanner;

/**
 *
 * @author JUAN DAVID
 */
public class principal {
    public static void main(String[] args) {
        /*inventario miInventario=new inventario();
        miInventario.agregarProducto("osito", 10, 5000);
        miInventario.agregarProducto("perrito", 30, 6000);
        miInventario.buscarProducto("osito");
        miInventario.eliminarProducto("osito");
        miInventario.buscarProducto("osito");
        miInventario.mostrarInventario();
        miInventario.realizarVentas("perrito", 20);
        miInventario.buscarProducto("perrito");*/
        int opcion=0;
        Scanner lector= new Scanner(System.in);
        String auxNombre;
        int auxCantidad, auxValor, auxVenta;
        inventario miInventario=new inventario();
        
        while(opcion!=7){
            System.out.println("\n- - - - - Menu - - - - -");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Realizar ventas");
            System.out.println("6. Mostrar ganancias");
            System.out.println("7. Salir\n");
            
            System.out.print("Ingrese opcion: ");
            opcion=lector.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    auxNombre=lector.next();
                    System.out.print("Ingrese la cantidad: ");
                    auxCantidad=lector.nextInt();
                    System.out.print("Ingrese el valor: ");
                    auxValor=lector.nextInt();
                    miInventario.agregarProducto(auxNombre, auxCantidad, auxValor);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto: ");
                    auxNombre=lector.next();
                    miInventario.buscarProducto(auxNombre);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto: ");
                    auxNombre=lector.next();
                    miInventario.eliminarProducto(auxNombre);
                    break;
                case 4:
                    miInventario.mostrarInventario();
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del producto: ");
                    auxNombre=lector.next();
                    System.out.print("Cantidad a vender: ");
                    auxVenta=lector.nextInt();
                    miInventario.realizarVentas(auxNombre, auxVenta);
                    break;
                case 6:
                    miInventario.mostrarGanancias();
                    break;
                default:
                    break;
                    
            }
        }
        
        
        
        
    }
}