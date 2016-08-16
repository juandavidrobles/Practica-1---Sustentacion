/*

 */
package sustentacion;

/**
 *
 * @author JUAN DAVID
 */
public class inventario {
    
    private int i=0, c=0, flag=0, c2=0;
    private String[] nombres= new String[20];
    private int[] cantidades= new int[20];
    private int[] valores= new int[20];
    private int[] vendidos= new int[20];
    private int[] ventasProducto= new int[20];
    private int ventasTotales=0;
    
    
    public void agregarProducto(String nombre, int cantidad, int valor){
        nombres[i]=nombre;
        cantidades[i]=cantidad;
        valores[i]=valor;
        i++;
    }
    
    public void buscarProducto(String nombre){
        flag=0;
        for(c=0;c<i;c++){
            if(nombres[c].equals(nombre)){
                System.out.println("Producto: "+nombres[c]
                        + "\t\tCantidad: "+cantidades[c]
                        + "\tValor: "+valores[c]);
                //System.out.println("Cantidad: "+cantidades[c]);
                //System.out.println("valor: "+valores[c]);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("El objeto no se encuentra disponible");
        }
    }
    
    public void eliminarProducto(String nombre){
        for(c=0;c<i;c++){
            if(nombres[c].equals(nombre)){
                this.nombres[c]="Vacío";
                this.cantidades[c]=0;
                this.valores[c]=0;
                this.ventasProducto[c]=0;
                System.out.println("Entrada "+nombre+" borrada");
            }
        }
    }
    
    public void mostrarInventario(){
        c2=1;
        for(c=0;c<i;c++){
            if(nombres[c].equals("Vacío")){
                
            } else{
                System.out.println(c2+". Nombre: "+nombres[c]+"\t"
                        +"Cantidad: "+cantidades[c]+"\t"
                        + "Valor: "+valores[c]);
                c2++;
            }
            
        }
    }
    
    public void realizarVentas(String nombre, int cantidad){
        for(c=0;c<i;c++){
            if(nombres[c].equals(nombre)){
                /*System.out.println("Producto: "+nombres[c]);
                System.out.println("Cantidad: "+cantidades[c]);
                System.out.println("valor: "+valores[c]);
                flag=1;*/
                if(cantidades[c]>=cantidad){
                    cantidades[c]=cantidades[c]-cantidad;
                    vendidos[c]=vendidos[c]+cantidad;
                    ventasProducto[c]=ventasProducto[c]+(vendidos[c]*valores[c]);
                    ventasTotales=ventasTotales+ ventasProducto[c];
                    System.out.println("Venta exitosa");
                }else{
                    System.out.println("No hay suficientes productos. "
                            + "Disponibles: "+cantidades[c]);
                }
                
                break;
            }
        }
    }
    
    public void mostrarGanancias(){
        c2=1;
        for(c=0;c<i;c++){
            if(nombres[c].equals("Vacío")){
                
            } else{
                System.out.println(c2+". Nombre: "+nombres[c]+"\t"
                        +"Vendidos: "+vendidos[c]+"\t"
                        + "Ventas del producto: "+ventasProducto[c]);
                c2++;
            }
            
        }
        System.out.println("VENTAS TOTALES: $"+ventasTotales);
    }
    
}
