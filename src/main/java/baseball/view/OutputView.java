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
        String message = ViewMessages.RESULT_NOTHING.getMessage();
        if (ball > 0 && strike > 0) {
            message = ViewMessages.RESULT_BALL_STRIKE.getMessage(ball,strike);
        }
        if (ball == 0 && strike > 0) {
            message = ViewMessages.RESULT_STRIKE.getMessage(strike);
        }
        if (ball > 0 && strike == 0) {
            message = ViewMessages.RESULT_BALL.getMessage(ball);
        }
        System.out.println(message);
    }
}
