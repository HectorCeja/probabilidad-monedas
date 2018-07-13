/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

/**
 *
 * @author Hector
 */
import java.awt.FlowLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Grafica extends JFrame {

    public Grafica() {
    }

    public Grafica(int cara, int cruz, double probCruz, double probCara, String titulo2) {
        super(titulo2);
        // Crea un  XY chart

        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Cruz: " + cruz + "\n" + (int) probCruz + "%", cruz);
        dataset.setValue("Cara: " + cara + "\n" + (int) probCara + "%", cara);

        // Agrega las series
        JFreeChart chart = ChartFactory.createPieChart("Lanzamiento de moneda", dataset, true, true, true);
        // Genera el grafico
        ChartPanel panel = new ChartPanel(chart);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public Grafica(int cara, int cruz, double probCruz, double probCara) {

        // Crea un  XY chart
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Cruz: " + cruz + "\n" + (int) probCruz + "%", cruz);
        dataset.setValue("Cara: " + cara + "\n" + (int) probCara + "%", cara);

        // Agrega las series
        JFreeChart chart = ChartFactory.createPieChart("Lanzamiento de moneda", dataset, true, true, true);
        // Genera el grafico
        ChartPanel panel = new ChartPanel(chart);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setTitle("Lanzamiento de moneda");
        setVisible(true);
    }

    public Grafica(int[] a, int dias) {
        DecimalFormat d = new DecimalFormat("#.##");
        DefaultPieDataset dataset = new DefaultPieDataset();
        // Crea un  XY chart
        for (int i = 0; i < a.length; i++) {
            double por = ((double) a[i] / (double) dias) * 100;
            dataset.setValue("Consulta " + i + ": " + a[i] + "\n" + d.format(por) + "%", a[i]);
        }
        // Agrega las series
        JFreeChart chart = ChartFactory.createPieChart("Consultas", dataset, true, true, true);
        // Genera el grafico
        ChartPanel panel = new ChartPanel(chart);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setTitle("Lanzamiento de moneda");
        setVisible(true);
    }

}
