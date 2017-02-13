/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.juanminm.u02.ej02;

import java.util.Random;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ProgramaB12 {
    public static void main(String[] args) {
        Random random = new Random();
        int dado, cara1 = 0, cara2 = 0, cara3 = 0,
                cara4 = 0, cara5 = 0,cara6 = 0;
        float pcntCara1, pcntCara2, pcntCara3, pcntCara4, pcntCara5, pcntCara6;

        for (int i = 1; i <= 1000000; i++) {
            dado = random.nextInt(6)+1;

            switch(dado) {
                case 1:
                    cara1++;
                    break;
                case 2:
                    cara2++;
                    break;
                case 3:
                    cara3++;
                    break;
                case 4:
                    cara4++;
                    break;
                case 5:
                    cara5++;
                    break;
                case 6:
                    cara6++;
            }
        }

        pcntCara1 = (float) cara1/1000000 * 100;
        pcntCara2 = (float) cara2/1000000 * 100;
        pcntCara3 = (float) cara3/1000000 * 100;
        pcntCara4 = (float) cara4/1000000 * 100;
        pcntCara5 = (float) cara5/1000000 * 100;
        pcntCara6 = (float) cara6/1000000 * 100;

        System.out.println("Cara 1: " + pcntCara1 + "%");
        System.out.println("Cara 2: " + pcntCara2 + "%");
        System.out.println("Cara 3: " + pcntCara3 + "%");
        System.out.println("Cara 4: " + pcntCara4 + "%");
        System.out.println("Cara 5: " + pcntCara5 + "%");
        System.out.println("Cara 6: " + pcntCara6 + "%");

    }
}
