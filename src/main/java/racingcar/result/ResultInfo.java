package racingcar.result;

import racingcar.car.Car;

import java.util.ArrayList;
import java.util.List;

public class ResultInfo {
    private final List<Car> results;

    public ResultInfo() {
        this.results = new ArrayList<>();
    }

    public void addResult(String name, int carPosition) {
        this.results.add(new Car(name, carPosition));
    }

    public List<Car> getResults() {
        return this.results;
    }
}
