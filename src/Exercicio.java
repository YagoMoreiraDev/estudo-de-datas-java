import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("--------------- Instanciando uma data com o .parse() ---------------");
        LocalDate dt1 = LocalDate.parse("2025-08-25");
        LocalTime dt2 = LocalTime.parse("07:00:10");
        LocalDateTime dt3 = LocalDateTime.parse("2025-08-25T07:00:10");
        Instant dt4 = Instant.parse("2025-08-25T07:00:10Z");

        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);
        System.out.println(dt4);

        System.out.println("--------------- Instanciando uma data com o .of() ---------------");
        //Instante não possui o .of()
        LocalDate dt5 = LocalDate.of(2025, 8, 24);
        LocalTime dt6 = LocalTime.of(7,0,0);
        LocalDateTime dt7 = LocalDateTime.of(2025, 8, 24, 7, 0,0);

        System.out.println(dt5);
        System.out.println(dt6);
        System.out.println(dt7);

        System.out.println("--------------- Recebendo Datas o padrão BR e exibindo no padrao ISO ---------------");

        String dataPadraoBr1 = "20/07/2023";
        String dataPadraoBr2 = "13/07/2023 18:30:45";

        LocalDate convertendoDataPadraBrParaISO = LocalDate.parse(dataPadraoBr1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime convertendoDataTimePadraBrParaISO = LocalDateTime.parse(dataPadraoBr2, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        //Instant no seu metodo .parse() não recebe um DateTimeFormatter
        //Instant convertendoInstantPadraBrParaISO = Instant.parse(dataPadraoBr2, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(convertendoDataPadraBrParaISO);
        System.out.println(convertendoDataTimePadraBrParaISO);

        System.out.println("--------------- Formatandos Datas para o padrão BR ---------------");
        LocalDate dt8 = LocalDate.now();
        LocalTime dt9 = LocalTime.now();
        LocalDateTime dt10 = LocalDateTime.now();
        Instant dt11 = Instant.now();

        String localDateFormatado = dt8.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String localTimeFormatado = dt9.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String localDateTimeFormatado = dt10.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        //O Instant não tem o metodo .format(), o que eu vou ter que fazer é o seguinte:
        //1- Criar uma variavel do tipo DateTimeFormatter
        //2- Essa variavel vai receber o DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault())
        //3- Essa variavel do tipo DateTimeFormatter agora pode chamar o metodo .format()
        //4- e dentro desse metodo .format() eu passo como parametro a variavel do tipo Instant

        //Forma mais rápida:DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault()).format(instanteData)
        //Essa forma mais rápida eu já posso imprimir direito.

        DateTimeFormatter formatadorDeInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        System.out.format("Usando a forma NÃO rápida: %s%n", formatadorDeInstant.format(dt11));
        System.out.println("Usando a forma RÁPIDA: "+ DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm:ss")
                .withZone(ZoneId.systemDefault())
                .format(dt11)
        );
    }
}
