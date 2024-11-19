package baseball.controller;

import baseball.service.GameService;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class GameController {

    private final OutputView outputView;
    private final InputView inputView;
    private final GameService service;

    private List<Integer> numbers;

    public GameController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
        this.service = new GameService();
    }

    public void run() {
        printGameStart();
        makeNumbers();
    }

    private void printGameStart() {
        outputView.printGameStart();
    }

    private void makeNumbers() {
        numbers = service.makeNumbers();
    }
}
