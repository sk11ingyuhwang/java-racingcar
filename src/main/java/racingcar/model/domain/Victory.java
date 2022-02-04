package racingcar.model.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Victory {

    private final List<Car> victories;

    private Victory(final List<Car> victories) {
        this.victories = victories;
    }

    public static Victory maxCheck(final Cars cars) {

        int max = maxDriveLength(cars);
        return new Victory(cars.carIsMaxCheck(max));
    }

    private static int maxDriveLength(final Cars cars) {
        return cars.carMaxDistance();
    }

    public List<Car> victory() {
        return Collections.unmodifiableList(victories);
    }

}
