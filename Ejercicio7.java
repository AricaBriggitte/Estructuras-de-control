package ejercicio7;
/**
 * @author [Arica Pérez Briggitte Ana]
 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int numero;
            int cantidad = 0;
            int suma = 0;
            
            System.out.println("Ingrese números positivos (ingrese un número negativo para terminar):");
            do {
                numero = teclado.nextInt();
                if (numero >= 0) {
                    suma += numero;
                    cantidad++;
                }
            } while (numero >= 0);
            
            System.out.println("Cantidad de números ingresados: " + cantidad);
            System.out.println("Suma total: " + suma);
        }
    }
}
