package week2.book.app;

public class Novel extends Book {
    protected String type;

    public Novel(String name, int pages, String type) {
        super(name, pages);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
