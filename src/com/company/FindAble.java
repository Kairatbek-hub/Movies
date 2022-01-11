package com.company;


public interface FindAble {

    void findMoviesByActor(String actor);

    void findMoviesByDirector(String director);

    void findMoviesByYear(int year);

    void findMoviesAndRoleByActor(String actor);

    void showActorsAndRolesAndSortByActor();
}
