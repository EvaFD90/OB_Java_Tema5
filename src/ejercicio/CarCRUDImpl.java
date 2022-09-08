package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class CarCRUDImpl implements CarCRUD{

    //estructura de datos
    List<Car> cars = new ArrayList<>();

    //implementacion metodos
    public void save(Car car){
        cars.add(car);
    }

    public List<Car> findAll(){
        return cars;
    }

    public void delete(Car car){
        cars.remove(car);
    }

}
