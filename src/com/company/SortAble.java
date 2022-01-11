package com.company;

import java.util.List;

public interface SortAble {

    void printAllMovies();

    void findMovie(String movieName);

    void sortByYear(List<Movies> movies);

    void sortByName(List<Movies> movies);

    void sortByDirector(List<Movies> movies);
}
