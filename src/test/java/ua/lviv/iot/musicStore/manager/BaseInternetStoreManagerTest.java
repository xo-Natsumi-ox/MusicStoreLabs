package ua.lviv.iot.musicStore.manager;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.musicStore.model.AbstractSong;
import ua.lviv.iot.musicStore.model.Popular;

import java.util.LinkedList;
import java.util.List;

public abstract class BaseInternetStoreManagerTest {
    protected List<AbstractSong> popular;


    @BeforeEach
    public void createPopular() {
        popular = new LinkedList<AbstractSong>();

        popular.add(new Popular(5));
        popular.add(new Popular(13));
        popular.add(new Popular(4));


    }
}
