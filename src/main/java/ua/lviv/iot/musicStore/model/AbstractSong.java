package ua.lviv.iot.musicStore.model;

public abstract class AbstractSong {
    private int durationInMin;

    public AbstractSong(){

    };
    public AbstractSong(int durationInMin) {
        this.durationInMin = durationInMin;
    }

    public int getDurationInMin() {
        return durationInMin;
    }

    public void setDurationInMin(int durationInMin) {
        this.durationInMin = durationInMin;
    }
}
