package ua.lviv.iot.musicStore.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.musicStore.model.AbstractSong;


public class InternetStoreManager {
    private List<AbstractSong> songs = new LinkedList<>();


    public void addSongs(List<AbstractSong> songs) {
        this.songs.addAll(songs);

    }

    public void addSong(AbstractSong song) {
        this.songs.add(song);

    }


    public List<AbstractSong> findSongByGenreOnCD(int durationInMin) {

        List<AbstractSong> result = new LinkedList<>();
        for (AbstractSong song : songs) {
            if (song.getDurationInMin() > durationInMin) {
                result.add(song);
            }
        }
        return result;
    }

}