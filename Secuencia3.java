/*
 * Secuencia3. Esta clase representa la secuencia 3 de los problemas de informática
 * de la UAPA.
 * 
 * 1, 10, 2, 9, 3, 8,...N
 * 1, 2,  3, 4, 5, 6
 * I, P,  I, P, I, P
 * 
 * Como se puede ver los números relativos a posiciones impares 
 * incrementan y los pares decrementan.
 * 
 */

// Se ha importado para obtener datos del usuario.
import java.util.Scanner;
public class Secuencia3 {

    public static void main(String[] args) {

        // a va para los números impares, a va en incremento.
        int a = 1;
        // b va para los números pares, b va en decremento.
        int b = 10;

        Scanner obtenerDatos = new Scanner(System.in);
        System.out.println("Inserta el límite de la secuencia:");
        int limiteSecuencia = obtenerDatos.nextInt();
        System.out.println("\n");
        
        System.out.println("Estos son los valores de la secuencia:");
        for (int i = 1; i <= limiteSecuencia;i++) {

            if (i % 2 == 0) {
                System.out.println(b);
                b-=1;
            }

            else {
                System.out.println(a);
                a+=1;
            }
            
        }

    }

}