package com.company;

import java.util.Comparator;
import java.util.List;

public class Movies {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    void printCast(List<Cast> cast) {
        int counter = 1;
        for (Cast s : cast) {
            System.out.printf("%s)   Fullname: %s\n", counter, s.getFullName());
            System.out.println("     Role: " + s.getRole());
            counter++;
        }
    }

    public List<Cast> getCast() {
        return cast;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Movie = " + name + " | " +
                ", year= " + year + " | " +
                ", description= " + description + " | " +
                ", director" + director +
                ", cast: " + cast;
    }

//    @Override
//    public int compareTo(Movies movies) {
//        return this.year - movies.year ;
//    }
}

class YearComparator implements Comparator<Movies> {

    @Override
    public int compare(Movies emp1, Movies emp2) {
        return emp1.getYear() - emp2.getYear();
    }
}

class NameComparator implements Comparator<Movies> {

    @Override
    public int compare(Movies emp1, Movies emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}

class DirectorComparator implements Comparator<Movies> {

    @Override
    public int compare(Movies emp1, Movies emp2) {
        return emp1.getDirector().getFullName().compareTo(emp2.getDirector().getFullName());
    }
}

class ActorComparator implements Comparator<Cast> {
    @Override
    public int compare(Cast emp1, Cast emp2) {
        return emp1.getFullName().compareTo(emp2.getFullName());
    }
}
