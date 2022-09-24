import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date{

    public static void main(String[] args) {
        String StringDate = "August 24, 2022";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(StringDate, formatter);

        System.out.println(date);
    }
}
