import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Instant data = Instant.parse("2018-06-25T15:42:07Z");

        System.out.println(data);

        Date dataComDate = Date.from(data);
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataComDate);
        cal.add(Calendar.YEAR, 2);
        int hours = cal.get(Calendar.HOUR);
        int minutos = cal.get(Calendar.MINUTE);
        int mes = cal.get(Calendar.MONTH);


        dataComDate = cal.getTime();
        System.out.println(dataComDate);
    }
}
