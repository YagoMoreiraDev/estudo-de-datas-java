package tipo_yearmonth;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Esse tipo é muito usado em sistemas financeiros, essa classe armazena duas informações:
        //Ano e o Mês -> muito usado para armazenamento de dados de cartão de crédito.

        YearMonth data = YearMonth.of(2032, 8);
        System.out.println(data);

        YearMonth novoAnoParaData = data.withYear(2025);
        System.out.println(novoAnoParaData);

        String formatado = novoAnoParaData.format(DateTimeFormatter.ofPattern("MM/yyyy"));
    }
}
