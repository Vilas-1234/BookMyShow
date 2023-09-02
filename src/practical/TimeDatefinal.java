package practical;

import java.io.Serializable;
import java.time.*;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

public final class TimeDatefinal   implements Temporal,
        TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {

    @Override
    public LocalDate toLocalDate() {
        return null;
    }

    @Override
    public LocalTime toLocalTime() {
        return null;
    }

    @Override
    public ChronoLocalDateTime<LocalDate> with(TemporalField field, long newValue) {
        return null;
    }

    @Override
    public ChronoLocalDateTime<LocalDate> plus(long amountToAdd, TemporalUnit unit) {
        return null;
    }

    @Override
    public long until(Temporal endExclusive, TemporalUnit unit) {
        return 0;
    }

    @Override
    public ChronoZonedDateTime<LocalDate> atZone(ZoneId zone) {
        return null;
    }

    @Override
    public boolean isSupported(TemporalField field) {
        return false;
    }

    @Override
    public long getLong(TemporalField field) {
        return 0;
    }
}
class rama{
    void show(){
        System.out.println ("ram" );
        System.out.println (TimeDatefinal.class
        );
    }

    public static void main(String[] args) {
        rama r= new rama ();
        r.show ();
    }
}