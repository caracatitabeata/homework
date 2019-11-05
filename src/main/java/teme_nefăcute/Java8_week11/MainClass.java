package teme_nefăcute.Java8_week11;

import lombok.Getter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter
public class MainClass {

    static List<Transaction> transactions;

    static Optional<Transaction> getMaxValueTransaction(){
        return transactions.stream()
                .max(Comparator.comparing(Transaction::getValue));
    }

    static List<Trader> getListOfTradersFrom(String city){
        return transactions.stream()
                .filter(a -> a.getTrader().getCity().equals(city))
                .map(Transaction::getTrader)
                .collect(Collectors.toList());
    }

    static boolean ifExistFrom(String city){
        return transactions.stream()
                .anyMatch(a-> a.getTrader().getCity().equals(city));
    }

    static List<Trader> sortTraderByName(){
        return transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
    }

    static List<String> getAllDistinctCities(){
        return transactions.stream()
                .map(t-> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    static List<Transaction> sortTransactionFromYear(Integer year){
        return transactions.stream()
                .filter(a-> a.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }
}
