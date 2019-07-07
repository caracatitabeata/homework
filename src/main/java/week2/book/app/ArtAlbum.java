package week2.book.app;

public class ArtAlbum extends Book{
    protected String paperQuality;

    public ArtAlbum(String name, int pages, String paperQuality) {
        super(name, pages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "ArtAlbum{" +
                "paperQuality='" + paperQuality + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
