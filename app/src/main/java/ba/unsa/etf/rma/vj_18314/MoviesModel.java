package ba.unsa.etf.rma.vj_18314;

import java.util.ArrayList;
import java.util.List;

public class MoviesModel {

    private static MoviesModel instance = null;

    private ArrayList<Movie> lista = new ArrayList<>();

    public MoviesModel() {
        lista.add(new Movie("The Godfather", "Crime", "1972", "https://www.imdb.com/title/tt0068646/", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
        lista.add(new Movie("Fight Club", "Drama", "1999", "https://www.imdb.com/title/tt0137523/", "An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more."));
        lista.add(new Movie("Pulp Fiction", "Crime", "1994", "https://www.imdb.com/title/tt0110912/", "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption."));
        lista.add(new Movie("The Dark Knight", "Action", "2008", "https://www.imdb.com/title/tt0468569/", "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice."));
        lista.add(new Movie("The Prestige", "Drama", "2006", "https://www.imdb.com/title/tt0482571/", "After a tragic accident, two stage magicians engage in a battle to create the ultimate illusion while sacrificing everything they have to outwit each other."));
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