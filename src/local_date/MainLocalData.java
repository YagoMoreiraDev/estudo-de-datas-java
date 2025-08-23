package local_date;

import local_date.entities_localdate.Pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainLocalData {
    public static void main(String[] args) {

        System.out.println("--------------- TRABALHANDO COM DATAS ---------------");
        LocalDate date = LocalDate.of(2030, 7, 13);
        System.out.println(date);

        LocalDate date1 = LocalDate.parse("2030-07-13");
        System.out.println(date1);

        System.out.println("--------------- TRABALHANDO COM DATAS RECEBIDAS NO PADRAO BR ---------------");
        LocalDate date2 = LocalDate.parse("13/07/2030", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(date2);

        LocalDate date3 = LocalDate.now();
        System.out.println(date3);
        String dateFormatted = date3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(dateFormatted);

        System.out.println("--------------- TRABALHANDO COM DATAS FORMATADA VINDO DE UM OBJETO ---------------");
        //Exemplo:
        Pessoa p1 = new Pessoa("Yago Moreira");
        System.out.println("Data de criação: "+p1.getDataCriacao());

        System.out.println("--------------- OPERAÇÕES COM DATAS ---------------");
        //Alguma operações com metodos do LocalDate:
        //alterando o ano de uma data ex: LocalDate date = LocalDate.of(2030, 7, 13);
        System.out.println(date.withYear(2025));

        //alterando o mês de uma data ex: LocalDate date = LocalDate.of(2030, 7, 13);
        System.out.println(date.withMonth(12));

        //alterando o ano e mês de uma data ex: LocalDate date = LocalDate.of(2030, 7, 13);
        System.out.println(date.withYear(2035).withMonth(1));
        //convertendo a data acima para String e formato BR
        System.out.println(date.withYear(2035).withMonth(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("--------------- SUBTRAINDO VALORES DE DIAS EM DATAS ---------------");

        LocalDate date5 = LocalDate.of(2025,8,22);
        System.out.println("Data Original: "+date5);
        System.out.println("Data Formatada BR: "+date5.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Data com menos 5 dias: "+ date5.minusDays(5).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("--------------- SUBTRAINDO VALORES USANDO O CHRONOUNIT ---------------");
        LocalDate date6 = LocalDate.now();
        System.out.println("Data Original: "+date6);
        System.out.println("Data Formatada BR: "+date6.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Data com menos 10 dias: "+date6.minus(10, ChronoUnit.DAYS));
        System.out.println("Data com menos 10 dias Formatada BR: "+date6.minus(10, ChronoUnit.DAYS).format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy")
        ));
        System.out.println("Tirando agora 10 anos da data: "+date6.minus(10, ChronoUnit.YEARS));
        System.out.println("Tirando 10 anos da data Formatada BR: "+date6.minus(10, ChronoUnit.YEARS).format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy")
        ));
        System.out.println("--------------- SUBTRAINDO VALORES USANDO O CHRONOUNIT.DECADES ---------------");
        LocalDate date7 = LocalDate.of(2027, 8, 22);
        System.out.println("Usando o ChronoUnit.DECADES - 2 decadas: "+date7.minus(2, ChronoUnit.DECADES));

        System.out.println("--------------- PEGANDO VALORES DA DATA DE FORMA SEPARADA ---------------");
        System.out.println(date7.getYear());
        System.out.println(date7.getMonth());
        System.out.println(date7.getDayOfMonth());
        System.out.println(date7);

    }
}
