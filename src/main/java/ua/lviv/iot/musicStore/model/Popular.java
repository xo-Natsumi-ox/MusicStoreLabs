package ua.lviv.iot.musicStore.model;

public class Popular extends AbstractSong {

    public Popular() {

    }

    public Popular(int durationInMin, Genre genre, int year) {
        super(durationInMin, genre, year);

    }
    public Popular(int durationInMin, Genre genre, int year, int id) {
        super(durationInMin, genre, year, id);

    }

    public String getHeaders() {
        return super.getHeaders() + "," + "genre";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getGenre();
    }
}