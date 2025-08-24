package tipo_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class MainTipoDate {
    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat -> serve para definir formatos para conversão entre Date e String.
        SimpleDateFormat definicaoFormatoData = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat definicaoFormatoDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date data1 = definicaoFormatoData.parse("23/08/2025");
        Date date2 = Date.from(Instant.parse("2025-08-23T14:28:00Z"));

        System.out.println(definicaoFormatoData.format(data1));
        System.out.println(definicaoFormatoDataHora.format(date2));
    }
}
