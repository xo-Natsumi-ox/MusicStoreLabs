package ua.lviv.iot.musicStore.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.util.Set;

import static java.lang.Integer.compare;

@Entity
public class AbstractSong implements Comparable<AbstractSong> {
    private int durationInMin;
    private Genre genre;
    private int year;
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
        this(durationInMin, null, 0, null);
        this.genre = genre;
    }


    public AbstractSong(int durationInMin, Genre genre, int year, String name) {
        this.durationInMin = durationInMin;
        this.genre = genre;
        this.year = year;
        this.name = name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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