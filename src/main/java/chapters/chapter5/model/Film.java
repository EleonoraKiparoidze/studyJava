package chapters.chapter5.model;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String name;
    private FilmInformation filmInformation;

    public Film() {
    }

    public Film(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilmInformation() {
        String info = "";
        info += "Film duration-> '" + filmInformation.getDuration() + "'" + " Producers-> " + filmInformation.getProducers().toString() + " Genres-> " + filmInformation.getGenres().toString() + "";
        return info;
    }

    public void setFilmInformation(double duration, List<Producer> producers, List<Genre> genres) {
        filmInformation = new FilmInformation();
        filmInformation.setDuration(duration);
        filmInformation.setGenres(genres);
        filmInformation.setProducers(producers);
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", filmInformation-> {" + getFilmInformation() + "} " +
                '}';
    }

    private class FilmInformation {
        private double duration;
        private List<Producer> producers = new ArrayList<>();
        private List<Genre> genres = new ArrayList<>();

        FilmInformation() {
        }

        double getDuration() {
            return duration;
        }

        void setDuration(double duration) {
            this.duration = duration;
        }

        List<Producer> getProducers() {
            return producers;
        }

        void setProducers(List<Producer> producers) {
            this.producers = producers;
        }

        List<Genre> getGenres() {
            return genres;
        }

        void setGenres(List<Genre> genres) {
            this.genres = genres;
        }
    }
}
