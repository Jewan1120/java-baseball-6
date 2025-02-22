package baseball.controller;

import baseball.enums.Constants;
import baseball.service.GameService;
import baseball.validator.GameValidator;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class GameController {

    private final OutputView outputView;
    private final InputView inputView;
    private final GameService service;

    private List<Integer> ComputerNumbers;

    public GameController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
        this.service = new GameService();
    }

    public void run() {
        boolean restartFlag = true;
        while (restartFlag) {
            printGameStart();
            makeComputerNumbers();
            proceedGame();
            printGameEnd();
            restartFlag = checkGameRestart();
        }
    }

    private void printGameStart() {
        outputView.printGameStart();
    }

    private void makeComputerNumbers() {
        ComputerNumbers = service.makeNumbers();
    }

    private void proceedGame() {
        boolean winningFlag = false;
        while (!winningFlag) {
            List<Integer> userNumbers = promptNumbers();
            List<Integer> result = service.judgeNumbers(ComputerNumbers, userNumbers);
            outputView.printResult(result);
            winningFlag = result.get(Constants.STRIKE_INDEX.getValue()) == Constants.NUMBERS_LENGTH.getValue();
        }
    }

    private List<Integer> promptNumbers() {
        String inputString = inputView.promptNumbers();
        GameValidator.validateNumbers(inputString);
        return service.makeNumbers(inputString);
    }

    private void printGameEnd() {
        outputView.printGameEnd();
    }

    private boolean checkGameRestart() {
        String inputString = inputView.promptRestart();
        GameValidator.validateRestart(inputString);
        String yes = String.valueOf(Constants.RESTART_YES.getValue());
        return inputString.equals(yes);
    }
}
