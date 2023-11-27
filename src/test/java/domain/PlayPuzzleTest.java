package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayPuzzleTest {

    PlayPuzzle playPuzzle;

    @BeforeEach
    void setUp() {
        playPuzzle = new PlayPuzzle(new int[][]{
                {1, 2, 3, 0},
                {4, 5, 6, 10},
                {7, 8, 9, 11},
                {12, 13, 14, 15}
        });
    }

    @Test
    @DisplayName("위치_이동_테스트")
    public void testMoveNumber() {
        playPuzzle.moveNumber(3);
        int[][] comparisonPuzzle = {
                {1, 2, 0, 3},
                {4, 5, 6, 10},
                {7, 8, 9, 11},
                {12, 13, 14, 15}
        };

        assertArrayEquals(comparisonPuzzle, playPuzzle.getPuzzle());
    }

    @Test
    @DisplayName("유효하지_않은_이동_테스트")
    void validMove() {
        assertThrows(IllegalArgumentException.class, () -> playPuzzle.moveNumber(6),
                "유효한 위치가 아닙니다.");
    }

    @Test
    @DisplayName("유효하지_않은_숫자_테스트")
    void validNumber() {
        assertThrows(IllegalArgumentException.class, () -> playPuzzle.moveNumber(16),
                "유효한 숫자가 아닙니다.");
    }

    @Test
    @DisplayName("빈칸_존재하지_않는_상황_테스트")
    void noEmptyPosition() {
        PlayPuzzle noEmptyPlayPuzzle = new PlayPuzzle(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        });

        assertThrows(IllegalArgumentException.class, () -> noEmptyPlayPuzzle.moveNumber(3),
                "빈칸이 존재하지 않습니다.");
    }
}