package week3;
import java.util.List;
import java.util.ArrayList;

public class Contact {
    String name;
    String phoneNumber;
    String index;

    List<String> messageHistory = new ArrayList<>();
    List<String> callHistory = new ArrayList<>();

    Contact(String name, String phoneNumber, String index) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.index = index;
    }

    Contact(String phoneNumber, String index) {
        this.phoneNumber = phoneNumber;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }


    void sendMessage(String messageContent) throws FooException {
        if (messageContent.length() > 500) {
            throw new FooException("Exceed limit");
        }
        messageHistory.add(messageContent);
    }

    void addCallToContact(String phoneNumber) {
        callHistory.add(phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getCallHistory() {
        return callHistory;
    }

    public List<String> getMessageHistory() {
        return messageHistory;
    }
}
