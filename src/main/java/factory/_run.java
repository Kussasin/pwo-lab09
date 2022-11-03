package factory;

import java.time.DayOfWeek;
import static java.time.DayOfWeek.*;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 *
 * @author Bohdan Basistyi
 */

public class _run {

    public static void main(String[] args) {
        MessageFactory factory = null;

        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek
                = DayOfWeek.of(today.get(ChronoField.DAY_OF_WEEK));

        switch (dayOfWeek) {
            case MONDAY -> factory = new Monday();
            case TUESDAY -> factory = new Tuesday();
            case WEDNESDAY -> factory = new Wednesday();
            case THURSDAY -> factory = new Thursday();
            case FRIDAY -> factory = new Friday();
            case SATURDAY -> factory = new Saturday();
            case SUNDAY -> factory = new Sunday();
        }
        
        System.out.println(factory.createIntroMessage());
        System.out.println(factory.createMainMessage());
        System.out.println(factory.createClosingMessage());
    }
}
