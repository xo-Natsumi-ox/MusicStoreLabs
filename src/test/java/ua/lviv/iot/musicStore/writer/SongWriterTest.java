package ua.lviv.iot.musicStore.writer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.musicStore.manager.BaseInternetStoreManagerTest;
import ua.lviv.iot.musicStore.model.AbstractSong;


import java.io.*;


import static org.junit.jupiter.api.Assertions.fail;

public class SongWriterTest extends BaseInternetStoreManagerTest {

    @Test
    public void testWriter() {
        try (Writer file = new FileWriter("Song.csv")) {
            SongWriter writer = new SongWriter();
            writer.setCsvWriter(file);
            writer.writeToFile(popular);
        } catch (Exception e) {
            fail("The testWriter failed");
        }
    }

    @Test
    public void testFormating() {
        try (Writer csvWriter = new StringWriter()) {
            SongWriter writer = new SongWriter();
            writer.setCsvWriter(csvWriter);
            writer.writeToFile(popular);
            String textWriter = "";

            for (AbstractSong song : popular) {
                textWriter += song.getHeaders() + ", " + song.toCSV() + "\r\n";
            }
            Assertions.assertEquals(textWriter, writer.stringWriter());


        } catch (Exception e) {
            fail("The testFormating failed");
        }

    }

}
