package racingcar;

import racingcar.common.util.InputUtils;
import racingcar.racing.RacingInfo;
import racingcar.racing.RacingManager;
import racingcar.result.ResultViewManager;

public class RacingMain {
    public static void main(String[] args) {
        RacingInfo racingInfo = new RacingInfo(
                InputUtils.getStringValue("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."),
                InputUtils.getIntValue("시도할 회수는 몇 회 인가요?")
        );
        RacingManager racingManager = new RacingManager(racingInfo);
        racingManager.startRace();

        ResultViewManager resultViewManager = new ResultViewManager(racingManager);
        resultViewManager.drawingCars();
    }
}
