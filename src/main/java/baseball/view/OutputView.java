package baseball.view;

import baseball.enums.Constants;
import baseball.enums.ViewMessages;
import java.util.List;

public class OutputView {

    public void printGameStart() {
        System.out.println(ViewMessages.GAME_START.getMessage());
    }

    public void printResult(List<Integer> result) {
        int ball = result.get(Constants.BALL_INDEX.getValue());
        int strike = result.get(Constants.STRIKE_INDEX.getValue());
        ViewMessages messages = ViewMessages.RESULT_NOTHING;
        if (ball > 0 && strike > 0) {
            messages = ViewMessages.RESULT_BALL_STRIKE;
        }
        if (ball == 0 && strike > 0) {
            messages = ViewMessages.RESULT_STRIKE;
        }
        if (ball > 0 && strike == 0) {
            messages = ViewMessages.RESULT_BALL;
        }
        System.out.println(messages.getMessage(ball, strike));
    }
}
