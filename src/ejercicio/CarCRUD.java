package ejercicio;

import java.util.List;

public interface CarCRUD {

    public void save(Car car);

    public List<Car> findAll();

    public void delete(Car car);
}
