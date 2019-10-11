package TestAssignemnt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeliveryLoader {

    //this method loads data from a file, and filters a specific target location along with a date
    public static List<String> loadData(String pathLocation, String targetLocation, LocalDate date) {
        Path path = Paths.get(pathLocation).toAbsolutePath().normalize();
        try (Stream<String> stream = Files.lines(path)) {
                 return stream.filter(s -> s.contains(targetLocation))
                    .filter(s -> s.contains(date.toString()))
                    .collect(Collectors.toList());
        } catch (IOException i) {
            System.err.println("Caught IOException: " + i.getMessage());
            throw new RuntimeException("thrown again");
        }
    }
}
