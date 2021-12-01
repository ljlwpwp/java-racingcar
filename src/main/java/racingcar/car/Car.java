package racingcar.car;

public class Car {
    private static final int DEFAULT_POSITION = 1;
    private static final int MOVABLE_CONDITION = 4;

    private int position;
    private String name;

    public Car(String name) {
        this.position = DEFAULT_POSITION;
        this.name = name;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public int move(int random) {
        if (random >= MOVABLE_CONDITION) {
            return ++this.position;
        }
        return this.position;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }
}
