package baseball.service;

import baseball.enums.Constants;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class GameServiceTest {

    GameService service = new GameService();

    @RepeatedTest(100)
    void 랜덤_값_생성() {
        int numbersLength = service.makeNumbers().size();
        int expected = Constants.NUMBERS_LENGTH.getValue();

        Assertions.assertEquals(numbersLength, expected);
    }

    @Test
    void 입력_받은_문자열_리스트_변환() {
        String inputString = "123";
        List<Integer> expected = List.of(1, 2, 3);

        Assertions.assertEquals(service.makeNumbers(inputString), expected);
    }
}
