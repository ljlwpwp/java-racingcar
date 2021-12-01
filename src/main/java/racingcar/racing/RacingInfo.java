package racingcar.racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingInfo {
    private final int lapCount;
    private final List<String> carList;

    public RacingInfo(String carList, int lapCount) {
        this.carList = Arrays.stream(carList.split(",")).collect(Collectors.toList());
        this.lapCount = lapCount;
    }

    public int getLapCount() {
        return this.lapCount;
    }

    public List<String> getCarList() { return this.carList; }
}
