package CreationalPattern.AbstractFactoryPattern;

public class CatFactory extends PetAbstractFactory {

    private String name;
    private int age;

    public CatFactory(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Pet createPet() {
        return new Cat(name,age);
    }
}
