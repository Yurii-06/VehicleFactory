package factory;

import factory.cars.FactoryType;
import factory.cars.Vehicle;
import factory.config.Config;
import factory.impl.FactoryProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        FactoryType carFactoryType = FactoryType.CAR;
        FactoryType bicycleFactoryType = FactoryType.BICYCLE;

        final var bean = ctx.getBean(FactoryProvider.class);
        final var carFactory = bean.getFactory(carFactoryType);
        final var bicycleFactory = bean.getFactory(bicycleFactoryType);

        Vehicle car = carFactory.createVehicle();
        Vehicle bicycle = bicycleFactory.createVehicle();

        car.setType("Truck");
        bicycle.setType("Mountain");

        car.go();
        bicycle.go();
    }
}
