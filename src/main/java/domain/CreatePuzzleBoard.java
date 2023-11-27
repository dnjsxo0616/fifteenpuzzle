package domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CreatePuzzleBoard {
    public static int[][] createBoard() {
        List<Integer> numbers = createNumber();
        int[][] board = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = numbers.remove(0);
            }
        }

        return board;
    }

    private static List<Integer> createNumber() {
        List<Integer> numbers = IntStream.rangeClosed(0, 15)
                .boxed()
                .collect(Collectors.toList());

        Collections.shuffle(numbers);

        return numbers;
    }
}
