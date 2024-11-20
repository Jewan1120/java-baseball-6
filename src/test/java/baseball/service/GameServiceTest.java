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

    @Test
    void 숫자들_비교하여_결과_반환() {
        List<Integer> computerNumbers = List.of(1, 2, 3);

        List<Integer> userNumbers1 = List.of(1, 2, 3);
        List<Integer> userNumbers2 = List.of(1, 2, 4);
        List<Integer> userNumbers3 = List.of(1, 3, 2);
        List<Integer> userNumbers4 = List.of(3, 1, 2);
        List<Integer> userNumbers5 = List.of(2, 5, 6);
        List<Integer> userNumbers6 = List.of(5, 6, 7);

        List<Integer> expected1 = List.of(0, 3);
        List<Integer> expected2 = List.of(0, 2);
        List<Integer> expected3 = List.of(2, 1);
        List<Integer> expected4 = List.of(3, 0);
        List<Integer> expected5 = List.of(1, 0);
        List<Integer> expected6 = List.of(0, 0);

        Assertions.assertEquals(service.judgeNumbers(computerNumbers, userNumbers1), expected1);
        Assertions.assertEquals(service.judgeNumbers(computerNumbers, userNumbers2), expected2);
        Assertions.assertEquals(service.judgeNumbers(computerNumbers, userNumbers3), expected3);
        Assertions.assertEquals(service.judgeNumbers(computerNumbers, userNumbers4), expected4);
        Assertions.assertEquals(service.judgeNumbers(computerNumbers, userNumbers5), expected5);
        Assertions.assertEquals(service.judgeNumbers(computerNumbers, userNumbers6), expected6);
    }
}
