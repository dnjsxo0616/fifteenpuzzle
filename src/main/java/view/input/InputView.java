package view.input;

import view.contants.ConstantsMessage;
import view.output.OutputView;

import java.util.Scanner;

public class InputView {

    public static Integer readInput() {
        Scanner scanner = new Scanner(System.in);

        OutputView.print(ConstantsMessage.INPUT_MESSAGE);
        return scanner.nextInt();
    }
}
