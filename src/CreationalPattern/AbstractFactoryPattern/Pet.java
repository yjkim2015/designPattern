package CreationalPattern.AbstractFactoryPattern;

public abstract class Pet {

    public abstract String getName();
    public abstract int getAge();

    @Override
    public String toString() {
        return "NAME = " + this.getName() + ", AGE = " + this.getAge();
    }

}
