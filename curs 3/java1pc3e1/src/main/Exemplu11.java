package main;

import java.time.*;

public class Exemplu11 {

    /*
        java.time

        LocalDate - gestioneaza o data locala
        LocalTime - gestioneaza ora locala
        LocalDateTime - gestioneaza data si ora locala
        ZonedDateTime - gestioneaza data si ora in functie time zone
        Period - perioada de ordinul zilelor (zile, saptamani, luni, ani,..)
        Duration - perioada de ordinul secundelor (milisecunda, secunda. minut, ora)
        Instant - timestamp-ul curent raportat la GMT
     */
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();

        System.out.println(ld1);

        LocalDate ld2 = LocalDate.of(2020, 5, 20);

        LocalTime lt1 = LocalTime.now();

        System.out.println(lt1);

        LocalTime lt2 = LocalTime.of(20, 15);
        System.out.println(lt2);

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);

        LocalDateTime ldt2 = LocalDateTime.of(2020, 1, 1, 20, 10);
        LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);

        System.out.println("=================");

        System.out.println(ldt3.isBefore(ldt1));
        System.out.println(ldt3.isAfter(ldt1));

        System.out.println("=================");

        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println(zdt1);

//        ZoneId.getAvailableZoneIds()
//                .stream()
//                .filter(id -> id.startsWith("Europe"))
//                .forEach(System.out::println);
        // Ctrl + /

        ZoneId londonZoneId = ZoneId.of("Europe/London");
        ZonedDateTime zdt2 = ZonedDateTime.now(londonZoneId);

        System.out.println(zdt2);

        ZonedDateTime zdt3 = ZonedDateTime.of(
                2020,
                7,
                1,
                0,
                0,
                0,
                0,
                ZoneId.of("Europe/Bucharest"));

        System.out.println(zdt3);

        System.out.println("=======");

        Period p1 = Period.ofDays(3).plusYears(1);
        System.out.println(p1);

        Duration d1 = Duration.ofDays(2)
                .plusSeconds(90);
        System.out.println(d1);

        Instant i1 = Instant.now();
        System.out.println(i1);
    }
}
