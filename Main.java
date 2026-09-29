import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);
 
        // Entrada de datos
        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = teclado.nextLine();
 
        System.out.print("Ingrese el valor de la compra: $");
        double compra = teclado.nextDouble();
 
        // Decisión: el orden va de mayor a menor
        double descuento;
 
        if (compra >= 300000) {
            descuento = 20;
        } else if (compra >= 200000) {
            descuento = 15;
        } else if (compra >= 100000) {
            descuento = 10;
        } else {
            descuento = 0;
        }
 
        // Cálculos
        double valorDescontado = compra * descuento / 100;
        double totalPagar = compra - valorDescontado;
 
        // Resultado
        System.out.println();
        System.out.println("================================");
        System.out.println("       TIENDA TECNOLÓGICA");
        System.out.println("================================");
        System.out.println();
        System.out.println("Cliente: " + cliente);
        System.out.printf("Compra: $%.0f%n", compra);
        System.out.printf("Descuento aplicado: %.0f%%%n", descuento);
        System.out.printf("Valor descontado: $%.0f%n", valorDescontado);
        System.out.printf("Total a pagar: $%.0f%n", totalPagar);
        System.out.println();
        System.out.println("¡Gracias por su compra!");
        System.out.println("================================");
 
        teclado.close();
    }
}
 