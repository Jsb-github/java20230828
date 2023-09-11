package ch15collection.book.exercise.p07;

public class Board {
    private  String title;
    private  String conetent;

    public Board(String title, String conetent) {
        this.title = title;
        this.conetent = conetent;
    }

    public String getTitle() {
        return title;
    }



    public String getConetent() {
        return conetent;
    }

    public void setConetent(String conetent) {
        this.conetent = conetent;
    }
}
