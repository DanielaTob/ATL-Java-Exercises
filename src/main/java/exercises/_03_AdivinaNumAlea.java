package exercises;

import java.util.Scanner;

public class _03_AdivinaNumAlea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroUsuario = 0;
        int numeroAleatorio = (int) Math.floor(Math.random() * 100);

        System.out.println("¿Cual es el numero aleatorio?");
        numeroAleatorio = sc.nextInt();

        if (numeroUsuario == numeroAleatorio){
            System.out.println("Adivinaste el numero: " + numeroAleatorio);
        } else {
            System.out.println("Numero incorrecto");
        }
    }
}
