package com.company;

import java.util.ArrayList;
import java.util.List;

public class FindByMap implements FindAble {

    @Override
    public void findMoviesByActor(String actor) {
        for (Movies movie : JsonIO.getMovies()) {
            List<Cast> casts = movie.getCast();
            for (Cast c : casts) {
                if (c.getFullName().equals(actor)) {
                    System.out.println(movie);
                }
            }
        }
    }

    @Override
    public void findMoviesByDirector(String director) {
        for (Movies movie : JsonIO.getMovies()) {
            if (movie.getDirector().getFullName().equals(director)) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMoviesByYear(int year) {
        for (Movies movie : JsonIO.getMovies()) {
            if (movie.getYear() == year) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMoviesAndRoleByActor(String actor) {
        for (Movies movie : JsonIO.getMovies()) {
            List<Cast> casts = movie.getCast();
            for (Cast c : casts) {
                if (c.getFullName().equals(actor)) {
                    System.out.println("Name of movie = " + movie.getName() + ", Role = " + c.getRole());
                }
            }
        }
    }

    @Override
    public void showActorsAndRolesAndSortByActor() {
        List<Cast> casts1 = new ArrayList<>();
        for (Movies movie : JsonIO.getMovies()) {
            List<Cast> casts = movie.getCast();
            casts1.addAll(casts);
        }
        casts1.sort(new ActorComparator());
        Movies movies = new Movies();
        movies.printCast(casts1);
//        int counter = 1;
//        for (Cast s : casts1) {
//            System.out.printf("%s)   Fullname: %s\n", counter, s.getFullName());
//            System.out.println("     Role: " + s.getRole());
//            counter++;
//        }
    }
}
