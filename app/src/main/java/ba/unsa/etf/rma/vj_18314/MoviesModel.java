package ba.unsa.etf.rma.vj_18314;

import java.util.ArrayList;
import java.util.List;

public class MoviesModel {

    private static MoviesModel instance = null;

    private ArrayList<Movie> lista = new ArrayList<>();

    public MoviesModel() {
        lista.add(new Movie("The Godfather", "Crime", "1972", "https://www.imdb.com/title/tt0068646", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
        lista.add(new Movie("Fight Club", "Drama", "1999", "https://www.imdb.com/title/tt0137523", "An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more."));
    }

    public ArrayList<Movie> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Movie> lista) {
        this.lista = lista;
    }

    public static MoviesModel getInstance(){
        if(instance == null) instance = new MoviesModel();
        return instance;
    }
}