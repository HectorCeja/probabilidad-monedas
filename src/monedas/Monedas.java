/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monedas;

import Consultas.Grafica;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hector
 */
public class Monedas {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.###");
        Random r = new Random();
        System.out.println("Ingrese cuantos lanzamientos desea hacer:");
        int lanzamientos = read.nextInt();
        int contadorCara = 0;
        int contadorCruz = 0;
        System.out.println("Lanzamiento\t\t\tResultado");
        for (int i = 0; i < lanzamientos; i++) {
            double resultado = (r.nextDouble() * 1 + 0);
            if (resultado < 0.50) {
                contadorCara++;
            } else {
                contadorCruz++;
            }
            System.out.println((i + 1) + "\t\t\t\t" + formato.format(resultado));
        }
        double probabilidadCara = ((double)contadorCara/(double)lanzamientos)*100;
        double probabilidadCruz = ((double)contadorCruz/(double)lanzamientos)*100;
        System.out.println("\nTotal de lanzamientos: " + lanzamientos);
        System.out.println("Total de Cara: " + contadorCara+" Probabilidad de cara obtenida: "+probabilidadCara+"%");
        System.out.println("Total de Cruz: " + contadorCruz+" Probablilidad de cruz obtenida: "+probabilidadCruz+"%");
        //Grafica g = new Grafica(contadorCara, contadorCruz,probabilidadCruz,probabilidadCara, "Lanzamiento de moneda");
        Grafica g = new Grafica(contadorCara, contadorCruz, probabilidadCruz, probabilidadCara);
    }
}
