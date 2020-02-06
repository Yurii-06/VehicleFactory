package factory;

import factory.impl.FactoryProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.register(Config.class);
        ctx.scan("factory");
        ctx.refresh();

//        VehicleFactory factory = ctx.getBean(BicycleFactory.class);
//        VehicleFactory carFactory = ctx.getBean(CarFactory.class);
//
//        final var carFactoryVehicle = carFactory.createVehicle();
//        System.out.println(carFactoryVehicle.toString());
//        carFactoryVehicle.go();
//
//
//        final var vehicle = factory.createVehicle();
//        final var vehicle2 = factory.createVehicle();
//        System.out.println(vehicle.toString());
//        System.out.println(vehicle2.toString());
//        vehicle.go();

        final var bean = ctx.getBean(FactoryProvider.class);
        final var car = bean.getFactory("car");
        car.createVehicle().go();


    }
}
