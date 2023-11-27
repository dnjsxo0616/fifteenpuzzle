package domain;

public class PlayPuzzle {
    private static int[][] puzzle;

    public PlayPuzzle(int[][] board) {
        puzzle = board;
    }

    public void moveNumber(int input) {
        int[] inputPositions = findInputPosition(input);
        int[] emptyPositions = findEmptyPosition();
        checkPossible(inputPositions, emptyPositions);

        changeNumber(inputPositions, emptyPositions);
    }

    private static void changeNumber(int[] inputPositions, int[] emptyPositions) {
        int temp = puzzle[inputPositions[0]][inputPositions[1]];
        puzzle[inputPositions[0]][inputPositions[1]] = puzzle[emptyPositions[0]][emptyPositions[1]];
        puzzle[emptyPositions[0]][emptyPositions[1]] = temp;
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

    private static void checkPossible(int[] pos1, int[] pos2) {
        int gap = Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
        if (!(gap == 1)) {
            throw new IllegalArgumentException("유요한 위치가 아닙니다.");
        }
    }

}
