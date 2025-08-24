package tipo_date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Exercicios1 {
    public static void main(String[] args) {
        var dataNascimento = LocalDate.of(1993, 7, 13);
        var dataAtual = LocalDate.now();

        var resultado = Period.between(dataNascimento, dataAtual);

        System.out.format("Se passaram %d anos, %d meses e %d dias",
                resultado.getYears(),
                resultado.getMonths(),
                resultado.getDays()
        );

    }
}
