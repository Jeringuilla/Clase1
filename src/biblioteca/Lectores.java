
package biblioteca;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Lectores extends Thread {

    private ArrayList<Libro> catalogo;
    private JList<String> jList;
    private Random random;

    public Lectores(ArrayList<Libro> catalogo, JList<String> jList) {
        this.catalogo = catalogo;
        this.jList = jList;
        this.random = new Random();
    }

    @Override
    public void run() {
        DefaultListModel<String> modelo = new DefaultListModel<>(); //1º Lo primero, necesitamos un modelo de lista

        for (Libro libro : catalogo) { //2º después, recorremos el array con un for-each
            int paginasALeer = random.nextInt(libro.nPaginas) + 50; /*3º declaramos variable páginas a leer (random), que es mínimo 50 y
                                                                        máximo el nº de páginas del libro*/
            for (int i = 1; i <= paginasALeer; i++) {
                try {
                    Thread.sleep(random.nextInt(500) + 50); //4º simulamos aleatoriamente el tiempo que les lleva leer cada página
                } catch (InterruptedException ex) {
                    
                }
                String progreso_lectura = libro.titulo + " - Página " + i; //5º aquí definimos el texto que se irá mostrando en la jlist mientras leen
                modelo.addElement(progreso_lectura); //6º ahora añadimos ese texto al modelo
                jList.setModel(modelo); //7º por último metemos el modelo en la jlist
            }
        }
    }
}
