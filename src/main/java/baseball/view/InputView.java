package baseball.view;

import baseball.enums.ViewMessages;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String promptNumbers() {
        System.out.print(ViewMessages.RPOMPT_NUMBERS.getMessage());
        return Console.readLine();
    }
}
