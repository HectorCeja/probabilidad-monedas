/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hector
 */
public class Consultas {

    public static void main(String[] r) {
        Scanner read = new Scanner(System.in);
        Random rnd = new Random();
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("¿Cuántos días desea simular?");
        int dias = read.nextInt();
        int consultas = 0;
        double diasTotales = dias;
        double frecAcumul = 0;
        int totalFrecAbs = 0;
        double totalFrecRel = 0;
        System.out.println("Consultas\t\tFrec.Abs\t\tFrec.Rel\t\tFrec.Rel.Acum");
        do {
            int frecAbs = (int) (rnd.nextDouble() * 60 + 1);
            if(frecAbs>dias){
                frecAbs=dias;
            }
            double frecRelativa = (double) frecAbs / (double) diasTotales;
            totalFrecRel = totalFrecRel+frecRelativa;
            frecAcumul = frecAcumul + frecRelativa;
            if (dias > 0) {
                System.out.println(consultas + "\t\t\t" + frecAbs + "\t\t\t" + formato.format(frecRelativa) + "\t\t\t" + formato.format(frecAcumul));
            } else {
                frecAbs = 0;
                frecRelativa = (double) frecAbs / (double) dias;
                frecAcumul = frecAcumul + frecRelativa;
                if (frecRelativa == -0) {
                    frecRelativa = 0;
                }
                System.out.println(consultas + "\t\t\t" + frecAbs + "\t\t\t" + formato.format(frecRelativa) + "\t\t\t" + formato.format(frecAcumul));

            }
            dias = dias - frecAbs;
            totalFrecAbs = totalFrecAbs+frecAbs;
            
            consultas++;
        } while (consultas <= 6);
        System.out.println("Totales:\t\t"+totalFrecAbs+"\t\t\t"+totalFrecRel);

    }
}
