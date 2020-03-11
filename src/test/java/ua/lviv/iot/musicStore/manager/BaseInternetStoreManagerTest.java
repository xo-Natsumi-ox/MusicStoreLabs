package ua.lviv.iot.musicStore.manager;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.musicStore.model.*;

import java.util.LinkedList;
import java.util.List;

import static ua.lviv.iot.musicStore.model.Genre.*;

public abstract class BaseInternetStoreManagerTest {
    protected List<AbstractSong> popular;
    protected List<AbstractSong> folk;
    protected List<AbstractSong> art;
    protected List<AbstractSong> religious;


    @BeforeEach
    public void createPopular() {
        popular = new LinkedList<>();
        religious = new LinkedList<>();
        folk = new LinkedList<>();
        art = new LinkedList<>();

        popular.add(new Popular(5, POP, 2019));
        popular.add(new Popular(13, ROCK, 2007));
        popular.add(new Popular(4, RAP, 2016));
        popular.add(new Popular(6, ELECTRO, 2013));
        popular.add(new Popular(11, CLASSIC, 1990));
        popular.add(new Popular(3, ROCK, 2002));
        religious.add(new Religious(5));
        folk.add(new Folk(9));
        folk.add(new Folk(3));
        folk.add(new Folk(2));
        folk.add(new Folk(7));
        art.add(new Art(12));

    }
}
