package baseball.validator;

import baseball.enums.Constants;
import baseball.enums.ErrorMessages;

public class GameValidator {

    public static void validateNumbers(String inputString) {
        checkEmpty(inputString);
        checkLength(inputString);
        checkNumber(inputString);
        checkUnique(inputString);
    }

    private static void checkEmpty(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessages.INPUT_EMPTY.getMessage());
        }
    }

    private static void checkLength(String inputString) {
        if (inputString.length() != Constants.NUMBERS_LENGTH.getValue()) {
            throw new IllegalArgumentException(
                    ErrorMessages.INPUT_LENGTH.getMessage(Constants.NUMBERS_LENGTH.getValue()));
        }
    }

    private static void checkNumber(String inputString) {
        if (!inputString.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException(ErrorMessages.INPUT_NUMBER.getMessage());
        }
    }

    private static void checkUnique(String inputString) {
        if (inputString.chars().distinct().count() != Constants.NUMBERS_LENGTH.getValue()) {
            throw new IllegalArgumentException(ErrorMessages.INPUT_UNIQUE.getMessage());
        }
    }

}
