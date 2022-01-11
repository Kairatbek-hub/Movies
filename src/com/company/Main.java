package com.company;

import java.util.List;
import java.util.Scanner;
import static java.lang.System.exit;

public class Main {
    private static final List<Movies> movies = JsonIO.getMovies();
    private static SortAble s = (SortAble) new MovieStore();
    private static FindAble f = (FindAble) new FindByMap();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InputException {
        commads();
        while (true) {
            start();
        }
    }

    private static void start() {
        Scanner scanner = new Scanner(System.in);
        int birSan;
        birSan = in.nextInt();
        switch (birSan) {
            case 1:
                s.printAllMovies();
                break;
            case 2:
                System.out.println("Write movie name:");
                String movieName = scanner.nextLine();
                s.findMovie(movieName);
                break;
            case 3:
                s.sortByYear(movies);
                break;
            case 4:
                s.sortByName(movies);
                break;
            case 5:
                s.sortByDirector(movies);
                break;
            case 6:
                System.out.println("Write actor name:");
                String actorName = scanner.nextLine();
                f.findMoviesByActor(actorName);
                break;
            case 7:
                System.out.println("Write director name:");
                String directorName = scanner.nextLine();
                f.findMoviesByDirector(directorName);
                break;
            case 8:
                System.out.println("Write movie year:");
                int year = scanner.nextInt();
                f.findMoviesByYear(year);
                break;
            case 9:
                System.out.println("Write actor name to know his role and movie:");
                String actor = scanner.nextLine();
                f.findMoviesAndRoleByActor(actor);
                break;
            case 10:
                f.showActorsAndRolesAndSortByActor();
                break;
            default:
                System.out.println("Error! Number is not correct");
                exit(0);
        }
    }

    static void commads() {
        System.out.println("--------------Commands-----------------------");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to Find a Movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to List all movies and roles by actor's name");
        System.out.println("Press 10 to sorted List of all actors with his roles");
        System.out.println("---------------------------------------------");
    }

    static int getInt() {
        System.out.print("Write year ");
        int a = 0;
        try {
            String b = in.next();
            a = Integer.parseInt(b);
        } catch (Exception e) {
            System.out.println("Wrong again, try again");
            e.printStackTrace();
        }
        return a;
    }
}
