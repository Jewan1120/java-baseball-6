package baseball.enums;

import java.text.MessageFormat;

public enum ViewMessages {

    // Input
    RPOMPT_NUMBERS("숫자를 입력해주세요 : "),
    PROMPT_RESTART("게임을 새로 시작하려면 {0}, 종료하려면 {1}를 입력하세요."),

    // Output
    GAME_START("숫자 야구 게임을 시작합니다."),
    GAME_END("{0}개의 숫자를 모두 맞히셨습니다! 게임 종료"),

    RESULT_STRIKE("{0}스트라이크"),
    RESULT_BALL("{0볼}"),
    RESULT_BALL_STRIKE("{0}볼 {1}스트라이크"),
    RESULT_NOTHING("낫싱"),
    ;

    private final String message;

    ViewMessages(String message) {
        this.message = message;
    }

    public String getMessage(Object... params) {
        return MessageFormat.format(message, params);
    }
}
