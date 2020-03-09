package ua.lviv.iot.musicStore.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.musicStore.model.SortType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InternetStoreManagerUtilsTest extends BaseInternetStoreManagerTest {


    @Test
    public void testSortingDescending() {
        InternetStoreManagerUtils.sortByDurationInMin(popular, SortType.DESCENDING);
      //  assertEquals(5, popular.get(0).getDurationInMin());
      //  assertEquals(13, popular.get(1).getDurationInMin());
      //  assertEquals(4, popular.get(2).getDurationInMin());

    }

}
