package ua.lviv.iot.musicStore.model;

import javax.persistence.Entity;


@Entity
public class Popular extends AbstractSong {

    public Popular() {

    }

    public Popular(int durationInMin, Genre genre, int year, String name) {
        super(durationInMin, genre, year, name);
    }

    public Popular(int durationInMin, Genre genre, int year) {
        super(durationInMin, genre, year, null);

    }


    public String getHeaders() {
        return super.getHeaders() + "," + "genre";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getGenre();
    }
}