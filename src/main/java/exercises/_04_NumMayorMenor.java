package exercises;

import java.util.Scanner;

public class _04_NumMayorMenor {

    public static void main(String[] args) {

        //Cargar 3 numeros y mostrar mayor y menor
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        int numero1 = sc.nextInt();

        System.out.println("Escribe el segundo numero");
        int numero2 = sc.nextInt();

        System.out.println("Escribe el tercer numero");
        int numero3 = sc.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero mayor es: " + numero1);
        } else if (numero3 > numero2 && numero3 > numero1) {
            System.out.println("El numero mayor es: " + numero3);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mayor es: " + numero2);
        }

    }
}
