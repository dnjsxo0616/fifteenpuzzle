package controller;

import domain.CreatePuzzleBoard;
import domain.PlayPuzzle;
import domain.TurnCount;
import view.contants.ConstantsMessage;
import view.input.InputView;
import view.output.OutputView;

public class Controller {

    public void play() {
        int[][] board = CreatePuzzleBoard.createBoard();
        PlayPuzzle playPuzzle = new PlayPuzzle(board);
        TurnCount turnCount = new TurnCount();

        OutputView.print(ConstantsMessage.START_MESSAGE);
        OutputView.printNewLine();
        OutputView.printNewLine();

        while(!playPuzzle.checkPuzzle()) {
            boolean isValidInput = false;
            while(!isValidInput) {
                try {
                    turnCount.increaseCount();
                    OutputView.println(ConstantsMessage.TURN_COUNT_MESSAGE, turnCount.getTurnCount());

                    OutputView.printPuzzleBoard(playPuzzle.getPuzzle());

                    playPuzzle.moveNumber(InputView.readInput());
                    isValidInput = true;
                } catch (IllegalArgumentException e) {
                    OutputView.print(e.getMessage());
                    OutputView.printNewLine();
                }
            }
        }

        OutputView.printPuzzleBoard(playPuzzle.getPuzzle());
        OutputView.println(ConstantsMessage.FINISH_MESSAGE, turnCount.getTurnCount());
    }
}
