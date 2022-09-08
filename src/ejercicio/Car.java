package ejercicio;

public class Car {

    String manufacturer;
    String model;
    int year;
    boolean km0;

    public Car(){
    }

    public Car(String manufacturer, String model, int year,boolean km0){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.km0 = km0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", km0=" + km0 +
                '}';
    }
}
