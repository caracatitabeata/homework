package TestAssignemnt;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TestCase {
    @Test
    public void checkResult() throws InterruptedException {
        String path = "src\\main\\java\\TestAssignemnt\\Delivery.txt";

        Runnable d = new DeliveryRunnable("Apahida", LocalDate.of(2017, 9, 1), path);
        Thread t3 = new Thread(d);
        t3.start();
        Runnable d2 = new DeliveryRunnable("Floresti", LocalDate.of(2017,9,3),path);
        Thread t2 = new Thread(d2);
        t2.start();
        Runnable d3 = new DeliveryRunnable("Turda", LocalDate.of(2017,9,2), path);
        Thread t = new Thread(d3);
        t.start();

        t3.join();
        t2.join();
        t.join();

        Assert.assertEquals(449+1047+847, DeliveryRunnable.inTotal.get());
    }
}
