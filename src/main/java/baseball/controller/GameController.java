package baseball.controller;

import baseball.service.GameService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

    private final OutputView outputView;
    private final InputView inputView;
    private final GameService service;

    public GameController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
        this.service = new GameService();
    }

    public void run() {
        printGameStart();
    }

    private void printGameStart() {
        outputView.printGameStart();
    }
}
