# 숫자 야구

## 1️⃣기능 요구 사항
기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.
- 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
  - 예) 상대방(컴퓨터)의 수가 425일 때
    - 123을 제시한 경우 : 1스트라이크
    - 456을 제시한 경우 : 1볼 1스트라이크
    - 789를 제시한 경우 : 낫싱
- 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플레이어는 컴퓨터가 생각하고 있는 서로 다른 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
- 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
- 사용자가 잘못된 값을 입력할 경우 ` IllegalArgumentException`을 발생시킨 후 어플리케이션은 종료되어야 한다.

## 2️⃣고려 사항
- 결과를 출력할 때는 `볼`&rarr;`스트라이크`&rarr;`낫싱` 순으로 출력
- 게임 재시작 관련은 `flag`를 이용
- 게임이 끝났을 경우 안내 문구 출력
## 3️⃣기능 구현 목록
- 숫자 야구에 필요한 서로 다른 임의의 수 3자리 생성
- 사용자로부터 서로 다른 임의의 수 3자리 입력
- 사용자로부터 입력받은 문자열과 컴퓨터가 생성한 문자열을 비교
  - 숫자와 위치가 맞음: `스트라이크`
  - 숫자는 있지만 위치가 맞지 않음: `볼`
  - 아무것도 일치하는 것이 없음: `낫싱`
- 비교 결과 출력
- 게임을 새로 시작할
## 4️⃣예외 처리 목록
### `IllegalArgumentException`
- 빈 문자열, `null` 입력
- 비교를 위한 문자열을 입력받을 때
  - 입력된 문자열의 길이가 3자리가 아닌 입력
  - 숫자가 아닌 문자 입력
  - 중복된 숫자 입력
- 재시작 입력받을 때
  - 정해진 형식 (`1`, `2`)이 아닌 입력