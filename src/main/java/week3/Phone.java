package week3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Phone implements PhoneSystem {
    List<Contact> Contacts = new ArrayList<>();
    List<String> callHistory = new ArrayList<>();
    List<String> messageHistory = new ArrayList<>();

    String brandName;
    static int batteryLife = 5;

    String color;
    String material;

    public Phone(String brandName) {
        this.brandName = brandName;
    }

    public void addContact(Contact contact) {
        if (contact.getName() == null) {
            System.out.println("Please input a name for the contact: ");
            Scanner newName = new Scanner(System.in);
            contact.setName(newName.next());
        }
        Contacts.add(contact);
    }

    public void sendMessage(Contact contact, String messageContent) {
        try {
            if (batteryLife > 1) {
                contact.sendMessage(messageContent); ///metodă din clasa Contact
                batteryLife -= 1;
                System.out.println("Message sent!" + " Now your battery life is: " + batteryLife);

                messageHistory.add(messageContent);

            } else {
                System.out.println("Not enough battery! Your message to " + contact.getName() + " didn't send. ");
            }
        } catch (FooException e) {
            System.out.println("Your message didn't send! You exceeded the message limit by " + (messageContent.length() - 500) + " characters.");
        }
    }

    public void listMessagesForContact(Contact contact) {
        System.out.println("Your messages for " + contact.getPhoneNumber() + " are:");
        for (String iteratedMessage : contact.getMessageHistory()) {
            System.out.println(iteratedMessage);
        }
    }

    public void addCallToContact(Contact contact) {
        if (batteryLife > 0) {
            batteryLife -= 1;
            contact.addCallToContact(contact.getPhoneNumber());
            System.out.println("Call registered! " + "Now your battery life is: " + batteryLife);

            callHistory.add("A call to " + contact.getPhoneNumber());

        } else {
            System.out.println("Not enough battery! ");
        }
    }

    public void viewCallHistoryForContact(Contact contact) {
        System.out.println("Your call history for " + contact.getPhoneNumber() + " is: ");
        for (String iteratedCallHistory : contact.getCallHistory()) {
            System.out.println(iteratedCallHistory);
        }
    }

    public void listContacts() {
        System.out.println("Your contacts' names and phone numbers are: ");
        for (Contact contact : Contacts)
            System.out.println(contact.getIndex() + " " + contact.getName() + " and " + contact.getPhoneNumber());
    }

    public void listMessagesHistory() {
        System.out.println("Your message history is: ");
        Integer x = 1;
        for (String iteratedMessage : messageHistory) {
            System.out.println((x++).toString() + " " + iteratedMessage);
        }
    }

    public void listCallHistory() {
        System.out.println("Your call history is: ");
        Integer x1 = 1;
        for (String iteratedCall : callHistory) {
            System.out.println((x1++).toString() + " " + iteratedCall);
        }
    }

    public void getContact(int index) throws IndexOutOfBoundsException {
        Contacts.get(index);
    }
}