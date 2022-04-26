
package ru.netology.manager;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import org.junit.jupiter.api.BeforeEach;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest{
    private Film one = new Film(1, "one", "Comedy", "www.oneFilm.com");
    private Film two = new Film(2, "two", "Detective", "www.twoFilm.com");
    private Film three = new Film(3, "three", "Drama", "www.threeFilm.com");
    private Film four = new Film(4, "four", "Horror", "www.fourFilm.com");
    private Film five = new Film(5, "five", "Anime", "www.fiveFilm.com");
    private Film six = new Film(6, "six", "Biography", "www.sixFilm.com");
    private Film seven = new Film(7, "seven", "Military", "www.sevenFilm.com");
    private Film eight = new Film(8, "eight", "Story", "www.eightFilm.com");
    private Film nine = new Film(9, "nine", "Music", "www.nineFilm.com");


    @Test // тест с новым лимитом фильмов
    void getLastNewQuantity() {
        PosterManager manager = new PosterManager(3);
        Film [] moviesList = new Film[] {one, two, three, four, five, six, seven, eight, nine};
        manager.setPoster(moviesList);
        manager.findLast();
        Film[] expected = new Film[]{nine,eight,seven};
        Film[] actual = manager.getPoster();
        assertArrayEquals(expected, actual);
    }
}


