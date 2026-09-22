package dmit2015.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

class CircleTest {

    @ParameterizedTest
    @CsvSource({
            "4, 50.27",
            "5, 78.54"
    })
    void area_returnsExpectedArea(double radius, double expectedArea) {
        Circle circle = new Circle();
        circle.setRadius(radius);

        assertThat(circle.area())
                .isCloseTo(expectedArea, within(0.01));
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

    @ParameterizedTest
    @ValueSource(doubles = {0, -5})
    void setRadius_whenInvalid_throwsException(double invalidRadius) {
        Circle circle = new Circle();

        assertThatThrownBy(() -> circle.setRadius(invalidRadius))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void setRadius_whenInvalid_preservesPreviousRadius() {
        Circle circle = new Circle();
        circle.setRadius(4);

        assertThatThrownBy(() -> circle.setRadius(-5))
                .isInstanceOf(IllegalArgumentException.class);

        assertThat(circle.getRadius()).isEqualTo(4.0);
    }
}