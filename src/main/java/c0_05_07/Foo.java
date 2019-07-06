package c0_05_07;

public class Foo {
    public static void main(String[] args) {
        Phone phone1 = new SamsungGalaxyS6("pink", "nylon", "12232131");
        Phone phone2 = new SamsungGalaxyS6("green", "metal", "21241423");

        Contact contact1 = new Contact("Gigi", "12321312", "1");
        Contact contact2 = new Contact("GOD", "Unknown", "2");
        Contact contact3 = new Contact("1232344", "3");
        phone1.sendMessage(contact1, "Lobsters have long bodies with muscular tails, and live in crevices or burrows on the sea floor. Three of their five pairs of legs have claws, including the first pair, which are usually much larger than the others. Highly prized as seafood, lobsters are economically important, and are often one of the most profitable commodities in coastal areas they populate.[2] Commercially important species include two species of Homarus (which looks more like the stereotypical lobster) from the northern Atlantic Ocean, and scampi (which looks more like a shrimp, or a \"mini lobster\") – the Northern Hemisphere genus Nephrops and the Southern Hemisphere genus Metanephrops. Although several other groups of crustaceans have the word \"lobster\" in their names, the unqualified term \"lobster\" generally refers to the clawed lobsters of the family Nephropidae.[3] Clawed lobsters are not closely related to spiny lobsters or slipper lobsters, which have no claws (chelae), or to squat lobsters. The closest living relatives of clawed lobsters are the reef lobsters and the three families of freshwater crayfish. :D");
        //the above message didn't send, as expected;

        phone1.sendMessage(contact1, "Bă azi joakă Rapidu hai la o sămânț, după o ardem în centru vechi");

        phone1.listMessagesForContact(contact1);

        phone1.addCallToContact(contact1);
        phone1.addCallToContact(contact2);
        phone1.addCallToContact(contact3); //Contactul 3 nu are nume. Va trebui să-l introduci de la tastatură.

        phone1.viewCallHistoryForContact(contact1);

        phone1.addContact(contact1);
        phone1.addContact(contact2);
        phone1.addContact(contact3);

        phone1.listContacts();
        phone1.listCallHistory();
        phone1.listMessagesHistory();

        phone1.sendMessage(contact2, "Doamne ajută"); //Message not sent. That's sad.

        phone1.getContact(-1); //voiam să văd cum arată un RuntimeException
    }
}
