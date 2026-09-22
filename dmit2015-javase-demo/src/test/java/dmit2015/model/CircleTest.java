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

    @Test
    void area_whenRadiusIs4_returnsExpectedArea() {
        // Arrange
        Circle circle = new Circle();
        circle.setRadius(4);

        // Act
        double actual = circle.area();

        //Assert
        assertThat(actual).isCloseTo(50.27, within(0.01));
    }

    @Test
    void constructor_setsDefaultRadiusTo1() {
        Circle circle = new Circle();

        assertThat(circle.getRadius()).isEqualTo(1.0);
    }

    @Test
    void setRadius_updatesRadius() {
        Circle circle = new Circle();
        circle.setRadius(7);

        assertThat(circle.getRadius()).isEqualTo(7.0);
    }
}