package view.output;

import view.contants.ConstantsMessage;

public class OutputView {
    public static void println(ConstantsMessage constantsMessage) {
        System.out.print(constantsMessage.getMessage());
        printNewLine();
    }

    public static void printNewLine() {
        System.out.println();
    }
}
