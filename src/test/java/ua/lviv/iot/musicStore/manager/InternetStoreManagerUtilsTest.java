package ua.lviv.iot.musicStore.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.musicStore.model.Genre;
import ua.lviv.iot.musicStore.model.SortType;

 class InternetStoreManagerUtilsTest extends BaseInternetStoreManagerTest {


    @Test
    public void testSortingDescending() {
        InternetStoreManagerUtils.sortByDurationInMin(folk, SortType.DESCENDING);
        Assertions.assertEquals(9, folk.get(0).getDurationInMin());
        Assertions.assertEquals(7, folk.get(1).getDurationInMin());
        Assertions.assertEquals(3, folk.get(2).getDurationInMin());
        Assertions.assertEquals(2, folk.get(3).getDurationInMin());


    }

    @Test
    public void testSortByYear() {
        InternetStoreManagerUtils.sortByYear(popular, SortType.ASCENDING);
        Assertions.assertEquals(1990, popular.get(0).getYear());
        Assertions.assertEquals(2002, popular.get(1).getYear());
        Assertions.assertEquals(2007, popular.get(2).getYear());
        Assertions.assertEquals(2013, popular.get(3).getYear());
        Assertions.assertEquals(2016, popular.get(4).getYear());
        Assertions.assertEquals(2019, popular.get(5).getYear());
    }

    @Test
    public void testSortByGenreComparing() {
        InternetStoreManagerUtils.sortByGenre(popular, SortType.DESCENDING);
        Assertions.assertEquals(Genre.CLASSIC, popular.get(0).getGenre());
        Assertions.assertEquals(Genre.ELECTRO, popular.get(1).getGenre());
        Assertions.assertEquals(Genre.RAP, popular.get(2).getGenre());
        Assertions.assertEquals(Genre.POP, popular.get(3).getGenre());
        Assertions.assertEquals(Genre.ROCK, popular.get(4).getGenre());
        Assertions.assertEquals(Genre.ROCK, popular.get(5).getGenre());
    }


    @Test
    public void testSortByGenreCompare() {
        InternetStoreManagerUtils.sortByDurationInMinAndGenre(popular, SortType.ASCENDING);
        Assertions.assertEquals(Genre.ROCK, popular.get(0).getGenre());
        Assertions.assertEquals(Genre.RAP, popular.get(1).getGenre());
        Assertions.assertEquals(Genre.POP, popular.get(2).getGenre());
        Assertions.assertEquals(Genre.ELECTRO, popular.get(3).getGenre());
        Assertions.assertEquals(Genre.CLASSIC, popular.get(4).getGenre());
        Assertions.assertEquals(Genre.ROCK, popular.get(5).getGenre());


    }
}
