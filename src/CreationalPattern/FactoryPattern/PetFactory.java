package CreationalPattern.FactoryPattern;

public class PetFactory {
    public static Pet getPet(Anymal type, String name, int age) {
        if ( Anymal.DOG == type ) {
            return new Dog(name, age);
        }
        else if ( Anymal.CAT == type ) {
            return new Cat(name, age);
        }

        return null;
    }

}
