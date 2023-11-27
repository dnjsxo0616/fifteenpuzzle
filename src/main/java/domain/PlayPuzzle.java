package domain;

public class PlayPuzzle {
    private static int[][] puzzle;

    public PlayPuzzle(int[][] board) {
        puzzle = board;
    }

    private static int[] findInputPosition(int input) {
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                if (puzzle[i][j] == input) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("유효한 숫자가 아닙니다.");
    }

    private static int[] findEmptyPosition() {
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                if (puzzle[i][j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("빈칸이 존재하지 않습니다.");
    }

}