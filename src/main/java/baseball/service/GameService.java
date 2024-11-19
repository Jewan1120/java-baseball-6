package baseball.service;

import baseball.enums.Constants;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class GameService {

    public List<Integer> makeNumbers() {
        return Randoms.pickUniqueNumbersInRange(Constants.NUMBER_LOWERBOUND.getValue(),
                Constants.NUMBER_UPPERBOUND.getValue(), Constants.NUMBERS_LENGTH.getValue());
    }

    public List<Integer> makeNumbers(String inputString) {
        return inputString.chars().mapToObj(c -> c - '0').toList();
    }
}
