package dmit2015.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CircleTest {

    @Test
    void area_whenRadiusIs5_returnsExpectedArea() {
        // Arrange
        Circle circle = new Circle();
        circle.setRadius(5);

        // Act
        double actual = circle.area();

        // Assert
        assertThat(actual).isCloseTo(78.54, within(0.01));
    }
}