package b_29_06.POS_App;
import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Card> cards = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();

    void addBankAccount (Account account){
        accounts.add(account);
    }
    //Nu prea văd rostul metodei ăsteia aici în clasa User, că fiecare cont oricum trebuie să aibă asociat un card...
    void addCard (Card card){
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
