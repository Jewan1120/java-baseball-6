package baseball.enums;

public enum Constants {

    NUMBERS_LENGTH(3),

    NUMBER_LOWERBOUND(1),
    NUMBER_UPPERBOUND(9),

    BALL_INDEX(0),
    STRIKE_INDEX(1),

    RESTART_YES(1),
    RESTART_NO(2),
    ;

    private final int value;

    Constants(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
