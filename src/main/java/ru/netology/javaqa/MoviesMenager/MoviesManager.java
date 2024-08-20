
package ru.netology.javaqa.MoviesMenager;

public class MoviesManager {

    private String[] movies = new String[0];
    private int limit;

    // Конструктор без параметров, устанавливающий лимит в 5
    public MoviesManager() {
        this.limit = 5;
    }

    // Конструктор с параметром, устанавливающий лимит из параметра
    public MoviesManager(int limit) {
        this.limit = limit;
    }

    // Метод для добавления нового фильма
    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    // Метод для вывода всех фильмов в порядке добавления
    public String[] findAll() {
        return movies;
    }

    // Метод для вывода последних добавленных фильмов в обратном порядке
    public String[] findLast() {
        int resultLength = Math.min(movies.length, limit);
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;


    }

}

