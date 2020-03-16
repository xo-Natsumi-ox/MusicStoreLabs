package ua.lviv.iot.musicStore.writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.musicStore.model.AbstractSong;

public class SongWriter {
    private Writer csvWriter;

    public void setCsvWriter(Writer csvWriter) {
        this.csvWriter = csvWriter;
    }


    public void writeToFile(List<AbstractSong> songs) throws IOException {
        for (AbstractSong song : songs) {
            String textWriter = song.getHeaders() + ", " + song.toCSV() + "\r\n";
            csvWriter.write(textWriter);
        }

    }

    public String stringWriter() {
        return csvWriter.toString();
    }
}
