package dam.programacion.juanminm.ejercicioud05e01.PPO.Programa04;

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
