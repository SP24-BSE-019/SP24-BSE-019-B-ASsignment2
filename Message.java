import java.time.LocalDateTime;

public class Message {
    private String sender;
    private String receiver;
    private String content;
    private LocalDateTime sendingTime;
    private LocalDateTime seenTime;
    private boolean seen;

    public Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.sendingTime = LocalDateTime.now();
        this.seen = false;
    }

    public String getSender() {
        return sender;
    }

    public void markAsSeen() {
        this.seen=true;
        this.seenTime=LocalDateTime.now();
    }

    public boolean isSeen() {
        return seen;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setContent(String newContent) {
        this.content =newContent;
    }


    public String toString() {
        return "Sender: " + sender + "\nReceiver: " + receiver +
                "\nContent: " + content + "\nSent: " + sendingTime +
                (seen ? "\nSeen at: " + seenTime : "\nNot yet seen");
    }
}

