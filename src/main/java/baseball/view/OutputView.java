package baseball.view;

import baseball.enums.ViewMessages;

public class OutputView {
    public void printGameStart() {
        System.out.println(ViewMessages.GAME_START.getMessage());
    }
}
