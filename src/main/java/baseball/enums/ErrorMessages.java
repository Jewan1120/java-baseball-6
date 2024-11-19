package baseball.enums;

import java.text.MessageFormat;

public enum ErrorMessages {

    INPUT_EMPTY("빈 문자열, 혹은 null은 입력될 수 없습니다."),
    INPUT_LENGTH("문자열의 길이는 {0}이(가) 되어야 합니다."),
    INPUT_NUMBER("문자열은 숫자로만 이루어져야 합니다."),
    INPUT_UNIQUE("중복되지 않는 숫자로만 입력이 가능합니다."),
    ;

    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage(Object... params) {
        return MessageFormat.format("[ERROR] " + message, params);
    }
}
