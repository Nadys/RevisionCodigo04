package com.generation;
import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (piedra, papel o tijeras): ");
        String j1 = s.nextLine().toLowerCase();

        System.out.print("Turno del jugador 2 (piedra, papel o tijeras): ");
        String j2 = s.nextLine().toLowerCase();

        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int ganador = 2; // por defecto gana jugador 2
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        ganador = 1;
                    }//case piedra
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        ganador = 1;
                    }//case papel
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        ganador = 1;
                    }//case tijeras
                    break;
                default:
                    System.out.println("Opción inválida del jugador 1");
                    return;
            }//switch
            System.out.println("Gana el jugador " + ganador);
        }//else

        s.close();
    }//main
}//class