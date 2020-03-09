package ua.lviv.iot.musicStore.manager;

import java.util.List;

import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ua.lviv.iot.musicStore.model.AbstractSong;


class InternetStoreManagerTest extends BaseInternetStoreManagerTest {

    private InternetStoreManager internetStoreManager;

    @BeforeEach
    public void setUp() {
        internetStoreManager = new InternetStoreManager();
        internetStoreManager.addSongs(popular);

    }

    @Test
    public void testFindSongByGenreOnCD() {
        List<AbstractSong> songOnCD = internetStoreManager.findSongByGenreOnCD(10);
        Assertions.assertEquals(1, songOnCD.size());

         Assertions.assertEquals(13, songOnCD.get(0).getDurationInMin());


    }

}