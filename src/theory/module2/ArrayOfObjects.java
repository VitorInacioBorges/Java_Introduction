package theory.module2;
/* Making an array and an array list of objects */
public class ArrayOfObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Vitor", "Dodge", "Challenger", 1998);
        Car car2 = new Car("Anna", "Mini", "Cooper", 2017);
        Car car3 = new Car("Wesley", "Volkswagen", "Saveiro", 2013);

        Car[] cars = {car1, car2, car3};

        for(Car car : cars){ // for every car object inside cars
            car.specifications(); // specify the car
        }
    }
}
