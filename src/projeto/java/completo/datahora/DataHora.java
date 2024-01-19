package projeto.java.completo.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataHora {

    public static void main(String[] args) {
    //instanciando d data e data-hora atual
        LocalDate data01 = LocalDate.now();
        LocalDateTime data02 = LocalDateTime.now();
        Instant data03 = Instant.now();
        System.out.println("Date 01: " + data01);
        System.out.println("Date time 02: " + data02);
        System.out.println("Date time Londres 03: " + data03);

    //instanciando data e hora padrão iso
        LocalDate data04 = LocalDate.parse("2022-07-20");
        LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant data06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant data07 = Instant.parse("2022-07-20T01:30:26+03:00");
        System.out.println("Date 04: " + data04);
        System.out.println("Date time 05: " + data05);
        System.out.println("Date time Londres 06: " + data06);
        System.out.println("Date time SP 07: " + data07);

        //Formatando datas tipo 1
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate data08 = LocalDate.parse("20/07/28", formato1);
        System.out.println("Date 08: " + data08);
        //tipo 2
        LocalDateTime data09 = LocalDateTime.parse("20/07/28 22:53", DateTimeFormatter.ofPattern("dd/MM/yy HH:mm"));
        System.out.println("Date time 09: " + data09);

        LocalDate data10 = LocalDate.of(2024, 01, 19);
        LocalDateTime data11 = LocalDateTime.of(2024, 01, 16, 03, 17);

        System.out.println("Date 10: " + data10);
        System.out.println("Date time 11: " + data11);
    }
}
