package week2.pos;
import java.util.List;
import java.util.Date;


public class POS {
    List<Account> accounts;

    public POS(List<Account> accounts) {
        this.accounts = accounts;
    }

    String pay(int amount, Card card) {
        for (Account iteratedAccount : accounts) {
            for (String iteratedString : iteratedAccount.cardNumber) {
                if (iteratedString.equals(card.getCardNumber())) {
                    if (card.getExpirationDate().after(new Date())) {
                    double trial = iteratedAccount.getBalance();
                    if (trial - amount < 0) {
                        return "Not enough money! Your balance is still: " + iteratedAccount.getBalance();
                    }
                    iteratedAccount.setBalance(iteratedAccount.getBalance() - amount);
                    return "Transaction successful! Your new sum is: " + iteratedAccount.getBalance();
                }
                    return "The card expired.";
                }
            }
        }
        return "No card found";
    }
}
