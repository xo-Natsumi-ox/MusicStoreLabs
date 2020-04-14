package ua.lviv.iot.musicStore.model;

public class Art extends AbstractSong {
    private String period;

    public Art(int durationInMin) {
        super(durationInMin);
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "period";
    }

    public String getPeriod() {
        return period;
    }

    public String toCSV() {
        return super.toCSV() + ", " + getPeriod();
    }
}