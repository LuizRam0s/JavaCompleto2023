package projeto.java.completo.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;

public class ConversaoDataHora {

    public static void main(String[] args) {
        LocalDate data04 = LocalDate.parse("2022-07-20");
        LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant data06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate resultado1 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
        LocalDateTime resultado2 = LocalDateTime.ofInstant(data06, ZoneId.systemDefault());
        LocalDate resultado3 = LocalDate.ofInstant(data06, ZoneId.of("Portugal"));
        LocalDateTime resultado4 = LocalDateTime.ofInstant(data06, ZoneId.of("Portugal"));

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
        System.out.println("Resultado 4: " + resultado4);

        System.out.println("Data 04 dia:" + data04.getDayOfMonth());
        System.out.println("Data 04 mes:" + data04.getMonthValue());
        System.out.println("Data 04 mes:" + data04.getYear());

        System.out.println("Data 05 hora: " + data05.getHour());
    }
}
