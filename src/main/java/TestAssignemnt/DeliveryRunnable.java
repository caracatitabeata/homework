package TestAssignemnt;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DeliveryRunnable implements Runnable {

    String targetLocation;
    LocalDate date;
    String path;

    Integer totalPrice;
    Integer time;

    static AtomicInteger inTotal = new AtomicInteger(0);

    public DeliveryRunnable(String targetLocation, LocalDate date, String path) {
        this.targetLocation = targetLocation;
        this.date = date;
        this.path = path;
    }

    @Override
    public void run() {
            deliverPackage();
            System.out.println("Delivering for <" + targetLocation + "> in <" + time + "> on <" + date + "> ");
    }

    public void deliverPackage() {
        List<Integer> prices = new ArrayList<>();

        List<String> list = DeliveryLoader.loadData(path, targetLocation, date);
        list.stream()
                .map(s-> s.split(","))
                .forEach(s-> {
                            int productPrice = Integer.parseInt(s[2].trim()); //gets the price of a product
                            prices.add(productPrice);
                            time = Integer.parseInt(s[1].trim()); //updates the time field
                        }
                );

        totalPrice = prices.stream().mapToInt(n-> n).sum(); //calculates the revenue for a package, 1 leu/ 1 km
        inTotal.addAndGet(totalPrice);//updates the total revenue
    }
}
