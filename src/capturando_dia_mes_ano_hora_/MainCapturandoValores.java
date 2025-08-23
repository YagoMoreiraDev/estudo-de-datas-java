package capturando_dia_mes_ano_hora_;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MainCapturandoValores {
    public static void main(String[] args) {
        Instant dataGlobalAtual = Instant.now();

        LocalDateTime dataGlobalConvertidaLocal = LocalDateTime
                .ofInstant(dataGlobalAtual, ZoneId.systemDefault());

        System.out.println(dataGlobalConvertidaLocal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalDate dataTeste = LocalDate.of(1993, 7, 13);

        String dataTesteConvertida = dataTeste.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(dataTeste);
        System.out.println(dataTesteConvertida);

        System.out.println(dataGlobalConvertidaLocal.getMonth());
        System.out.println(dataTeste.getYear());
        System.out.println(dataTeste.getMonth());
        System.out.println(dataGlobalConvertidaLocal.getHour());


    }
}
