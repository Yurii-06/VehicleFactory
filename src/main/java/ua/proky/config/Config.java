package ua.proky.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ua.proky.vehicle.Bicycle;
import ua.proky.vehicle.Car;

@ComponentScan("ua")
@Configuration
public class Config {

    @Scope("prototype")
    @Bean
    public Bicycle bicycle() {
        return new Bicycle();
    }

    @Scope("prototype")
    @Bean
    public Car car() {
        return new Car();
    }

}
