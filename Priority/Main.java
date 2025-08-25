/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Priority;

/**
 *
 * @author abeta
 */

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        Random rand = new Random();
        int cantidad = 10;

        System.out.println("Agregando elementos aleatorios a la PriorityQueue:");
        for (int i = 0; i < cantidad; i++) {
            int prioridad = rand.nextInt(100) + 1;
            String valor = "Elemento" + i;
            pq.push(prioridad, valor);
            System.out.print(prioridad + " "); // mostrar números aleatorios
        }

        System.out.println("\n\nMostrando en orden ascendente de prioridad:");
        while (pq.getSize() > 0) {
            PriorityNode node = pq.pop();
            System.out.print(node.getPriority() + " ");
        }
    }
}
