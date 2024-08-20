package ru.netology.javaqa.MoviesMenagerTest;

import org.junit.jupiter.api.Test;
import ru.netology.javaqa.MoviesMenager.MoviesManager;

import static org.junit.jupiter.api.Assertions.*;


public class MoviesManagerTest {

    // добавление фильма
    @Test
    public void AddMovie() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");

        String[] expected = {"Movie 1", "Movie 2"};
        assertArrayEquals(expected, manager.findAll());
    }


    //Вывод всех фильмов в порядке добавления
    @Test
    public void FindAll() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7"};
        assertArrayEquals(expected, manager.findAll());
    }

    // вывод всех фильмов в обратном порядке
    @Test
    public void maxlimitMoviesReverse() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");

        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3",};
        assertArrayEquals(expected, manager.findLast());
    }

    // выставление лимита
    @Test
    public void LimitMoviesReverse() {
        MoviesManager manager = new MoviesManager(5);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");

        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        assertArrayEquals(expected, manager.findLast());
    }
}


