package CreationalPattern.AbstractFactoryPattern;

public class DogFactory extends PetAbstractFactory {

    private String name;
    private int age;

    public DogFactory(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Pet createPet() {
        return new Dog(name, age);
    }
}
