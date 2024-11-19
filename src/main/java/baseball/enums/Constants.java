package baseball.enums;

public enum Constants {

    NUMBERS_LENGTH(3),

    NUMBER_LOWERBOUND(1),
    NUMBER_UPPERBOUND(9),
    ;

    private final int value;

    Constants(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
