import static org.mockito.Mockito.*;

import org.example.bean.Car;
import org.example.bean.Engine;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void testCarStart() {
        Engine mockEngine = mock(Engine.class);
        Car car = new Car(mockEngine);

        car.start();
        verify(mockEngine).start();
    }
}
