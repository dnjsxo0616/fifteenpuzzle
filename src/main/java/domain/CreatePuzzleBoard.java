package domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CreatePuzzleBoard {


    private static List<Integer> createNumber() {
        List<Integer> numbers = IntStream.rangeClosed(0, 15)
                .boxed()
                .collect(Collectors.toList());

        Collections.shuffle(numbers);

        return numbers;
    }
}
