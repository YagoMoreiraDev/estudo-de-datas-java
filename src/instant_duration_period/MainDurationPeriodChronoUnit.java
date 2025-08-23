package instant_duration_period;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainDurationPeriodChronoUnit {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(1993, 7, 13);

        System.out.println("---------------------- USANDO DURATION E PERIOD ----------------------");

        Duration tempoDecorrido = Duration.between(date2.atStartOfDay(), date1.atStartOfDay());
        Period tempoDecorridoEmAnos = Period.between(date2, date1);

        System.out.println(tempoDecorrido.toDays());
        System.out.println(tempoDecorridoEmAnos.getYears());

        System.out.println("---------------------- FAZENDO OPERACOES COM DURATION E PERIOD ----------------------");

        LocalDate date3 = LocalDate.parse("2025-08-22");
        LocalDate date4 = LocalDate.parse("2025-08-25");

        Period periodoPermanencia = Period.between(date3, date4);

        System.out.println(date3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(date4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Periodo de permanencia de estadia foi de: "+periodoPermanencia.getDays());
        System.out.println(tempoDecorrido.toDays());
        System.out.println(tempoDecorridoEmAnos.getYears());

        System.out.println("---------------------- MELHOR FORMA DE CALCULAR PERMANENCIA EM DIAS COM CHRONOUNIT ----------------------");

        LocalDate date5 = LocalDate.parse("2025-09-01");
        LocalDate date6 = LocalDate.parse("2025-09-10");

        double valorFinal = valorViagem(date5, date6);
        System.out.println(valorFinal);

        LocalDate date7 = LocalDate.parse("2025-08-23");
        LocalDate date8 = LocalDate.parse("2026-04-23");

        contagemMeses(date7, date8);
    }

    public static double valorViagem(LocalDate entrada, LocalDate saida) {
        long dias = ChronoUnit.DAYS.between(entrada, saida);
        return dias * 560.0;
    }

    public static void contagemMeses(LocalDate entrada, LocalDate saida) {
        long meses = ChronoUnit.MONTHS.between(entrada, saida);
        System.out.printf("Passaram-se %d meses!", meses);
    }
}
