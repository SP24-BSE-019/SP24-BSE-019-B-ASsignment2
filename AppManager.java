import java.util.Scanner;

public class AppManager {
    private Message[][] messages;
    private int[] messageCounts;

    public AppManager() {
        messages = new Message[10][10];
        messageCounts = new int[10];
    }

    public void sendMessage(String sender, int receiverIndex, String content) {
        int messageCount = messageCounts[receiverIndex];

        if (messageCount < 10) {
            messages[receiverIndex][messageCount] = new Message(sender, "Receiver_" + receiverIndex, content);
            messageCounts[receiverIndex]++;
        } else {
            System.out.println("Receiver's message box is full.");
        }
    }

    public void viewUnseenMessages(int receiverIndex) {
        for (int i=0; i<messageCounts[receiverIndex]; i++) {
            if (!messages[receiverIndex][i].isSeen()) {
                System.out.println(messages[receiverIndex][i]);
            }
        }
    }

    public void markMessageAsSeen(int receiverIndex, int messageIndex) {
        if (receiverIndex<10 && messageIndex<messageCounts[receiverIndex]) {
            messages[receiverIndex][messageIndex].markAsSeen();
        } else {
            System.out.println("Invalid message index");
        }
    }

    public void displayAllMessages(int receiverIndex) {
        for (int i=0; i<messageCounts[receiverIndex]; i++) {
            System.out.println(messages[receiverIndex][i]);
        }
    }

    public void updateMessage(int receiverIndex, int messageIndex, String newContent) {
        if (receiverIndex<10 && messageIndex<messageCounts[receiverIndex]) {
            messages[receiverIndex][messageIndex].setContent(newContent);
            System.out.println("Message updated.");
        } else{
            System.out.println("Invalid message index.");
        }
    }

    public void searchMessage(int receiverIndex, String keyword) {
        boolean found = false;
        for (int i = 0; i < messageCounts[receiverIndex]; i++) {
            if (messages[receiverIndex][i].toString().contains(keyword)) {
                System.out.println("Message found:\n" + messages[receiverIndex][i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No message found with the keyword: " + keyword);
        }
    }






}
