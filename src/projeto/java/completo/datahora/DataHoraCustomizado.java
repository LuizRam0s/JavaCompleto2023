package projeto.java.completo.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraCustomizado {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.parse("19/01/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime date2 = LocalDateTime.parse("19/01/2024 03:36", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        Instant date3 = Instant.parse("2024-01-19T03:42:55Z");

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("data 01: " + date1.format(formato1));
        System.out.println("data time 02: " + date2.format(formato2));
        System.out.println("data time londres 03: " + formato3.format(date3));
    }
}
