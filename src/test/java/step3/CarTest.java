package step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step3.model.Car;
import static org.junit.jupiter.api.Assertions.*;
public class CarTest {

    @Test
    @DisplayName("initial car position 이 0으로 잘 들어가는지 테스트")
    void carInitialPositionTest() {
        Car car = new Car();
        assertEquals(car.getPosition(), 0);
    }
}
