package view.output;

import view.contants.ConstantsMessage;

public class OutputView {
    public static void print(ConstantsMessage constantsMessage) {
        System.out.print(constantsMessage.getMessage());
    }

    public static void printNewLine() {
        System.out.println();
    }
}
