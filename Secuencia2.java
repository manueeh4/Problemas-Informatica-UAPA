import java.util.Scanner;

// -2, 3, -4, 5, -6, -7,...,N
// Los núeros negativos son pares y los positivos impares.
public class Secuencia2 {
    public static void main(String[] args) {

        // Se utiliza para obtener datos del usuario:
        System.out.println("Inserta el límite de la secuencia:");
        Scanner obtenerDatos = new Scanner(System.in);
        int n = obtenerDatos.nextInt();
        System.out.println("Los elementos en la secuencia hasta N son:");
        for (int i = 2; i <= n;i++) {
            // Devuelve negativo si es par
            if (i%2 == 0)
                // Si se resta un número positivo por su doble devuelve su opuesto negativo.
                System.out.println(i - i - i);
            else
                System.out.println(" " + i);
        }

    }

}