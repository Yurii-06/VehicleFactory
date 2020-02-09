package ua.proky;

import ua.proky.util.FactoryType;
import ua.proky.vehicle.Vehicle;
import ua.proky.config.Config;
import ua.proky.util.FactoryProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        FactoryType carFactoryType = FactoryType.CAR;
        FactoryType bicycleFactoryType = FactoryType.BICYCLE;

        final var factoryProvider = ctx.getBean(FactoryProvider.class);
        final var carFactory = factoryProvider.getFactory(carFactoryType);
        final var bicycleFactory = factoryProvider.getFactory(bicycleFactoryType);

        Vehicle car = carFactory.createVehicle();
        Vehicle bicycle = bicycleFactory.createVehicle();

        System.out.println(car.toString());
        System.out.println(bicycle.toString());

        car.setType("Truck");
        bicycle.setType("Mountain");

        car.go();
        bicycle.go();
    }
}
