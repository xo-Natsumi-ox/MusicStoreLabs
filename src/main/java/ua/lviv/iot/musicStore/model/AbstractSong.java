package ua.lviv.iot.musicStore.model;

import static java.lang.Integer.compare;

public abstract class AbstractSong implements Comparable<AbstractSong> {
    private int durationInMin;
    private Genre genre;
    private int year;
    private int id;


    public AbstractSong(){

    }
    public AbstractSong(int durationInMin) {
        this.durationInMin = durationInMin;
    }

    public AbstractSong(int durationInMin, Genre genre) {
        this(durationInMin);
        this.genre = genre;
    }

    public AbstractSong(int durationInMin, Genre genre, int year) {
        this(durationInMin, genre);
        this.year = year;

    }
    public AbstractSong(int durationInMin, Genre genre, int year, int id) {
        this(durationInMin, genre, year);
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDurationInMin() {
        return durationInMin;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public String getHeaders() {
        return "durationInMin, genre, year";
    }

    public String toCSV() {
        return getDurationInMin() + ", " + getGenre() + ", " + getYear();
    }


    @Override
    public int compareTo(AbstractSong another) {
        return compare(this.getDurationInMin(), another.getDurationInMin());
    }
}