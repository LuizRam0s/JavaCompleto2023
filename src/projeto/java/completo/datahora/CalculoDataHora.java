package projeto.java.completo.datahora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {
    public static void main(String[] args) {
        LocalDate data04 = LocalDate.parse("2022-07-20");
        LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant data06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = data04.minusDays(7);
        LocalDate nextWeekLocalDate = data04.plusDays(7);
        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = data05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = data05.plusDays(7);
        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = data06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = data06.plus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant: " + pastWeekInstant);
        System.out.println("pastWeekInstant: " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, data05);
        System.out.println("t1 dias: " + t1.toDays());
        System.out.println("t1 dias: " + t1.toHours());

        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), data04.atStartOfDay());
        System.out.println("t2 dias: " + t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, data06);
        System.out.println("t3 dias: " + t3.toDays());

        Duration t4 = Duration.between(nextWeekInstant, data06);
        System.out.println("t4 dias: " + t4.toDays());



    }
}
