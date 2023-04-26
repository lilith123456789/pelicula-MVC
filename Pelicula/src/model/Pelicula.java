package model;

public class Pelicula {

    private String nombre;
    private String director;
    private String género;
    private int duración;
    private int año;
    private double calificación;

    public Pelicula(String nombre, String director, String género, int duración, int año, double calificación) {
        this.nombre = nombre;
        this.director = director;
        this.género = género;
        this.duración = duración;
        this.año = año;
        this.calificación = calificación;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    private void setDirector(String director) {
        this.director = director;
    }

    public String getGénero() {
        return género;
    }

    private void setGénero(String género) {
        this.género = género;
    }

    public int getDuración() {
        return duración;
    }

    private void setDuración(int duración) {
        this.duración = duración;
    }

    public int getAño() {
        return año;
    }

    private void setAño(int año) {
        this.año = año;
    }

    public double getCalificación() {
        return año;
    }

    private void setCalificación(double calificación) {
        this.calificación = calificación;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Género: " + género);
        System.out.println("Duración: " + duración);
        System.out.println("Año: " + año);
        System.out.println("Calificación: " + calificación);
    }

    

    public boolean esPelículaEpica() {

        if (duración >= 180) {
            return true;
        } else {
            return false;
        }
    }

    public String calcularValoración() {
        if (calificación >= 0 && calificación <= 2) {
            return "Muy mala";
        } else if (calificación > 2 && calificación <= 5) {
            return "Mala";
        } else if (calificación > 5 && calificación <= 7) {
            return "Regular";
        } else if (calificación > 7 && calificación <= 8) {
            return "Buena";
        } else if (calificación > 8 && calificación <= 10) {
            return "Excelente";
        } else {
            return "valoración inválida";
        }
    }

    public boolean esSimilar(Pelicula pelicula) {

        if (pelicula.género == género && pelicula.calcularValoración() == calcularValoración()) {
            return true;
        } else {
            return false;
        }
    }
    
}