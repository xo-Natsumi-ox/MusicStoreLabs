package ua.lviv.iot.musicStore.manager;

import ua.lviv.iot.musicStore.model.AbstractSong;
import ua.lviv.iot.musicStore.model.SortType;


import java.util.Comparator;

import java.util.List;

public class InternetStoreManagerUtils {

    private static final PopularSorterByDurationInMin SONG_BY_DURATION_IN_MIN_SORTER = new PopularSorterByDurationInMin();

    private static class PopularSorterByDurationInMin implements Comparator<AbstractSong> {

        @Override
        public int compare(AbstractSong firstSong, AbstractSong secondSong) {
            return firstSong.getDurationInMin() - secondSong.getDurationInMin();
        }
    }

    private class PopularSorterByGenre implements Comparator<AbstractSong> {
        @Override
        public int compare(AbstractSong firstSong, AbstractSong secondSong) {
            return firstSong.compareTo(secondSong);
        }

    }

    public static void sortByDurationInMin(List<AbstractSong> songs, SortType sortType) {

        songs.sort(sortType == SortType.ASCENDING ? SONG_BY_DURATION_IN_MIN_SORTER : SONG_BY_DURATION_IN_MIN_SORTER.reversed());
    }

    public static void sortByGenre(List<AbstractSong> songs, SortType sortType) {
        Comparator<AbstractSong> comparator = Comparator.comparing(AbstractSong::getGenre);
        songs.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }

    public static void sortByDurationInMinAndGenre(List<AbstractSong> songs, SortType sortType) {


        Comparator<AbstractSong> comparator = new Comparator<>() {

            @Override
            public int compare(AbstractSong firstSong, AbstractSong secondSong) {

                int capacityComparisonResult = firstSong.getDurationInMin() - secondSong.getDurationInMin();

                if (capacityComparisonResult != 0) {
                    return capacityComparisonResult;
                }

                return firstSong.getGenre().compareTo(secondSong.getGenre());

            }
        };
        songs.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }


    public static void sortByYear(List<AbstractSong> songs, SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            songs.sort((firstSong, secondSong) -> Integer.compare(firstSong.getYear(), secondSong.getYear()));
        } else {
            songs.sort((secondSong, firstSong) -> Integer.compare(secondSong.getYear(), firstSong.getYear()));

        }
    }
}

