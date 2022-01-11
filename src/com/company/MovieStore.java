package com.company;

import java.util.List;

public class MovieStore implements SortAble {
    @Override
    public void printAllMovies() {
        for (Movies movie : JsonIO.getMovies()) {
            System.out.println(movie);
        }
    }

    @Override
    public void findMovie(String movieName) {
        for (Movies movie : JsonIO.getMovies()) {
            if (movie.getName().contains(movieName)) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void sortByYear(List<Movies> movies) {
        movies.sort(new YearComparator());
        // We can also do like this
        // Collections.sort(movies, new YearComparator());
        for (Movies m : movies) {
            System.out.println(m);
        }
    }

    @Override
    public void sortByName(List<Movies> movies) {
        movies.sort(new NameComparator());
        for (Movies m : movies) {
            System.out.println(m);
        }
    }

    @Override
    public void sortByDirector(List<Movies> movies) {
        movies.sort(new DirectorComparator());
        for (Movies m : movies) {
            System.out.println(m);
        }
    }

}
