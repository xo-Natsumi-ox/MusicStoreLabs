package ua.lviv.iot.musicStore.model;

public class Folk extends AbstractSong {
    private boolean isFolk;

    public Folk(int durationInMin) {
        super(durationInMin);
    }

    public boolean getIsFolk() {
        return isFolk;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "isFolk";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getIsFolk();
    }

}