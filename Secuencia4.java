/*
 * Esta es la cuarta secuencia, esta secuencia sigue el siguiente patrón:
 * 1, 2, 4, 7, 11, 16.
 * 1, 2, 3, 4, 5,  6.
 * 
 * El patrón consiste en lo siguiente:
 * La suma de la posición (i) de la secuencia mas la posición actual es el
 * número siguiente.
 * 
 * 1: posición 1
 * 2: posición 2
 * 4: posición 3
 * 7: posición 4
 * 11: posición 5
 * 16: posición 6
 * 
 * Como se puede ver claramente en la demostración anterior, es exactamente el
 * mismo patrón.
 */

// Se utiliza para obtener los datos del usuario
import java.util.Scanner;

public class Secuencia4 {

    public static void main (String[] args) {
        // Se utiliza para obtener datos del usuario mediante el input.
        Scanner obtenerDatos = new Scanner(System.in);
        System.out.println("Inserta el límite de la secuencia:");
        int limiteSecuencia = obtenerDatos.nextInt();

        // Se utiliza para guardar el número actual de la secuencia.
        int a = 1;

        System.out.println("Estos son los elementos de la secuencia:");
        // Evalúa cada elemento de la secuencia
        for (int i = 1; i <= limiteSecuencia;i++) {
            System.out.println(a);
            a = a + i;
        }

    }

}