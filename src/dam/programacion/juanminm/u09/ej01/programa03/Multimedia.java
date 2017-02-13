package dam.programacion.juanminm.u09.ej01.programa03;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class Multimedia {
    private String titulo;
    private String autor;
    private Formato formato;
    private int duracion;

    public enum Formato{
        WAV("wav"), MP3("mp3"), MIDI("midi"), AVI("avi"), MOV("mov"),
        MPG("mpg"), CDAUDIO("cdaudio"), DVD("dvd");

        private String value;

        private Formato(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }

    public Multimedia(String titulo, String autor, int duracion,
            Formato formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato.getValue();
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        String s = "";

        s += "Titulo: " + titulo + "\n";
        s += "Autor: " + autor + "\n";
        s += "Duración: " + duracion + "\n";
        s += "Formato: " + formato.getValue() + "\n";

        return s;
    }

    public boolean equals(Multimedia m) {
        return m.getTitulo().equals(this.titulo)
                && m.getAutor().equals(this.autor);
    }
}
