package CreationalPattern.AbstractFactoryPattern;


public class TestPetFactory {
    public static void main(String[] args) {
        Pet dog = PetFactory.getPet(new DogFactory("로또", 7));
        Pet cat = PetFactory.getPet(new CatFactory("토토", 2));

        System.out.println("Dog : " + dog);
        System.out.println("Cat : " + cat);
    }
}
