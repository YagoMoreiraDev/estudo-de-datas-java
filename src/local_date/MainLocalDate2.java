package local_date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainLocalDate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a data de entrada: ");
        LocalDate dataDeEntrada = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Informe a data de saida: ");
        LocalDate dataDeSaida = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(dataDeEntrada);
        System.out.println(dataDeSaida);

        System.out.println(Period.between(dataDeEntrada, dataDeSaida));

        //Aqui da erro:
        System.out.println(Duration.between(dataDeEntrada, dataDeSaida));


    }
}
