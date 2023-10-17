package junk;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TryOptional {

    //Find first number in every list which can be divided by 5 and find biggest

    List<List<Integer>> listOfNumbers = List.of(
            List.of(1, 2, 3, 4, 5),
            List.of(11, 15, 20, 21, 25),
            List.of(10, 16, 21, 12, 15)
    );

    @Test
    public void execute() {
        System.out.println(findNumber());
    }

    public Integer findNumber() {
        return listOfNumbers.stream()
                .map(list -> list.stream()
                        .filter(number -> number % 5 == 0)
                        .findFirst()
                        .get())
                .max(Integer::compare)
                .get();

    }



}
