package creative_mode.builder.builders;

import creative_mode.builder.cars.CarType;
import creative_mode.builder.components.Engine;
import creative_mode.builder.components.GPSNavigator;
import creative_mode.builder.components.Transmission;
import creative_mode.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
