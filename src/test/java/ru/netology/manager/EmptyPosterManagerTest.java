package ru.netology.manager;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.*;

public class EmptyPosterManagerTest {
    PosterManager manager = new PosterManager();
    private Film one = new Film(1, "one", "Comedy", "www.oneFilm.com");
    private Film two = new Film(2, "two", "Detective", "www.twoFilm.com");
    private Film three = new Film(3, "three", "Drama", "www.threeFilm.com");

    @Test
    void addToEmpty() {
        Film [] moviesList = new Film[] {};
        manager.setPoster(moviesList);
        manager.add(one);
        manager.add(two);
        Film[] expected = new Film[]{one, two};
        Film[] actual = manager.getPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    void add() {
        Film [] moviesList = new Film[] {one};
        manager.setPoster(moviesList);
        manager.add(two);
        manager.add(three);
        Film[] expected = new Film[]{one, two, three};
        Film[] actual = manager.getPoster();
        assertArrayEquals(expected, actual);
    }

    @Test // показать добавленные фильмы в обратном порядке
    void getLastWithQuantityLessThanInList() {
        Film [] moviesList = new Film[] {one, two, three};
        manager.setPoster(moviesList);
        manager.findLast();
        Film[] expected = new Film[]{three, two, one};
        Film[] actual = manager.getPoster();
        assertArrayEquals(expected, actual);
    }

    @Test // показать фильмы в порядке добавления
    void getAdded() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
        Film[] expected = new Film[]{one,two,three};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }
}