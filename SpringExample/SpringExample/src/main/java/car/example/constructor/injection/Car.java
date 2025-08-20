package car.example.constructor.injection;

public class Car {

    private Specification specification;

    //during instantiation spring container will search for this constructor
    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car details: " + specification);
    }
}
