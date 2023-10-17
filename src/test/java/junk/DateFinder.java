package junk;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DateFinder {

    @Test
    public void getDateList() {
        System.out.println(findDates(LocalDate.parse("2023-09-28"), LocalDate.parse("2023-10-06"), 2));
    }

    public List<LocalDate> findDates(LocalDate dateFrom, LocalDate dateTo, Integer period) {
        return dateFrom.datesUntil(dateTo, Period.ofDays(period))
                .filter(date -> date.getDayOfWeek().getValue() < DayOfWeek.SATURDAY.getValue())
                .collect(Collectors.toList());
    }
}
