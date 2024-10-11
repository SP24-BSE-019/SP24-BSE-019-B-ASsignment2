import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppManager app = new AppManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Send Message");
            System.out.println("2. View Unseen Messages");
            System.out.println("3. Display All Messages");
            System.out.println("4. Mark Message as Seen");
            System.out.println("5. update message");
            System.out.println("6. Search Message");
            System.out.println("71. exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Sender: ");
                    String sender = scanner.nextLine();
                    System.out.print("Enter Receiver (0-9):\n 1. Shanzay\n 2. Ahmad\n 3. Abdullah\n 4. Javeria\n 5. Arslan\n 6. Anaya\n 7. Haroon\n 8. Asad\n 9. zarnab\n ");
                    int receiver = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Content: ");
                    String content = scanner.nextLine();
                    app.sendMessage(sender, receiver, content);
                    break;
                case 2:
                    System.out.print("Enter Receiver (0-9):\n 1. Shanzay\n 2. Ahmad\n 3. Abdullah\n 4. Javeria\n 5. Arslan\n 6. Anaya\n 7. Haroon\n 8. Asad\n 9. zarnab\n ");
                    int receiverIndex = scanner.nextInt();
                    app.viewUnseenMessages(receiverIndex);
                    break;
                case 3:
                    System.out.print("Enter Receiver (0-9):\n 1. Shanzay\n 2. Ahmad\n 3. Abdullah\n 4. Javeria\n 5. Arslan\n 6. Anaya\n 7. Haroon\n 8. Asad\n 9. zarnab\n ");
                    int allMessagesReceiver = scanner.nextInt();
                    app.displayAllMessages(allMessagesReceiver);
                    break;
                case 4:
                    System.out.print("Enter Receiver (0-9):\n 1. Shanzay\n 2. Ahmad\n 3. Abdullah\n 4. Javeria\n 5. Arslan\n 6. Anaya\n 7. Haroon\n 8. Asad\n 9. zarnab\n ");
                    int receiverForSeen = scanner.nextInt();
                    System.out.print("Enter Message Index (0-9): ");
                    int messageIndex = scanner.nextInt();
                    app.markMessageAsSeen(receiverForSeen, messageIndex);
                    break;
                case 5:
                    System.out.print("Enter Receiver (0-9):\n 1. Shanzay\n 2. Ahmad\n 3. Abdullah\n 4. Javeria\n 5. Arslan\n 6. Anaya\n 7. Haroon\n 8. Asad\n 9. zarnab\n ");
                    int receiverToUpdate = scanner.nextInt();
                    System.out.print("Enter Message Index (0-9): ");
                    int messageToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Content: ");
                    String newContent = scanner.nextLine();
                    app.updateMessage(receiverToUpdate, messageToUpdate, newContent);
                    break;
                case 6:
                    System.out.print("Enter Receiver (0-9):\n 1. Shanzay\n 2. Ahmad\n 3. Abdullah\n 4. Javeria\n 5. Arslan\n 6. Anaya\n 7. Haroon\n 8. Asad\n 9. Zarnab\n ");
                    int receiverSearch = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    app.searchMessage(receiverSearch, keyword);
                    break;
                case 7:
                    System.out.println("code terminates");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
