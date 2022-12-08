Puedes crear una matriz en Java y llenarla con valores ingresados por el usuario utilizando la clase Scanner y un ciclo for. Por ejemplo, si quieres crear una matriz de enteros de 3 filas y 5 columnas y llenarla con valores ingresados por el usuario, puedes hacerlo de la siguiente manera:

Copy code
import java.util.Scanner;

public class CrearMatriz {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[][] matriz = new int[3][5];

    // Leer valores de la matriz ingresados por el usuario
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print("Ingrese un valor para la posición [" + i + "][" + j + "]: ");
        matriz[i][j] = entrada.nextInt();
      }
    }

    // Imprimir la matriz
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}
En este ejemplo, se crea una matriz de enteros de 3 filas y 5 columnas y se utiliza un ciclo for anidado para leer los valores ingresados por el usuario y almacenarlos en la matriz. Luego, se utiliza otro ciclo for anidado para imprimir la matriz.

Espero que esto te ayude a crear una matriz en Java y llenarla con valores ingresados por el usuario. Si tienes alguna duda o necesitas más ayuda, no dudes en preguntar.




