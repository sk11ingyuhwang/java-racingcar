package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Judgement {

    public void judge(final List<Car> cars) {
        int max = maxDriveLength(cars);

        for (Car car : cars) {
            if (max == car.getStep()) {
                System.out.println("최종 우승자: " + car.getName());
            }
        }
    }

    private int maxDriveLength(List<Car> cars) {
        return cars.stream().map(car -> car.getStep())
            .mapToInt(length -> Integer.valueOf(length))
            .max()
            .getAsInt();
    }

    private String carPosition(final Car car) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < car.getStep(); i++) {
            stringBuilder.append("-");
        }

        return stringBuilder.toString();
    }

    public void carsStatement(final List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + carPosition(car));
        }
    }
}
