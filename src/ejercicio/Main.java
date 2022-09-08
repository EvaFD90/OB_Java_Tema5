package ejercicio;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Focus", 2007, false);
        Car car2 = new Car("Seat", "Ibiza", 2019, false);
        Car car3 = new Car("Peugeot", "3008", 2022, true);

        CarCRUDImpl carCrud = new CarCRUDImpl();

        carCrud.save(car1);
        carCrud.save(car2);
        carCrud.save(car3);

        List<Car> cars = carCrud.findAll();
        System.out.println(cars);


        carCrud.delete(car3);

    }
}
