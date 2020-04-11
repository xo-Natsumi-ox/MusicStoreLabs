package ua.lviv.iot.musicStore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Popular extends AbstractSong {

    public Popular() {

    }

    public Popular(int durationInMin, Genre genre, int year, String singer) {
        super(durationInMin, genre, year, singer);
    }

    public Popular(int durationInMin, Genre genre, int year) {
        this(durationInMin, genre, year, null);

    }


    // public String getHeaders() {
    //    return super.getHeaders() + "," + "genre";
    //}

    public String toCSV() {
        return super.toCSV() + ", " + getGenre();
    }
}