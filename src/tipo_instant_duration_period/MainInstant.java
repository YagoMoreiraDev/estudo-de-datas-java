package tipo_instant_duration_period;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MainInstant {
    public static void main(String[] args) {
        System.out.println("-------------- PEGANDO UM HORARIO GLOBAL --------------");
        //Com o instante eu consigo pegar o horario global.
        Instant instanteData = Instant.now();
        System.out.println(instanteData);

        System.out.println(DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm:ss")
                .withZone(ZoneId.systemDefault())
                .format(instanteData)
        );

        System.out.println("-------------- PEGANDO UM HORARIO GLOBAL E CONVERTENDO EM UM HORARIO LOCAL --------------");
        //Pegando o Instante Globla atual
        Instant dataAtual = Instant.now();
        System.out.println(dataAtual);

        //Aqui eu to pegando somente a data de um Instante no tempo e convertendo para a data do ZoneId do usuario.
        System.out.println(LocalDate.ofInstant(dataAtual, ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(LocalTime.ofInstant(dataAtual, ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        //Metodo para buscar todos os fuso horarios customizados:
        //ZoneId.getAvailableZoneIds();
        System.out.println("-------------- MAIS HORARIO GLOBAL E CONVERTENDO EM UM HORARIO LOCAL --------------");

        Instant newDate = Instant.parse("2025-07-13T17:30:45Z");
        System.out.println(newDate);

        LocalDate dateLocal = LocalDate.ofInstant(newDate, ZoneId.systemDefault());
        System.out.println("Mostrando somente o date local: "+dateLocal);

        LocalTime timeLocal = LocalTime.ofInstant(newDate, ZoneId.systemDefault());
        System.out.println("Mostrando somente o time local: "+timeLocal);

        LocalDateTime dateTimeLocal = LocalDateTime.ofInstant(newDate, ZoneId.systemDefault());
        System.out.println("Mostrando somente o data e hora local: "+dateTimeLocal);
    }
}
