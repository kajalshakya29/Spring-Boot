package car.example.setter.injection;

public class Car {

    private Specification specification;

    //during instantiation spring container will search for this constructor


    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car details: " + specification.toString());
    }
}
