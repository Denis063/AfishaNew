
package ru.netology.manager;
import lombok.Data;
import ru.netology.domain.Film;

@Data

public class PosterManager {
    private Film[] poster = new Film[0];
    private int filmQuantity = 10;

    public PosterManager() {
    }

    public PosterManager(int filmQuantity){
        this.filmQuantity = filmQuantity;
    }

    // геттеры и сеттеры
    public Film[] getPoster() {
        return poster;
    }

    public void setPoster(Film[] poster) {
        this.poster = poster;
    }

    public int getFilmQuantity() {
        return filmQuantity;
    }

    public void setFilmQuantity(int filmQuantity) {
        this.filmQuantity = filmQuantity;
    }

    //добавить новый фильм
    public void add(Film newFilm){
        int length = poster.length + 1;
        Film[] newPoster = new Film[length];
        for (int i = 0; i < poster.length; i++){
            newPoster[i] = poster[i];
        }
        newPoster[newPoster.length - 1] = newFilm;
        poster = newPoster;
    }
    //вывод всех фильмов в порядке добавления
    public Film[] findAll() {
        return poster;
    }

    //получить последний фильм
    public void findLast(){
        int moviesLength = poster.length;
        if (moviesLength > filmQuantity) {
            moviesLength = filmQuantity;
        }
        Film[] tmp = new Film[moviesLength];
        int index = poster.length - 1;
        for (int i = 0; i < moviesLength; i++) {
            tmp[i] = poster[index - i];
        }
        poster = tmp;
    }
}