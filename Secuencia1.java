// Secuancia: 1, 4, 3, 16, 5, 36, 7, 64,...,N

/*
El patrón consiste en hacer lo siguiente:
Si tomamos N como el límite, N establece hasta qué número se ejecutará la secuencia.

Si tomo la secuencia anterior, se puede notar el siguiente patrón:
Números impares imprimir como están, y los impares elevar al cuadrado.

1, 4, 3, 16, 5, 36, 7, 64,...,N.
1, 2, 3, 4,  5, 6,  7, 64,...,N.
*/

// Se utiliza para obtener datos de los usuarios.
import java.util.Scanner;
public class Secuencia1 {

    public static void main(String[] args) {
        // Se utiliza para obtensser datos de los usuarios
        System.out.println("Inserta el límite de la secuencia:");
        Scanner scanner = new Scanner(System.in);
        // n es el limitador de la secuencia.
        int n = scanner.nextInt();

        // Se imprime utiliza para examinar cada número en el patrón.s
        for (int i = 1; i <= n;i++) {
            // Si el número es par, entonces se eleva al cuadrado.
            if (i%2 == 0)
                System.out.println(i * i);
            // Si el número es impar, entonces se muestra como está.
            else
                System.out.println(i);
        }

    }

}