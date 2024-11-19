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

    public List<Integer> judgeNumbers(List<Integer> computerNumbers, List<Integer> userNumbers) {
        int ball = 0;
        int strike = 0;
        for (int i = 0; i < Constants.NUMBERS_LENGTH.getValue(); i++) {
            if (computerNumbers.get(i).equals(userNumbers.get(i))) {
                strike++;
            }
            if (!computerNumbers.get(i).equals(userNumbers.get(i)) && computerNumbers.contains(userNumbers.get(i))) {
                ball++;
            }
        }
        return List.of(ball, strike);
    }
}
