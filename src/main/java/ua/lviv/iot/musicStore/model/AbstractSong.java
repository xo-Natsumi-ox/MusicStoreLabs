package ua.lviv.iot.musicStore.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static java.lang.Integer.compare;

@Entity
public class AbstractSong implements Comparable<AbstractSong> {
    private int durationInMin;
    private Genre genre;
    private int year;
    private String singer;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //vkazye shcho pole ynikalne
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public AbstractSong() {

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

    public AbstractSong(int durationInMin, Genre genre, int year, String singer) {
        //this(durationInMin, genre, year);
        this.durationInMin = durationInMin;
        this.genre = genre;
        this.year = year;
        this.singer = singer;

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

    public void setDurationInMin(int durationInMin) {
        this.durationInMin = durationInMin;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
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