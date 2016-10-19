/*
 * 9. Escribe un programa que solicite tres valores enteros con el día, mes y
 * año de una fecha e indique si se trata de valores válidos para una fecha.
 */
package dam.programacion.juanminm.ejercicioud202;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class ProgramaA09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia, mes, año;
        boolean error = true;
        String errmsg = null;
        
        System.out.print("Año: ");
        año = scan.nextInt();
        
        System.out.print("Mes: ");
        mes = scan.nextInt();

        System.out.print("Dia: ");
        dia = scan.nextInt();

        if (mes < 1 || mes > 12) {
            errmsg = "El més introducido no es el correcto. Valores del 1 al"
                    + "12";
        } else  if (mes == 2) {
            if ((año % 4 == 0 && año % 100 != 0
                    || año % 400 == 0) && (dia < 1
                    || dia > 29)) {
                errmsg = "El día introducido no es el correcto. Valores entre 1 "
                        + "y 29 para febrero en un año bisiesto.";
            } else if (dia < 1 || dia > 28) {
                errmsg = "El día introducido no es el correcto. Valores entre 1 "
                        + "y 28 para febrero en un año no bisiesto.";
            }
        } else if ((mes <= 7 && mes % 2 == 0
                || mes > 7 && mes % 2 == 1)
                && (dia < 1 || dia > 30)) {
            errmsg = "El día introducido no es el correcto. Valores entre 1 y "
                    + "30 para el mes introducito.";
        } else if ((mes <= 7 && mes % 2 == 1
                || mes > 7 && mes % 2 == 0)
                && (dia < 1 || dia > 31)) {
            errmsg = "El día introducido no es el correcto. Valores entre 1 y "
                    + "31 para el mes introducito.";
        } else {
            error = false;
        }
        
        if (error) {
            System.out.println("ERROR - Fecha introdicida incorrecta: "
                    + errmsg);
        } else {
            System.out.println("La fecha introducida es valida.");
        }
    }
}
