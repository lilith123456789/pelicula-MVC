package app;
import model.Pelicula;
public class App {
    public static void main(String[] args) throws Exception {
        Pelicula película1 = new Pelicula("Gandhi", "Richard Attenborough", "DRAMA",191,1982,8.3);
        Pelicula película2 = new Pelicula("Thor", "Kenneth Branagh", "ACCION" , 115,2011,7.0);
        película1.imprimir();
        System.out.println();
        película2.imprimir();
        System.out.println();
        System.out.println("La película " + película1.getNombre() + " es épica: " + película1.esPelículaEpica());
        System.out.println("La película " + película2.getNombre() + " es épica: " + película2.esPelículaEpica());
        System.out.println("La película " + película1.getNombre() + " y la película " + película2.getNombre() + " son similares = " + película1.esSimilar(película2));
    }
}
