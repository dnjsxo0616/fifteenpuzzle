package controller;

import domain.CreatePuzzleBoard;
import domain.PlayPuzzle;
import domain.TurnCount;
import view.contants.ConstantsMessage;
import view.input.InputView;
import view.output.OutputView;

public class Controller {
    private PlayPuzzle playPuzzle;
    private TurnCount turnCount;

    public void play() {
        initializeGame();
        playGame();
        finishGame();
    }

    private void initializeGame() {
        int[][] board = CreatePuzzleBoard.createBoard();
        playPuzzle = new PlayPuzzle(board);
        turnCount = new TurnCount();
        OutputView.print(ConstantsMessage.START_MESSAGE);
        OutputView.printNewLine();
        OutputView.printNewLine();
    }

    private void playGame() {
        while (!playPuzzle.checkPuzzle()) {
            playTurn();
        }
    }

    private void playTurn() {
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                turnCount.increaseCount();
                OutputView.println(ConstantsMessage.TURN_COUNT_MESSAGE, turnCount.getTurnCount());
                OutputView.printPuzzleBoard(playPuzzle.getPuzzle());
                playPuzzle.moveNumber(InputView.readInput());
                OutputView.printNewLine();
                isValidInput = true;
            } catch (IllegalArgumentException e) {
                OutputView.print(e.getMessage());
                OutputView.printNewLine();
            }
        }
    }

    private void finishGame() {
        OutputView.printPuzzleBoard(playPuzzle.getPuzzle());
        OutputView.println(ConstantsMessage.FINISH_MESSAGE, turnCount.getTurnCount());
    }
}
