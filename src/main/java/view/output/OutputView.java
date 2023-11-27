package view.output;

import view.contants.ConstantsMessage;

public class OutputView {
    public static void print(ConstantsMessage constantsMessage) {
        System.out.print(constantsMessage.getMessage());
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void printPuzzleBoard(int[][] puzzleBoard) {
        for (int[] numbers : puzzleBoard) {
            for (int number : numbers) {
                if (number == 0) {
                    System.out.print(ConstantsMessage.EMPTY_PARENTHESIS_MESSAGE.getMessage());
                } else {
                    System.out.printf(ConstantsMessage.PARENTHESIS_MESSAGE.getMessage(), number);
                }
            }
            printNewLine();
        }
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
