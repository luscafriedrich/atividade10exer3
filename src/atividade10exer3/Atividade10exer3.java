package atividade10exer3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Atividade10exer3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
         int a1, r;
         r = 0;
         for(int n = 0; n <= 1000; n++){
             System.out.println("Informe a quantidade de algaritmos que compoem esta progressão:");
             n = teclado.nextInt();
             System.out.println("Informe o primeiro número da progressão:");
             a1 = teclado.nextInt();
             System.out.println("Informe a razão desta progressão:");
             r = teclado.nextInt();
             
             n = a1 + (n - 1)*r;
             
             System.out.println("Termos da progressão: "+n);
         }
    }  
}
