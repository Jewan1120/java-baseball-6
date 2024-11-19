package baseball.service;

import baseball.enums.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

public class GameServiceTest {

    GameService service = new GameService();

    @RepeatedTest(100)
    void 랜덤_값_생성() {
        int numbersLength = service.makeNumbers().size();
        int expected = Constants.NUMBERS_LENGTH.getValue();

        Assertions.assertEquals(numbersLength, expected);
    }
}
