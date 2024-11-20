package baseball.view;

import baseball.enums.Constants;
import baseball.enums.ViewMessages;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String promptNumbers() {
        System.out.print(ViewMessages.RPOMPT_NUMBERS.getMessage());
        return Console.readLine();
    }

    public String promptRestart() {
        System.out.println(ViewMessages.PROMPT_RESTART.getMessage(Constants.RESTART_YES.getValue(),
                Constants.RESTART_NO.getValue()));
        return Console.readLine();
    }
}
