package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CreatePuzzleBoardTest {
    int[][] puzzleBoard = CreatePuzzleBoard.createBoard();

    @Test
    @DisplayName("보드_중복_테스트")
    void validateDuplicate() {
        Set<Integer> comparisonBoard = new HashSet<>();

        for(int[] numbers : puzzleBoard) {
            for(int number : numbers) {
                assertTrue(number >= 0 && number <= 15);
                comparisonBoard.add(number);
            }
        }

        assertEquals(16, comparisonBoard.size());
    }
}