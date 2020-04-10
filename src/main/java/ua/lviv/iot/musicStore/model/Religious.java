package ua.lviv.iot.musicStore.model;

public class Religious extends AbstractSong {
    private String religiousGenre;

    public Religious(int durationInMin) {
        super(durationInMin);
    }

    public String getReligiousGenre() {
        return religiousGenre;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "religiousGenre";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getReligiousGenre();
    }

}