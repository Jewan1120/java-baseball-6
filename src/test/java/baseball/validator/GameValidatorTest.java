package baseball.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class GameValidatorTest {

    @ParameterizedTest
    @NullAndEmptySource
    void 빈_문자열_입력_예외(String inputString) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> GameValidator.validateRestart(inputString));
        Assertions.assertThrows(IllegalArgumentException.class, () -> GameValidator.validateNumbers(inputString));
    }

    @ParameterizedTest
    @ValueSource(strings = {"asdf", "1", "5354", "s", "q1w2e3r4"})
    void 길이가_다른_입력_예외(String inputString) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> GameValidator.validateNumbers(inputString));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a23", "1a3", "12a", "qwe", "-= "})
    void 숫자_외의_입력_예외(String inputString) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> GameValidator.validateNumbers(inputString));
    }

    @ParameterizedTest
    @ValueSource(strings = {"111", "122", "131"})
    void 중복_숫자_입력_예외(String inputString) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> GameValidator.validateNumbers(inputString));
    }

    @ParameterizedTest
    @ValueSource(strings = {"y", "n", "1", "2"})
    void 입력_형식_예외(String inputString) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> GameValidator.validateRestart(inputString));
    }
}
