package racingcar.model.domain;

import java.util.List;
import racingcar.controller.dto.OutputDTO;

public class Racing {

    private final Cars cars;
    private final CarMoveBehavior carMoveBehavior;

    public Racing(final Cars cars, final CarMoveBehavior carMoveBehavior) {
        this.cars = cars;
        this.carMoveBehavior = carMoveBehavior;
    }

    public List<OutputDTO> drive() {
        return cars.drive(carMoveBehavior);
    }
}

