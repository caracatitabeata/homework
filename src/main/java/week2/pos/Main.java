package week2.pos;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(); // nou user

        Card card1 = new Card("Mihai", "2134RO", new GregorianCalendar(2050, Calendar.FEBRUARY, 11).getTime());
        user1.addCard(card1); //acest user are un card, card1, fără a avea și cont asociat lui; trebuie să primim
        //mesajul "No card found" în consolă.


        List<Card> cardsUser1 = new ArrayList<>(); //arrayList cu cardurile lui user1
        cardsUser1.add(new Card("Mihai", "3334RO", new GregorianCalendar(1020, Calendar.DECEMBER, 12).getTime()));
        cardsUser1.add(new Card("Mihai", "4344RO", new GregorianCalendar(2020, Calendar.DECEMBER, 12).getTime()));
        cardsUser1.add(new Card("Mihai", "6344RO", new GregorianCalendar(2020, Calendar.DECEMBER, 12).getTime()));
        List<String> cardNumbers1 = new ArrayList<>(); //arrayList cu numerele cardurilor lui user1; trebuie să coincidă.
        cardNumbers1.add("3334RO");
        cardNumbers1.add("4344RO");
        cardNumbers1.add("6344RO");
        Account accountUser1 = new Account("2222-BN", 20, cardNumbers1);

        List<Card> card2User1 = new ArrayList<>(); //arrayList cu cardurile lui user1
        card2User1.add(new Card("Mihai", "5334RO", new GregorianCalendar(2020, Calendar.DECEMBER, 12).getTime()));
        List<String> cardNumbers2User1 = new ArrayList<>(); //alt arrayList cu numerele cardurilor lui user1; trebuie să coincidă.
        cardNumbers2User1.add("5334RO");
        Account account2User1 = new Account("232-NB",30, cardNumbers2User1);
        account2User1.addCardNumber("2423BL"); //un cardNumber care nu e asociat niciunui card;

        user1.addBankAccount(accountUser1);
        user1.addBankAccount(account2User1);

        POS posUser1 = new POS(user1.getAccounts()); //un obiect POS pentru arrayList-ul de conturi ale lui user1

        System.out.println(posUser1.pay(30, cardsUser1.get(0))); //card expired
        System.out.println(posUser1.pay(30, cardsUser1.get(2))); //not enough money
        System.out.println(posUser1.pay(30, card2User1.get(0))); //transaction successful
        System.out.println(posUser1.pay(30, card1)); //no card found
    }
}
