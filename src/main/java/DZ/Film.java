package DZ;

import java.util.Objects;

public class Film {

    private long id;
    private String filmName;
    private String filmGenre;
    private int filmYear;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public int getFilmYear() {
        return filmYear;
    }

    public void setFilmYear(int filmYear) {
        this.filmYear = filmYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id && filmYear == film.filmYear && Objects.equals(filmName, film.filmName) && Objects.equals(filmGenre, film.filmGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, filmName, filmGenre, filmYear);
    }


    @Override
    public String toString() {
        return "Film " +
                "id = " + id +
                ", filmName = '" + filmName + '\'' +
                ", filmGenre = '" + filmGenre + '\'' +
                ", filmYear = " + filmYear;
    }
}
