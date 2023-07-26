package exercises;

import java.util.Scanner;

public class _05_CalcularPromedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la primera nota");
        double nota1 = sc.nextDouble();

        System.out.println("Escribe la segunda nota");
        double nota2 = sc.nextDouble();

        System.out.println("Escribe la tercera nota");
        double nota3 = sc.nextDouble();

        double resultado = (nota1 + nota2 + nota3 ) / 3;

        System.out.println("El promedio de las notas digitadas es: " + resultado);
    }
}
