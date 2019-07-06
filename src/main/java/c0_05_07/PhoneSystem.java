package c0_05_07;

public interface PhoneSystem {
    void addContact(Contact contact);

    void sendMessage(Contact contact, String messageContent);
    void addCallToContact(Contact contact);

    void listCallHistory();
    void listMessagesHistory();
}
