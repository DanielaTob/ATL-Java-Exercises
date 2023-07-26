package exercises;

import java.util.Scanner;

public class _01_MayorEdad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu edad");
        Integer edad = sc.nextInt();

        if (edad >= 18){
            System.out.println("Puede ingresar ya que su edad es: " + edad + " años, y es mayor de edad");
        } else {
            System.out.println("No puede ingresar, ya que su edad es: " + edad + " años, y es menor de edad");
        }
    }
}
