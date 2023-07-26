package exercises;

import java.util.Scanner;

public class _02_CalcularEdadPerro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edadPerro;
        int edadPerruna;

        System.out.println("Ingresa la edad de tu perro");
        edadPerro = sc.nextInt();

        edadPerruna = edadPerro * 7;

        System.out.println("La edad de tu perro en años es: " + edadPerruna);
    }
}
