package ch15collection.book.sec06.exam02;

public class Message {
    private String command;
    private String to;

    public Message() {
    }

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }
}
