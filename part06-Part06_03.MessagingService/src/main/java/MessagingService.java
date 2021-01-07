import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;
    
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        String content = message.getContent();
        if (content.length() < 281) {
            messages.add(message);
        }
        return;
    }
    
    public ArrayList getMessages() {
        return this.messages;
    }
}
