package chapters.chapter5.run;

import chapters.chapter5.model.Film;
import chapters.chapter5.model.Genre;
import chapters.chapter5.model.Producer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Film film = new Film("It");

        List<Producer> producers = new ArrayList<>();
        producers.add(new Producer("Roy","Lee"));
        producers.add(new Producer("Dan","Lin"));

        List<Genre> genres= new ArrayList<>();
        genres.add(Genre.HORROR);
        genres.add(Genre.DRAMA);
        genres.add(Genre.THRILLER);

        film.setFilmInformation(135,producers,genres);
        System.out.println(film);
    }
}
