package factory.impl;

import factory.cars.FactoryType;
import factory.cars.VehicleFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FactoryProvider {
    private VehicleFactory carFactory;
    private VehicleFactory bicycleFactory;

    public FactoryProvider(@Qualifier("carFactory") VehicleFactory carFactory, @Qualifier("bicycleFactory")VehicleFactory bicycleFactory) {
        this.carFactory = carFactory;
        this.bicycleFactory = bicycleFactory;
    }

    public VehicleFactory getFactory(FactoryType factoryType) {
        VehicleFactory factory;

        switch (factoryType) {
            case CAR:
                factory = carFactory;
                break;
            case BICYCLE:
                factory = bicycleFactory;
                break;
            default:
               throw new IllegalArgumentException("Invalid factory type!");
        }

        return factory;
    }
}
