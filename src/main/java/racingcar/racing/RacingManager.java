package racingcar.racing;

import racingcar.car.Car;
import racingcar.common.util.RandomUtils;
import racingcar.result.ResultInfo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RacingManager {
    private final List<Car> cars;
    private final int lapCount;
    private final List<ResultInfo> resultInfos;

    public RacingManager(RacingInfo racingInfo) {
        this.cars = racingInfo.getCarList()
                .stream()
                .map(Car::new)
                .collect(Collectors.toList());
        this.lapCount = racingInfo.getLapCount();
        this.resultInfos = IntStream.range(0, this.lapCount)
                .boxed()
                .map(i -> new ResultInfo())
                .collect(Collectors.toList());
    }

    public List<String> getCars() {
        return this.getCars();
    }

    public List<ResultInfo> getResultInfos() {
        return this.resultInfos;
    }

    public void startRace() {
        IntStream.range(0, lapCount)
                .boxed()
                .forEach(this::moveCars);
    }

    protected void moveCars(int lapIndex) {
        cars.forEach(car -> this.resultInfos.get(lapIndex).addResult(car.getName(), car.move(RandomUtils.getNextInt())));
    }
}
