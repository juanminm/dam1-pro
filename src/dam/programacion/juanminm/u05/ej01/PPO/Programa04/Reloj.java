/*
 * 4. Escribe una clase que represente un reloj que señale la hora, el minuto y
 *    el segundo.
 *
 *   a) La clase dispondrá de dos constructores, uno sin parámetros que pone el
 *      reloj a 0:0:0 y otro al que se le pasa la hora, los minutos y los
 *      segundos
 *
 * Se proporcionarán los siguientes métodos:
 *
 *   b) Uno que da la hora, los minutos y los segundos, separados por el
 *      carácter “:”, en una cadena
 *   c) Otro que también da la hora pero en formato 24 horas (como el anterior)
 *      o en formato 12, en cuyo caso debe distinguir entre “am” (para las
 *      horas de 0 a 11) o “pm” (para las horas de 12 a 23), también en una
 *      cadena
 *   d) Un método para poner el reloj en hora. Se le pasa la hora y los
 *      minutos, poniendo los segundos a 0
 *   e) Un método para poner el reloj en hora al que, a demás, se le pasan los
 *      segundos
 *   f) Añada al ejercicio anterior un método para poner la hora especificando
 *      si es AM o es PM
 */

package dam.programacion.juanminm.u05.ej01.PPO.Programa04;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    public Reloj() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    public Reloj (int horas, int minutos, int segundos) {
        this.horas = verificarHoras(horas);
        this.minutos = verificarMinutos(minutos);
        this.segundos = verificarSegundos(segundos);
    }

    private int verificarHoras(int horas) {
        if (horas >= 0 && horas <= 23) {
            return horas;
        } else {
            System.out.println("La hora introducida no es correcta.");
            return this.horas;
        }
    }

    private int verificarHoras(int horas, String periodo) {
        if (horas >= 1 && horas <= 12) {
            if (periodo.equals("AM")) {
                if (horas == 12) {
                    return 0;
                } else {
                    return horas;
                }
            } else {
                if (horas == 12) {
                    return 12;
                } else {
                    return horas + 12;
                }
            }
        } else {
            System.out.println("La hora introducida no es correcta.");
            return this.horas;
        }
    }

    private int verificarMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            return minutos;
        } else {
            System.out.println("El minuto introducido no es correcta.");
            return this.minutos;
        }
    }

    private int verificarSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            return segundos;
        } else {
            System.out.println("El segundo introducido no es correcta.");
            return this.segundos;
        }
    }

    public void mostrarHora() {
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }

    public void mostrarHora(String modoHoras) {
        String momentoDia;
        int horas12H;

        switch(modoHoras.toUpperCase()) {
            case "0000":
            case "2400":
            case "24H":
            case "24":
                System.out.println(horas + ":" + minutos + ":" + segundos);
                break;
            case "AM/PM":
            case "AMPM":
            case "1200":
            case "12H":
            case "12":
                if (horas >= 0 && horas <= 11) {
                    momentoDia = "AM";

                    if (horas == 0) {
                        horas12H = 12;
                    } else {
                        horas12H = horas;
                    }
                } else {
                    momentoDia = "PM";

                    if (horas == 12) {
                        horas12H = 12;
                    } else {
                        horas12H = horas - 12;
                    }
                }

                System.out.println(horas12H + ":" + minutos + ":" + segundos
                        + momentoDia);
                break;
        }
    }

    public void calibrarReloj (int horas, int minutos) {
        this.horas = verificarHoras(horas);
        this.minutos = verificarMinutos(minutos);
        this.segundos = 0;
    }

    public void calibrarReloj (int horas, int minutos, int segundos) {
        this.horas = verificarHoras(horas);
        this.minutos = verificarMinutos(minutos);
        this.segundos = verificarSegundos(segundos);
    }

    public void calibrarReloj (int horas, int minutos, int segundos,
            String periodo) {
        this.horas = verificarHoras(horas, periodo);
        this.minutos = verificarMinutos(minutos);
        this.segundos = verificarSegundos(segundos);
    }
}
