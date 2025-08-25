package tipo_offsetdatetime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatadorDedata = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime dataExemplo = LocalDateTime.of(2025, 7, 13, 11, 0);
        /*
        OffsetDateTime odt = OffsetDateTime.now();
        OffsetDateTime odt1 = OffsetDateTime.of(dataExemplo, ZoneOffset.UTC);
        OffsetDateTime odt2 = odt1.withOffsetSameInstant(ZoneOffset.of("-03:00"));
        OffsetDateTime odt3 = odt1.withOffsetSameInstant(ZoneOffset.of("-03:00"));
        OffsetDateTime odt4 = odt.withOffsetSameInstant(ZoneOffset.of("-03:00"));

        System.out.println(dataExemplo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println(formatadorDedata.format(odt1));
        System.out.println(formatadorDedata.format(odt2));
        System.out.println(formatadorDedata.format(odt));
        System.out.println(formatadorDedata.format(odt4));
        */
        OffsetDateTime odt = OffsetDateTime.of(dataExemplo, ZoneOffset.UTC);
        System.out.println(formatadorDedata.format(dataExemplo));
        System.out.println(formatadorDedata.format(odt.withOffsetSameInstant(ZoneOffset.of("-03:00"))));
        System.out.println();
    }
}
