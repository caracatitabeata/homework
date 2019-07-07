package week2.pos;
import java.util.List;

public class Account {
    //nice, encapsulation
    private String iban;
    private double balance;
    List<String> cardNumber;

    public Account(String iban, double balance, List<String> cards) {
        this.iban = iban;
        this.balance = balance;
        this.cardNumber = cards;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }

    double addMoney(int money) {
        balance = balance + money;
        return balance;
    }
    double withdrawMoney (int money) {
        balance = balance - money;
        return balance;
    }

    void addCardNumber(String cardNumber){
        this.cardNumber.add(cardNumber);
    }
}
