
import java.util.Scanner;

public class Caja {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double valorProducto = 0.0;
        double IVA = 0.19;
        String categoria;
        double valorTotal = 0.0;
        int productosPremium = 0;
        int totalProductos = 0;
        boolean continuar = true;
        double porcentajePremium = 0.0;
        String respuesta ;
    
        do {
            System.out.println("Dame el valor del producto");
            valorProducto = leer.nextInt();
            System.out.println("Que categoría es?");
            categoria = leer.next();
            if (categoria.equals("premium")) {
                productosPremium = productosPremium + 1;
                totalProductos = totalProductos + 1;

            } else {
                totalProductos = totalProductos + 1;

            }
            valorTotal = valorTotal + valorProducto;

            System.out.println("Desea continuar? Si o No?");
            respuesta = leer.next();
            if (respuesta.equals("no")){
                continuar = false;
            }
        } while (continuar);
if (valorTotal > 100000) {
    valorTotal = valorTotal - (valorTotal * 0.10);
}

valorTotal = valorTotal + (valorTotal * IVA);
porcentajePremium = productosPremium / totalProductos;
System.out.println("El valor total a pagar es: " + valorTotal);
System.out.println("El porcentaje de productos premium es: " + porcentajePremium);

    }
}
