/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hector
 */
public class SimulacionConsultas {

    public static void main(String[] ar) {
        Scanner read = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Ingrese número de días a simular:");
        int dias = read.nextInt();
        int contR0 = 0, contR1 = 0, contR2 = 0, contR3 = 0, contR4 = 0, contR5 = 0;
        int[] arr = new int[6];
        System.out.println("dia simulado\t\t#aleatorio\t\t   #consultas");
        for (int i = 0; i < dias; i++) {
            double frecA = rnd.nextDouble() * 1 + 0;
            if (frecA < 0.05) {
                contR0++;
                System.out.println((i + 1) + "\t\t\t" + frecA + "\t\t" + 0);
            } else if (frecA > 0.051 && frecA < 0.15) {
                contR1++;
                System.out.println((i + 1) + "\t\t\t" + frecA + "\t\t" + 1);
            } else if (frecA > 0.151 && frecA < 0.35) {
                contR2++;
                System.out.println((i + 1) + "\t\t\t" + frecA + "\t\t" + 2);
            } else if (frecA > 0.351 && frecA < 0.65) {
                contR3++;
                System.out.println((i + 1) + "\t\t\t" + frecA + "\t\t" + 3);
            } else if (frecA > 0.651 && frecA < 0.85) {
                contR4++;
                System.out.println((i + 1) + "\t\t\t" + frecA + "\t\t" + 4);
            } else if (frecA > 0.851) {
                contR5++;
                System.out.println((i + 1) + "\t\t\t" + frecA + "\t\t" + 5);
            }

        }
        arr[0] = contR0;
        arr[1] = contR1;
        arr[2] = contR2;
        arr[3] = contR3;
        arr[4] = contR4;
        arr[5] = contR5;
        Grafica g = new Grafica(arr, dias);
    }
}
