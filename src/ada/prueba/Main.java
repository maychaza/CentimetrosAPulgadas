package ada.prueba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int centrimetro;
        double pulgada;
        System.out.println("Sistema de centimetros a pulgadas");
        do {
            System.out.println("Ingrese los centimetros que desea convertir, 0 para salir");
            centrimetro = s.nextInt(); // lo asigno a lo que el usuario escriba

            if (centrimetro !=0) {
                pulgada = centrimetro / 2.5;
                System.out.println("las pulgadas son: "+pulgada);
            }
        } while (centrimetro != 0);

    }
}
